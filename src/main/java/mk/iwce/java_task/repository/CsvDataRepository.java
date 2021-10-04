package mk.iwce.java_task.repository;

import mk.iwce.java_task.model.Cars;
import mk.iwce.java_task.model.Drivers;

import java.io.IOException;
import java.util.List;

public interface CsvDataRepository {
    List<Cars> getAllCars();
    List<Drivers> getAllDrivers();
}
