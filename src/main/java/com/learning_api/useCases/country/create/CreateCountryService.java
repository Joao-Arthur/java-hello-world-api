package com.learning_api.useCases.country.create;

import com.learning_api.useCases.country.CountryRepository;
import com.learning_api.useCases.country.unsavedCountry.UnsavedCountry;
import com.learning_api.useCases.country.unsavedCountry.UnsavedCountryToCountry;

final class CreateCountryService {
    private final CountryRepository countryRepository;
    private final UnsavedCountry unsavedCountry;

    public CreateCountryService(
            final CountryRepository countryRepository,
            final UnsavedCountry unsavedCountry) {
        this.countryRepository = countryRepository;
        this.unsavedCountry = unsavedCountry;
    }

    public void create() {
        this.countryRepository.save(new UnsavedCountryToCountry(unsavedCountry).transform());
    }
}
