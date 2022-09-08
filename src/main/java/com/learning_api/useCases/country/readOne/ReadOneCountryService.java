package com.learning_api.useCases.country.readOne;

import com.learning_api.entities.country.CountryEntity;
import com.learning_api.useCases.country.CountryRepository;

public final class ReadOneCountryService {
    private final CountryRepository countryRepository;
    private final String id;

    public ReadOneCountryService(
            final CountryRepository countryRepository,
            final String id) {
        this.countryRepository = countryRepository;
        this.id = id;
    }

    public CountryEntity readOne() {
        return this.countryRepository.readOne(id);
    }
}
