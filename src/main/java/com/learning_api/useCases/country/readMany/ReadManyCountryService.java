package com.learning_api.useCases.country.readMany;

import com.learning_api.entities.country.CountryEntity;
import com.learning_api.useCases.country.CountryRepository;

public final class ReadManyCountryService {
    private final CountryRepository countryRepository;
    private final String filters;

    public ReadManyCountryService(
            final CountryRepository countryRepository,
            final String filters) {
        this.countryRepository = countryRepository;
        this.filters = filters;
    }

    public CountryEntity[] readMany() {
        return this.countryRepository.readMany();
    }
}
