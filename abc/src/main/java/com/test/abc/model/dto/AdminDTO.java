package com.test.abc.model.dto;

import com.test.abc.model.domain.Admin;

public class AdminDTO {
    private Integer adminID;
    private String adminName;


    public AdminDTO() {
    }
    public AdminDTO(Admin admin) {
        this.adminID = admin.getAdminID();
    }

    public Integer getAdminID() {
        return adminID;
    }

    public void setAdminID(Integer adminID) {
        this.adminID = adminID;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }
}









