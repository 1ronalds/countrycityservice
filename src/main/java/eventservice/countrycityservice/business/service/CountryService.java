package eventservice.countrycityservice.business.service;

import eventservice.countrycityservice.model.CountryDto;

import java.util.List;

public interface CountryService {
    List<CountryDto> findCountries();
}
