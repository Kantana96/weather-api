package kz.main_module.controller;

import kz.main_module.model.Location;
import kz.main_module.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main/api/v1")
public class MainController {

    @Autowired
    private LocationService locationService;
    @GetMapping("/location")

    public Location getLocationByName(@RequestParam("city") String city) {
        locationService.get()
    }
}
