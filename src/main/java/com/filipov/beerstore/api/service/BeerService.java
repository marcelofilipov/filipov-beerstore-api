package com.filipov.beerstore.api.service;

import com.filipov.beerstore.api.model.Beer;
import com.filipov.beerstore.api.repository.Beers;
import com.filipov.beerstore.api.service.exception.BeerAlreadyExistException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BeerService {

    private Beers beers;

    public BeerService(@Autowired Beers beers) {
        this.beers = beers;
    }

    public Beer save(final Beer beer) {
        Optional<Beer> beerByNameAndType = beers.findByNameAndType(beer.getName(), beer.getType());

        if(beerByNameAndType.isPresent()) {
            throw new BeerAlreadyExistException();
        }

        return beers.save(beer);
    }

}
