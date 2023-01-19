package eventservice.countrycityservice.business.mapper;

import eventservice.countrycityservice.business.repository.model.CityEntity;
import eventservice.countrycityservice.business.repository.model.CountryEntity;
import eventservice.countrycityservice.model.CityDto;
import eventservice.countrycityservice.model.CountryDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = CountryMapStruct.class)
public interface CityMapStruct {

    @Mapping(source = "countryEntity", target = "country")
    CityDto entityToDto(CityEntity cityEntity);

}
