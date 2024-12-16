package kz.main_module.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DailyDTO {
        @JsonProperty("maxtemp_c")
        private BigDecimal maxtempC;

        @JsonProperty("maxtemp_f")
        private BigDecimal maxtempF;

        @JsonProperty("mintemp_c")
        private BigDecimal mintempC;

        @JsonProperty("mintemp_f")
        private BigDecimal mintempF;

        @JsonProperty("avgtemp_c")
        private BigDecimal avgtempC;

        @JsonProperty("avgtemp_f")
        private BigDecimal avgtempF;

        @JsonProperty("maxwind_mph")
        private BigDecimal maxwindMph;

        @JsonProperty("maxwind_kph")
        private BigDecimal maxwindKph;

        @JsonProperty("totalprecip_mm")
        private BigDecimal totalprecipMm;

        @JsonProperty("totalprecip_in")
        private BigDecimal totalprecipIn;

        @JsonProperty("avgvis_km")
        private BigDecimal avgvisKm;

        @JsonProperty("avgvis_miles")
        private BigDecimal avgvisMiles;

        @JsonProperty("avghumidity")
        private BigDecimal avghumidity;

        @JsonProperty("daily_will_it_rain")
        private Integer dailyWillItRain;

        @JsonProperty("daily_chance_of_rain")
        private BigDecimal dailyChanceOfRain;

        @JsonProperty("daily_will_it_snow")
        private Integer dailyWillItSnow;

        @JsonProperty("daily_chance_of_snow")
        private BigDecimal dailyChanceOfSnow;

        @JsonProperty("condition")
        private ConditionDTO condition;

        @JsonProperty("uv")
        private Integer uv;
}
