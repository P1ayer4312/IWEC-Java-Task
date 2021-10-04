package mk.iwce.java_task.web.rest;

import mk.iwce.java_task.model.Cars;
import mk.iwce.java_task.model.Drivers;
import mk.iwce.java_task.repository.CsvDataRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api")
public class GetDataController {

    private final CsvDataRepository csvDataRepository;
    public GetDataController(CsvDataRepository csvDataRepository) {
        this.csvDataRepository = csvDataRepository;
    }

    @GetMapping("/cars")
    @ResponseBody
    public List<Cars> getCarsJson() {
        List<Cars> cars = this.csvDataRepository.getAllCars();
        return cars;
    }

    @GetMapping("/drivers")
    @ResponseBody
    public List<Drivers> getDriversJson() {
        List<Drivers> drivers = this.csvDataRepository.getAllDrivers();
        return drivers;
    }

}
