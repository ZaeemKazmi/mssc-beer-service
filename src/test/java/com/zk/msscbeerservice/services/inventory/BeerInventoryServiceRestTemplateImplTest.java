package com.zk.msscbeerservice.services.inventory;

import com.zk.msscbeerservice.bootstrap.BeerLoader;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Disabled // utility for manual testing
@SpringBootTest
class BeerInventoryServiceRestTemplateImplTest {

    @Autowired
    BeerInventoryService beerInventoryService;

    @Test
    void getOnhandInventory() {

        //todo evolve to use UPC
//        Integer qoh = beerInventoryService.getOnhandInventory(BeerLoader.BEER_1_UUID);

//        System.out.println(qoh);

    }
}