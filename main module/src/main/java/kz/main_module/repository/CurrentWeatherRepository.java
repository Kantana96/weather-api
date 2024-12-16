package kz.main_module.repository;

import kz.main_module.model.CurrentWeather;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrentWeatherRepository extends CrudRepository<CurrentWeather, Long> {
}
