package com.filipov.beerstore.api.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.EqualsAndHashCode.Include;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@SequenceGenerator(name = "beer_seq", sequenceName = "beer_seq", allocationSize = 1)
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Beer {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "beer_seq")
    @Include
    private Long id;

    private String name;
    private BeerType type;
    private BigDecimal volume;

}
