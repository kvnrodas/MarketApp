package com.gt.MarketApp.domain;

public class Category {

    private int categoryId;
    private String category;
    private boolean active;


    public int getCategoryId() {
        return categoryId;
    }

    public Category setCategoryId(int categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    public String getCategory() {
        return category;
    }

    public Category setCategory(String category) {
        this.category = category;
        return this;
    }

    public boolean isActive() {
        return active;
    }

    public Category setActive(boolean active) {
        this.active = active;
        return this;
    }
}
