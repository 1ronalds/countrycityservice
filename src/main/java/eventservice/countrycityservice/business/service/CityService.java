package eventservice.countrycityservice.business.service;

import eventservice.countrycityservice.model.CityDto;

import java.util.List;

public interface CityService {
    List<CityDto> findCities(Long countryId);
}
