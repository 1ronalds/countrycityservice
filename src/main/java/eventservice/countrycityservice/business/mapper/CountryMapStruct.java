package eventservice.countrycityservice.business.mapper;

import eventservice.countrycityservice.business.repository.model.CountryEntity;
import eventservice.countrycityservice.model.CountryDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CountryMapStruct {

    CountryDto entityToDto(CountryEntity countryEntity);

}
