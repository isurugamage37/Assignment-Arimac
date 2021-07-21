package com.test.abc.model.dto;

import com.test.abc.model.domain.Product;

public class ProductDTO {
    private Integer productID;
    private String productName;
    private String price;
    private String expDate;
    private Integer promotionID;
    private Integer taxID;

    public ProductDTO() {
    }
    public ProductDTO(Product product) {

        this.productID = product.getProductID();
        this.productName = product.getProductName();
        this.price = product.getPrice();
        this.expDate = product.getExpDate();
        this.promotionID = product.getPromotion().getPromotionID();
        this.taxID = product.getTax().getTaxID();
    }

    public Integer getProductID() {
        return productID;
    }

    public void setProductID(Integer productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public Integer getPromotionID() {
        return promotionID;
    }

    public void setPromotionID(Integer promotionID) {
        this.promotionID = promotionID;
    }

    public Integer getTaxID() {
        return taxID;
    }

    public void setTaxID(Integer taxID) {
        this.taxID = taxID;
    }
}









