package eventservice.countrycityservice.business.service.impl;

import eventservice.countrycityservice.business.mapper.CountryMapStruct;
import eventservice.countrycityservice.business.repository.CountryRepository;
import eventservice.countrycityservice.business.service.CountryService;
import eventservice.countrycityservice.model.CountryDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CountryServiceImpl implements CountryService {

    private final CountryMapStruct mapper;
    private final CountryRepository repository;

    @Override
    public List<CountryDto> findCountries(){
        return repository.findAll().stream().map(mapper::entityToDto).collect(Collectors.toList());
    }
}
