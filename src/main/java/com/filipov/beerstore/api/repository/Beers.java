package com.filipov.beerstore.api.repository;

import com.filipov.beerstore.api.model.Beer;
import com.filipov.beerstore.api.model.BeerType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface Beers extends JpaRepository<Beer, Long> {

    Optional<Beer> findByNameAndType(String name, BeerType type);

}
