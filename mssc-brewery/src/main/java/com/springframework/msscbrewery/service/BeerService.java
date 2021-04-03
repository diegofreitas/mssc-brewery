package com.springframework.msscbrewery.service;

import com.springframework.msscbrewery.model.BeerDTO;

import java.util.UUID;

public interface BeerService {
    default BeerDTO getByID(UUID beerId) {
        return BeerDTO.builder().id(beerId).beerName("Name").build();
    }
}
