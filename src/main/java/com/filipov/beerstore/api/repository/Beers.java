package com.filipov.beerstore.api.repository;

import com.filipov.beerstore.api.model.Beer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Beers extends JpaRepository<Beer, Long> {
}
