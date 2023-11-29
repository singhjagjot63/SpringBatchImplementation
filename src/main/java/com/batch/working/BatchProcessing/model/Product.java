package com.batch.working.BatchProcessing.model;

public class Product {

    private String productId;
    private String title;
    private String description;
    private String discount;
    private String price;
    private String discountedPrice;

    public Product(String productId, String title, String description, String discount, String price) {
        this.productId = productId;
        this.title = title;
        this.description = description;
        this.discount = discount;
        this.price = price;
    }

    public Product() {

    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getDiscountedPrice() {
        return discountedPrice;
    }

    public void setDiscountedPrice(String discountedPrice) {
        this.discountedPrice = discountedPrice;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
