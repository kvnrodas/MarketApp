package com.gt.MarketApp.domain;

import java.time.LocalDateTime;
import java.util.List;

public class Purchase {

    private int purchaseId;
    private String clientId;
    private LocalDateTime date;
    private String paymentMethod;
    private String comment;
    private String state;
    private List<PurchaseItem> item;

    public int getPurchaseId() {
        return purchaseId;
    }

    public Purchase setPurchaseId(int purchaseId) {
        this.purchaseId = purchaseId;
        return this;
    }

    public String getClientId() {
        return clientId;
    }

    public Purchase setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public Purchase setDate(LocalDateTime date) {
        this.date = date;
        return this;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public Purchase setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
        return this;
    }

    public String getComment() {
        return comment;
    }

    public Purchase setComment(String comment) {
        this.comment = comment;
        return this;
    }

    public String getState() {
        return state;
    }

    public Purchase setState(String state) {
        this.state = state;
        return this;
    }

    public List<PurchaseItem> getItem() {
        return item;
    }

    public Purchase setItem(List<PurchaseItem> item) {
        this.item = item;
        return this;
    }
}
