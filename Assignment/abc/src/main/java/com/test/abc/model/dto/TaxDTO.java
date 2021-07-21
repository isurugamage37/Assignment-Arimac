package com.test.abc.model.dto;

import com.test.abc.model.domain.Tax;

public class TaxDTO {
    private Integer taxID;
    private String taxAmount;
    private String date;

    public TaxDTO() {
    }
    public TaxDTO(Tax tax) {
        this.taxID = tax.getTaxID();
    }

    public Integer getTaxID() {
        return taxID;
    }

    public void setTaxID(Integer taxID) {
        this.taxID = taxID;
    }

    public String getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(String taxAmount) {
        this.taxAmount = taxAmount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}









