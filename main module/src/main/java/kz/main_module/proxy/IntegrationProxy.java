package kz.main_module.proxy;

import kz.main_module.model.Location;
import kz.main_module.model.WeatherDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "integration-module")
public interface IntegrationProxy {

    @GetMapping("/integration/api/v1/current")
    WeatherDTO getCurrent(@RequestParam String city);

    @GetMapping("/integration/api/v1/forecast")
    WeatherDTO getForecast(@RequestParam String city, @RequestParam Integer days);

    @GetMapping("/integration/api/v1/search")
    List<Location> getLocation(@RequestParam String city);
}
