package kz.demo.integration_module.proxy;

import kz.demo.integration_module.model.LocationDTO;
import kz.demo.integration_module.model.WeatherDTO;
import kz.demo.integration_module.proxy.config.FeignClientConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name="ApiClient",url = "${feign.client.url}",configuration = FeignClientConfig.class)
public interface ApiIntegrationProxy {
    @GetMapping("/current.json")
    WeatherDTO getCurrentWeather(@RequestParam("q") String query);

    @GetMapping("/forecast.json")
    WeatherDTO getForecast(@RequestParam("q") String query, @RequestParam("days") Integer days);

    @GetMapping("/search.json")
    List<LocationDTO> searchLocation(@RequestParam("q") String city);

}
