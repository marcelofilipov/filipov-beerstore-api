package com.filipov.beerstore.api.service;

import com.filipov.beerstore.api.model.Beer;
import com.filipov.beerstore.api.service.exception.BeerAlreadyExistException;

public class BeerService {

    public void save(Beer beer) {
        throw new BeerAlreadyExistException();
    }

}
