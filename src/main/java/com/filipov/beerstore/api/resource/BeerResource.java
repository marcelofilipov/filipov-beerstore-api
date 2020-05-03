package com.filipov.beerstore.api.resource;

import com.filipov.beerstore.api.model.Beer;
import com.filipov.beerstore.api.repository.Beers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/beers")
public class BeerResource {

    @Autowired
    private Beers beers;

    @GetMapping
    public List<String> all() {
        return Arrays.asList("Heineken", "Colorado Indiga", "Stella Artois");
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Beer create(@RequestBody Beer beer) {
        return beers.save(beer);
    }
}
