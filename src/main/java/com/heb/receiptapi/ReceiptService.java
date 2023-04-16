package com.heb.receiptapi;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class ReceiptService {
    private final double TAX_RATE_IN_PERCENT = .0825;

    public Receipt calculateReceipt(List<Item> items, List<Coupon> coupons) throws RuntimeException {
        double grandTotal = 0;
        double subtotalAfterDiscounts = 0;
        double taxTotal = 0;
        double taxableSubtotal = 0;
        double tax = 0;
        double discountTotal = 0;
        double subtotalBeforeDiscounts = 0;

        Map<Long, Double> skuToDiscountMap = new HashMap<>();
        if (coupons != null && !coupons.isEmpty()) {
            skuToDiscountMap = coupons.stream()
                    .collect(Collectors.toMap(Coupon::getAppliedSku, Coupon::getDiscountPrice));
        }

        for (Item item : items) {
            double price = item.getPrice();
            subtotalBeforeDiscounts+= price;

            // apply discount if there is a coupon for the item
            double discount = 0;
            if (skuToDiscountMap.containsKey(item.getSku())) {
                discount = skuToDiscountMap.get(item.getSku());
                discountTotal+= discount;
            }

            price-= discount;
            if (price < 0) {
                throw new RuntimeException("Final price of an item cannot be negative.");
            }
            subtotalAfterDiscounts+= price;

            // apply tax if the item is taxable
            if (item.isTaxable()) {
                taxableSubtotal+= price;
                tax = price * TAX_RATE_IN_PERCENT;
                taxTotal+= tax;
                grandTotal+= tax;
            }
            grandTotal+= price;
        }

        Receipt receipt = new Receipt();
        receipt.setSubtotalBeforeDiscounts(subtotalBeforeDiscounts);
        receipt.setSubtotalAfterDiscounts(subtotalAfterDiscounts);
        receipt.setDiscountTotal(discountTotal);
        receipt.setTaxableSubtotalAfterDiscounts(taxableSubtotal);
        receipt.setTaxTotal(taxTotal);
        receipt.setGrandTotal(grandTotal);
        return receipt;
    }
}
