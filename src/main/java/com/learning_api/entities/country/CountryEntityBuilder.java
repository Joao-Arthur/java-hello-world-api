package com.learning_api.entities.country;

import java.util.Date;

public final class CountryEntityBuilder {
    private String id;
    private String name;
    private String code;
    private String capital;
    private String continent;
    private Date foundation;
    private int size;
    private int population;

    public CountryEntityBuilder setId(String id) {
        this.id = id;
        return this;
    }

    public CountryEntityBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public CountryEntityBuilder setCode(String code) {
        this.code = code;
        return this;
    }

    public CountryEntityBuilder setCapital(String capital) {
        this.capital = capital;
        return this;
    }

    public CountryEntityBuilder setContinent(String continent) {
        this.continent = continent;
        return this;
    }

    public CountryEntityBuilder setFoundation(Date foundation) {
        this.foundation = foundation;
        return this;
    }

    public CountryEntityBuilder setSize(int size) {
        this.size = size;
        return this;
    }

    public CountryEntityBuilder setPopulation(int population) {
        this.population = population;
        return this;
    }

    public CountryEntity build() {
        return new CountryEntity(
                this.id,
                this.name,
                this.code,
                this.capital,
                this.continent,
                this.foundation,
                this.size,
                this.population);
    }
}
