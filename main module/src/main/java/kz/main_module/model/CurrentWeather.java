package kz.main_module.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RedisHash(value = "CurrentWeather")
public class CurrentWeather {
    @Id
    @Indexed
    private Long cityId;
    private CurrentDTO current;
}
