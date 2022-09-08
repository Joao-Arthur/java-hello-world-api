package com.learning_api.useCases.country;

import com.learning_api.entities.country.CountryEntity;

public interface CountryRepository {
    public CountryEntity readOne(final String id);

    public CountryEntity[] readMany();

    public void save(final CountryEntity country);

    public void update(final CountryEntity country);

    public void delete(final String id);
}
