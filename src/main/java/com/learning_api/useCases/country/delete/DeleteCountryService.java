package com.learning_api.useCases.country.delete;

import com.learning_api.useCases.country.CountryRepository;

public final class DeleteCountryService {
    private final CountryRepository countryRepository;
    private final String id;

    public DeleteCountryService(
            final CountryRepository countryRepository,
            final String id) {
        this.countryRepository = countryRepository;
        this.id = id;
    }

    public void delete() {
        this.countryRepository.delete(id);
    }
}
