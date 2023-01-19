package eventservice.countrycityservice.business.service.impl;

import eventservice.countrycityservice.business.mapper.CityMapStruct;
import eventservice.countrycityservice.business.repository.CityRepository;
import eventservice.countrycityservice.business.service.CityService;
import eventservice.countrycityservice.model.CityDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CityServiceImpl implements CityService {

    private final CityRepository repository;
    private final CityMapStruct mapper;

    @Override
    public List<CityDto> findCities(Long countryId){
        System.out.println("!!!" + repository.findAllByCountryEntityCountryId(countryId));
        return repository.findAllByCountryEntityCountryId(countryId).stream().map(mapper::entityToDto).collect(Collectors.toList());

    }
}
