package kz.main_module.service;

import kz.main_module.exception.NotFoundException;
import kz.main_module.model.CurrentWeather;
import kz.main_module.model.Location;
import kz.main_module.model.WeatherDTO;
import kz.main_module.proxy.IntegrationProxy;
import kz.main_module.repository.CurrentWeatherRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class WeatherService {

    private final IntegrationProxy integrationProxy;
    private final LocationService locationService;
    private final CurrentWeatherRepository currentWeatherRepo;
    private final CurrentWeatherRepository currentWeatherRepository;

    public WeatherDTO getCurrent(Long locationId) throws NotFoundException {
        Location location = locationService.getById(locationId);
        Optional<CurrentWeather> optCurrent = currentWeatherRepo.findById(locationId);
        if (optCurrent.isPresent()) {
            WeatherDTO weatherDTO = new WeatherDTO();
            weatherDTO.setCurrent(optCurrent.get().getCurrent());
            weatherDTO.setLocation(location);
            return weatherDTO;
        }
        return getWeatherDTO(location);
    }

    public WeatherDTO getForecast(Long id, Integer days) throws NotFoundException {
        Location location = locationService.getById(id);
        return integrationProxy.getForecast(location.getName(), days);
    }

    private WeatherDTO getWeatherDTO(Location location) {
        WeatherDTO current = integrationProxy.getCurrent(location.getName());
        CurrentWeather currentWeather = new CurrentWeather();
        currentWeather.setCityId(location.getId());
        currentWeather.setCurrent(current.getCurrent());
        currentWeatherRepository.save(currentWeather);
        return current;
    }
}
