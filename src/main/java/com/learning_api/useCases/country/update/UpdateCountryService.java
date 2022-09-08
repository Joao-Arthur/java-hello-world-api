package com.learning_api.useCases.country.update;

import com.learning_api.useCases.country.CountryRepository;
import com.learning_api.useCases.country.unsavedCountry.UnsavedCountry;
import com.learning_api.useCases.country.unsavedCountry.UnsavedCountryToCountry;

final class UpdateCountryService {
    private final CountryRepository countryRepository;
    private final UnsavedCountry unsavedCountry;

    public UpdateCountryService(
            final CountryRepository countryRepository,
            final UnsavedCountry unsavedCountry) {
        this.countryRepository = countryRepository;
        this.unsavedCountry = unsavedCountry;
    }

    public void update() {
        this.countryRepository.save(new UnsavedCountryToCountry(unsavedCountry).transform());
    }
}
