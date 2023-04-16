package com.heb.receiptapi;

public class Item {
    private String itemName;
    private long sku;
    private boolean isTaxable;
    private double price;
    private boolean ownBrand;

    public Item(String itemName, long sku, boolean isTaxable, double price, boolean ownBrand) {
        this.itemName = itemName;
        this.sku = sku;
        this.isTaxable = isTaxable;
        this.price = price;
        this.ownBrand = ownBrand;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public long getSku() {
        return sku;
    }

    public void setSku(long sku) {
        this.sku = sku;
    }

    public boolean isTaxable() {
        return isTaxable;
    }

    public void setTaxable(boolean taxable) {
        isTaxable = taxable;
    }

    public boolean isOwnBrand() {
        return ownBrand;
    }

    public void setOwnBrand(boolean ownBrand) {
        this.ownBrand = ownBrand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
