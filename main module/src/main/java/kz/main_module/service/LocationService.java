package kz.main_module.service;

import kz.main_module.exception.BadRequestException;
import kz.main_module.exception.NotFoundException;
import kz.main_module.model.Location;
import kz.main_module.repository.LocationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class LocationService {

    private final LocationRepository locationRepository;

    public Location getById(Long id) throws NotFoundException {
        Optional<Location> optLocation = locationRepository.findById(id);
        if (optLocation.isEmpty()) {
            throw new NotFoundException("City by id " + id + " not found");
        }
        return optLocation.get();
    }

    public Location getByName(String name) throws NotFoundException {
        Optional<Location> optLocation = locationRepository.findByName(name);
        if (optLocation.isEmpty()) {
            throw new NotFoundException("City by name " + name + " not found");
        }
        return optLocation.get();
    }

    public List<Location> getAll() {
        return locationRepository.findAll();
    }

    public Location create(Location location) throws BadRequestException {
        if (locationRepository.existsById(location.getId())) {
            throw new BadRequestException("City already exists");
        }
        return locationRepository.save(location);
    }

    public Location update(Location location) throws NotFoundException {
        if (!locationRepository.existsById(location.getId())) {
            throw new NotFoundException("City by id " + location.getId() + " not found");
        }
        return locationRepository.save(location);
    }

    public void deleteById(Long id) throws NotFoundException {
        Optional<Location> optLocation = locationRepository.findById(id);
        if (optLocation.isEmpty()) {
            throw new NotFoundException("City by id " + id + " not found");
        }
        locationRepository.deleteById(id);
    }
}
