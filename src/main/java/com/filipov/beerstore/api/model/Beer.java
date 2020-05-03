package com.filipov.beerstore.api.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.EqualsAndHashCode.Include;

import javax.persistence.*;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
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

    @NotBlank
    private String name;

    @NotNull
    private BeerType type;

    @NotNull
    @DecimalMin(value = "0")
    private BigDecimal volume;

}
