package com.springframework.msscbrewery.web;

import com.springframework.msscbrewery.model.BeerDTO;
import com.springframework.msscbrewery.model.CustomerDTO;
import com.springframework.msscbrewery.service.BeerService;
import com.springframework.msscbrewery.service.CustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RequestMapping("/api/v1/customer")
@RestController
public class CustomerController {

    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping(path = "{id}")
    public ResponseEntity<CustomerDTO> getBeer(@PathVariable("id") UUID id) {
        return ResponseEntity.ok(customerService.getByID(id));
    }
}
