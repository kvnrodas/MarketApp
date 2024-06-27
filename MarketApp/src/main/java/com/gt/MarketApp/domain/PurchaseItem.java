package com.gt.MarketApp.domain;

public class PurchaseItem {

    private int productId;
    private int quantity;
    private double total;
    private boolean active;


    public int getProductId() {
        return productId;
    }

    public PurchaseItem setProductId(int productId) {
        this.productId = productId;
        return this;
    }

    public int getQuantity() {
        return quantity;
    }

    public PurchaseItem setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    public double getTotal() {
        return total;
    }

    public PurchaseItem setTotal(double total) {
        this.total = total;
        return this;
    }

    public boolean isActive() {
        return active;
    }

    public PurchaseItem setActive(boolean active) {
        this.active = active;
        return this;
    }
}
