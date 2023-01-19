package eventservice.countrycityservice.business.repository;

import eventservice.countrycityservice.business.repository.model.CityEntity;
import eventservice.countrycityservice.business.repository.model.CountryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CityRepository extends JpaRepository<CityEntity, Long> {

    List<CityEntity> findAllByCountryEntityCountryId(Long countryId);
}
