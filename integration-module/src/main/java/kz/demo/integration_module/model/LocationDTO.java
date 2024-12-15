package kz.demo.integration_module.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LocationDTO {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("region")
    private String region;
    @JsonProperty("country")
    private String country;
    @JsonProperty("lat")
    private Double latitude;
    @JsonProperty("lon")
    private Double longitude;
    @JsonProperty("tz_id")
    private String timezoneId;
    @JsonProperty("timezone")
    private String timezone;
    @JsonProperty("local_time_epoch")
    private Long localTimeEpoch;
    @JsonProperty("local_time")
    LocalDateTime localTime;
    @JsonProperty("url")
    private String url;

}
