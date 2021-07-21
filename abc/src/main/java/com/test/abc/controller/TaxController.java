package com.test.abc.controller;

import com.test.abc.model.domain.Tax;
import com.test.abc.model.dto.TaxDTO;
import com.test.abc.repository.TaxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tax")
public class TaxController {

    @Autowired
    private TaxRepository taxRepository;

    @PostMapping("/saveTax")
    public ResponseEntity<Tax> saveTax(@RequestBody TaxDTO taxDTO) {
        Tax tax = new Tax();

        tax.setTaxAmount(taxDTO.getTaxAmount());
        tax.setDate(taxDTO.getDate());

        tax = taxRepository.saveAndFlush(tax);

        return new ResponseEntity<>(tax, HttpStatus.OK);
    }
}





