package kz.main_module.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AstroDTO {
    @JsonProperty("sunrise")
    private String sunrise;

    @JsonProperty("sunset")
    private String sunset;

    @JsonProperty("moonrise")
    private String moonrise;

    @JsonProperty("moonset")
    private String moonset;

    @JsonProperty("moon_phase")
    private String moonPhase;

    @JsonProperty("moon_illumination")
    private String moonIllumination;
}
