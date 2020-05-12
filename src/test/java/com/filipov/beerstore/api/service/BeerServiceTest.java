package com.filipov.beerstore.api.service;

import com.filipov.beerstore.api.model.Beer;
import com.filipov.beerstore.api.model.BeerType;
import com.filipov.beerstore.api.service.exception.BeerAlreadyExistException;
import org.junit.Test;

import java.math.BigDecimal;

public class BeerServiceTest {

    @Test(expected = BeerAlreadyExistException.class)
    public void should_deny_creation_of_beer_that_exists() {
        BeerService beerService = new BeerService();

        Beer newBeer = new Beer();
        newBeer.setName("Heineken");
        newBeer.setType(BeerType.LAGER);
        newBeer.setVolume(new BigDecimal("355"));

        beerService.save(newBeer);
    }

}
