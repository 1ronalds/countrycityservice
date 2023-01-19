package eventservice.countrycityservice.web.controller;

import eventservice.countrycityservice.business.service.CityService;
import eventservice.countrycityservice.model.CityDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1")
public class CityController {

    private final CityService service;

    @GetMapping("/cities/{country-id}")
    public ResponseEntity<List<CityDto>> getCityList(@PathVariable("country-id") Long countryId){
        return ResponseEntity.ok(service.findCities(countryId));
    }

}
