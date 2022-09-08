package com.learning_api.useCases.country.unsavedCountry;

import com.learning_api.core.uniqueIdentifier.UniqueIdentifier;
import com.learning_api.entities.country.CountryEntity;
import com.learning_api.entities.country.CountryEntityBuilder;

public final class UnsavedCountryToCountry {
    final UnsavedCountry unsavedCountry;

    public UnsavedCountryToCountry(final UnsavedCountry unsavedCountry) {
        this.unsavedCountry = unsavedCountry;
    }

    public CountryEntity transform() {
        return new CountryEntityBuilder()
                .setId(UniqueIdentifier.create())
                .setName(this.unsavedCountry.name)
                .setCode(this.unsavedCountry.code)
                .setCapital(this.unsavedCountry.capital)
                .setContinent(this.unsavedCountry.continent)
                .setFoundation(this.unsavedCountry.foundation)
                .setSize(this.unsavedCountry.size)
                .setPopulation(this.unsavedCountry.population)
                .build();
    }
}
