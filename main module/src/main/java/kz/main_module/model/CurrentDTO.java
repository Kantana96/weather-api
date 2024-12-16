package kz.main_module.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CurrentDTO extends BaseWeatherDTO {

    @JsonProperty("last_updated_epoch")
    private long lastUpdatedEpoch;

    @JsonProperty("last_updated")
    private String lastUpdated;

}
