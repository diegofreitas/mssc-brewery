package com.springframework.msscbrewery.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BeerDTO {

    private UUID id;
    private String beerName;
    private String beerStyle;
    private Long upc;

}
