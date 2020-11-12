package com.zk.msscbeerservice.web.controller;

import com.zk.msscbeerservice.web.model.BeerDto;
import com.zk.msscbeerservice.web.model.BeerStyleEnum;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeerById(@PathVariable("beerId") UUID beerId){

        return new ResponseEntity<>(BeerDto.builder().id(beerId).beerName("Ginger Ale").beerStyle(BeerStyleEnum.ALE).build(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity saveNewBeer(@RequestBody BeerDto beerDto){
        // todo impl

        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity updateBeerById(@PathVariable("beerId") UUID beerId, @RequestBody BeerDto beerDto){
        // todo impl

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

}
