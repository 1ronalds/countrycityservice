package eventservice.countrycityservice.web.controller;

import eventservice.countrycityservice.business.service.CountryService;
import eventservice.countrycityservice.model.CountryDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1")
public class CountryController {

    private final CountryService service;

    @GetMapping("/countries")
    public ResponseEntity<List<CountryDto>> getCountryList(){
        return ResponseEntity.ok(service.findCountries());
    }

}
