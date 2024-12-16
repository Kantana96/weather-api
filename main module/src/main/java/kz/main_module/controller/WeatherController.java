package kz.main_module.controller;

import kz.main_module.exception.NotFoundException;
import kz.main_module.model.WeatherDTO;
import kz.main_module.service.WeatherService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main/api/v1")
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class WeatherController {

    private final WeatherService weatherService;

    @GetMapping("/weather/current/{id}")
    public WeatherDTO getWeatherByCity(@PathVariable Long id) throws NotFoundException {
        return weatherService.getCurrent(id);
    }

    @GetMapping("/weather/forecast/{id}/{days}")
    public WeatherDTO getWeatherByDay(@PathVariable Long id, @PathVariable Integer days) throws NotFoundException {
        return weatherService.getForecast(id, days);
    }
}
