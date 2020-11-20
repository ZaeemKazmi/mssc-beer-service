package com.zk.msscbeerservice.events;

import com.zk.msscbeerservice.web.model.BeerDto;

public class NewInventoryEvent extends BeerEvent {
    public NewInventoryEvent(BeerDto beerDto) {
        super(beerDto);
    }
}
