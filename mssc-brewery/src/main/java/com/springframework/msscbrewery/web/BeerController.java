package com.springframework.msscbrewery.web;

import com.springframework.msscbrewery.model.BeerDTO;
import com.springframework.msscbrewery.service.BeerService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.UUID;

@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {

    private BeerService beerService;

    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }

    @GetMapping(path = "{beerId}")
    public ResponseEntity<BeerDTO> getBeer(@PathVariable("beerId") UUID beerId) {
        return ResponseEntity.ok(beerService.getByID(beerId));
    }

    @PostMapping
    public ResponseEntity handlePost(@RequestBody BeerDTO dto) {
        BeerDTO savedDto = beerService.saveBeer(dto);
        HttpHeaders headers =  new HttpHeaders();
        return ResponseEntity.created(URI.create("/api/v1/beer/" + savedDto.getId())).build();
    }

    @DeleteMapping(path = "{beerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("beerId") UUID beerId){
        //service delete
    }
}
