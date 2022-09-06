package com.learning_api.web.country;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning_api.database.country.Country;
import com.learning_api.database.country.CountryRepository;

@RestController
@RequestMapping("country")
public class CountryController {
    @Autowired
    private CountryRepository countryRepository;

    @GetMapping
    public Country[] getMany() {
        return this.countryRepository.findAll().stream().toArray(Country[]::new);
    }

}
