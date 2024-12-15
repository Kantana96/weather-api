package kz.demo.integration_module.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ForecastDTO {
    private List<ForecastDayDTO> forecastday;
}
