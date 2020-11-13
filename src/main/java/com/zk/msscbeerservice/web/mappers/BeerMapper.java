package com.zk.msscbeerservice.web.mappers;

import com.zk.msscbeerservice.domain.Beer;
import com.zk.msscbeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    Beer beerDtoToBeer(BeerDto beerDto);

    BeerDto beerToBeerDto(Beer beerDto);

}
