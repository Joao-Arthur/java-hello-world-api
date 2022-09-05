package com.learning_api.useCases.country;

public interface CountryRepository {
    public void readOne();

    public void readMany();

    public void save();

    public void update();

    public void delete();
}
