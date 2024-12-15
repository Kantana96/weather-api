package kz.demo.integration_module.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WeatherDTO {
    private LocationDTO location;
    private CurrentDTO current;
    private ForecastDTO forecast;
}
