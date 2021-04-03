package com.springframework.msscbrewery.service;

import com.springframework.msscbrewery.model.CustomerDTO;

import java.util.UUID;

public interface CustomerService {
    default CustomerDTO getByID(UUID id) {
        return CustomerDTO.builder().id(id).name("Name").build();
    }
}
