package com.filipov.beerstore.api.service.exception;

import org.springframework.http.HttpStatus;

public class EntityNotFoundException extends BusinessException {

    public EntityNotFoundException() {
        super("beers-6", HttpStatus.BAD_REQUEST);
    }
}
