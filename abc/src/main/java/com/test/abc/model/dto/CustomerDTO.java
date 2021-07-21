package com.test.abc.model.dto;

import com.test.abc.model.domain.Customer;

public class CustomerDTO {
    private Integer customerID;
    private String customerName;


    public CustomerDTO() {
    }
    public CustomerDTO(Customer customer) {
        this.customerID = customer.getCustomerID();
        this.customerName=customer.getCustomerName();
    }

    public Integer getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Integer customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}









