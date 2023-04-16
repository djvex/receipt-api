package com.heb.receiptapi;

public class Coupon {
    private String couponName;
    private long appliedSku;
    private double discountPrice;

    public String getCouponName() {
        return couponName;
    }

    public void setCouponName(String couponName) {
        this.couponName = couponName;
    }

    public long getAppliedSku() {
        return appliedSku;
    }

    public void setAppliedSku(long appliedSku) {
        this.appliedSku = appliedSku;
    }

    public double getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(double discountPrice) {
        this.discountPrice = discountPrice;
    }
}
