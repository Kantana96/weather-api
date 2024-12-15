package kz.demo.integration_module.service;

import kz.demo.integration_module.model.LocationDTO;
import kz.demo.integration_module.model.WeatherDTO;
import kz.demo.integration_module.proxy.ApiIntegrationProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeatherService {

    @Autowired
    private ApiIntegrationProxy proxy;

    public WeatherDTO getCurrentWeather(String city) {
        return proxy.getCurrentWeather(city);
    }

    public WeatherDTO getForecast(String city, Integer days) {
        return proxy.getForecast(city, days);
    }

    public List<LocationDTO> getLocation(String city) {
        return proxy.searchLocation( city );
    }
}
