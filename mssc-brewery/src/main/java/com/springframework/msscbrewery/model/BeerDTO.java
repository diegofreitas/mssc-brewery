package com.springframework.msscbrewery.model;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class BeerDTO {

    private UUID id;
    private String beerName;
    private String beerStyle;
    private Long upc;

}
