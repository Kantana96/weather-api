package kz.main_module.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HourlyDTO extends BaseWeatherDTO{

    @JsonProperty("time")
    private String time;
    @JsonProperty("snow_cm")
    private double snowCm;
    @JsonProperty("will_it_rain")
    private int willItRain;
    @JsonProperty("chance_of_rain")
    private int chanceOfRain;
    @JsonProperty("will_it_snow")
    private int willItSnow;
    @JsonProperty("chance_of_snow")
    private int chanceOfSnow;

}

