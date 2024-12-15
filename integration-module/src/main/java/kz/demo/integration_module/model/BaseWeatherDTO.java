package kz.demo.integration_module.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class BaseWeatherDTO {

    @JsonProperty("temp_c")
    private BigDecimal tempC;

    @JsonProperty("is_day")
    private Integer isDay;

    @JsonProperty("condition")
    private ConditionDTO condition;

    @JsonProperty("wind_kph")
    private BigDecimal windKph;

    @JsonProperty("wind_degree")
    private BigDecimal windDegree;

    @JsonProperty("wind_dir")
    private String windDir;

    @JsonProperty("pressure_mb")
    private BigDecimal pressureMb;

    @JsonProperty("precip_mm")
    private BigDecimal precipMm;

    @JsonProperty("humidity")
    private int humidity;

    @JsonProperty("cloud")
    private int cloud;

    @JsonProperty("feelslike_c")
    private BigDecimal feelsLikeC;

    @JsonProperty("windchill_c")
    private BigDecimal windChillC;

    @JsonProperty("heatindex_c")
    private BigDecimal heatIndexC;

    @JsonProperty("dewpoint_c")
    private BigDecimal dewPointC;

    @JsonProperty("vis_km")
    private BigDecimal visKm;

    @JsonProperty("uv")
    private BigDecimal uv;

    @JsonProperty("gust_kph")
    private BigDecimal gustKph;
}
