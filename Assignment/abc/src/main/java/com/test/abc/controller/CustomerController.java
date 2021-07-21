package com.test.abc.controller;

import com.test.abc.model.domain.Customer;
import com.test.abc.model.dto.CustomerDTO;
import com.test.abc.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @PostMapping("/saveCustomer")
    public ResponseEntity<Customer> saveCustomer(@RequestBody CustomerDTO customerDTO) {
        Customer customer = new Customer();

        customer.setCustomerName(customerDTO.getCustomerName());


        customer = customerRepository.saveAndFlush(customer);

        return new ResponseEntity<>(customer, HttpStatus.OK);
    }

    @GetMapping("/getCustomerByID/{customerID}")
    public ResponseEntity<CustomerDTO> getCustomerByID(@PathVariable Integer customerID) {
        Customer customer = customerRepository.getOne(customerID);
        return new ResponseEntity<>(new CustomerDTO(customer), HttpStatus.OK);
    }

    @GetMapping("/getAllCustomers")
    public ResponseEntity<List<CustomerDTO>> getAllCustomers() {
        List<Customer> customers = customerRepository.findAll();
        List<CustomerDTO> results = new ArrayList<>();

        customers.forEach(customer -> {
            results.add(new CustomerDTO(customer));
        });

        return new ResponseEntity<>(results, HttpStatus.OK);
    }
}





