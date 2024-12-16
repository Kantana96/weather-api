package kz.main_module.controller;

import jakarta.validation.constraints.NotNull;
import kz.main_module.exception.BadRequestException;
import kz.main_module.exception.NotFoundException;
import kz.main_module.model.Location;
import kz.main_module.proxy.IntegrationProxy;
import kz.main_module.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/main/api/v1")
public class LocationController {

    @Autowired
    private LocationService locationService;

    @Autowired
    private IntegrationProxy integrationProxy;

    @GetMapping("/location")
    public Location getLocationByName(@RequestParam("city") String city) throws NotFoundException {
        return locationService.getByName(city);
    }

    @GetMapping("/location/{id}")
    public Location getLocationById(@PathVariable Long id) throws NotFoundException {
        return locationService.getById(id);
    }

    @GetMapping("/location/list")
    public List<Location> getAllLocations() {
        return locationService.getAll();
    }

    @GetMapping("/location/search")
    public List<Location> searchLocationByName(@RequestParam("city") String city) {
        return integrationProxy.getLocation(city);
    }

    @DeleteMapping("/location/{id}")
    public void deleteLocationById(@PathVariable Long id) throws NotFoundException {
        locationService.deleteById(id);
    }

    @PutMapping("/location")
    public Location createLocation(@RequestBody @NotNull Location location) throws BadRequestException {
        return locationService.create(location);
    }

    @PostMapping("/location")
    public Location updateLocationById(@RequestBody @NotNull Location location) throws NotFoundException {
        return locationService.update(location);
    }
}
