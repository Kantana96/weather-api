package kz.demo.integration_module.proxy;

import kz.demo.integration_module.model.LocationDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "main-module")
public interface MainProxy {

    @GetMapping("/main/api/v1/location/list")
    public List<LocationDTO> getAll();
}
