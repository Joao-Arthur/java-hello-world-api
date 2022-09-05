package com.learning_api.entities.country;

import java.util.Date;

public final class CountryEntity {
    public final String id;
    public final String name;
    public final String code;
    public final String capital;
    public final String continent;
    public final Date foundation;
    public final int size;
    public final int population;

    public CountryEntity(
            final String id,
            final String name,
            final String code,
            final String capital,
            final String continent,
            final Date foundation,
            final int size,
            final int population) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.capital = capital;
        this.continent = continent;
        this.foundation = foundation;
        this.size = size;
        this.population = population;
    }
}
