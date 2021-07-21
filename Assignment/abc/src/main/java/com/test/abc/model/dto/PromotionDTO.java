package com.test.abc.model.dto;

import com.test.abc.model.domain.Promotion;

public class PromotionDTO {
    private Integer promotionID;
    private String promotion;
    private String date;

    public PromotionDTO() {
    }
    public PromotionDTO(Promotion product) {
        this.promotionID = product.getPromotionID();
    }

    public Integer getPromotionID() {
        return promotionID;
    }

    public void setPromotionID(Integer promotionID) {
        this.promotionID = promotionID;
    }

    public String getPromotion() {
        return promotion;
    }

    public void setPromotion(String promotion) {
        this.promotion = promotion;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}









