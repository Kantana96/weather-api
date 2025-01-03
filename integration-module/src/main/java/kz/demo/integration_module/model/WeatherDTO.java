package kz.demo.integration_module.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WeatherDTO {
    private LocationDTO location;
    private CurrentDTO current;
    private ForecastDTO forecast;
}
