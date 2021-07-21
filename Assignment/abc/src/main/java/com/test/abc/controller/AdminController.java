package com.test.abc.controller;

import com.test.abc.model.domain.Admin;

import com.test.abc.model.dto.AdminDTO;
import com.test.abc.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminRepository adminRepository;

    @PostMapping("/saveAdmin")
    public ResponseEntity<Admin> saveAdmin(@RequestBody AdminDTO adminDTO) {
        Admin admin = new Admin();

        admin.setAdminName(adminDTO.getAdminName());


        admin = adminRepository.saveAndFlush(admin);

        return new ResponseEntity<>(admin, HttpStatus.OK);
    }
}





