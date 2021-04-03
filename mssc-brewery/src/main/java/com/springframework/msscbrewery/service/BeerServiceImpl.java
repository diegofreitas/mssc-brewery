package com.springframework.msscbrewery.service;

import com.springframework.msscbrewery.model.BeerDTO;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService{

    @Override
    public BeerDTO saveBeer(BeerDTO dto) {
        dto.setId(UUID.randomUUID());
        return dto;
    }
}
