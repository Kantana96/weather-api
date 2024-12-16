package kz.demo.integration_module.controller;

import kz.demo.integration_module.model.LocationDTO;
import kz.demo.integration_module.model.WeatherDTO;
import kz.demo.integration_module.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/integration/api/v1")
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping("/current")
    public WeatherDTO getCurrentWeather(@RequestParam("city") String city) {
        return weatherService.getCurrentWeather(city);
    }

    @GetMapping("/forecast")
    public WeatherDTO getForecastWeather(@RequestParam("city") String city, @RequestParam("days") Integer days) {
        return weatherService.getForecast(city, days);
    }

    @GetMapping("/search")
    public List<LocationDTO> searchLocation(@RequestParam("city") String city) {
        return weatherService.getLocation( city );
    }
}
