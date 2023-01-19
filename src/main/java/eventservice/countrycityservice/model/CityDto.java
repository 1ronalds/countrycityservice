package eventservice.countrycityservice.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CityDto {

    @JsonIgnore
    private Long cityId;

    @JsonIgnore
    private CountryDto country;
    private String city;

}
