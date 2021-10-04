package mk.iwce.java_task.repository.impl;

import mk.iwce.java_task.model.Cars;
import mk.iwce.java_task.model.Drivers;
import mk.iwce.java_task.repository.CsvDataRepository;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Repository
public class CsvDataRepositoryImpl implements CsvDataRepository {

    private final ClassLoader classloader = Thread.currentThread().getContextClassLoader();

    @Override
    public List<Cars> getAllCars() {
        InputStream is = classloader.getResourceAsStream("csv_files\\cars.csv");
        Scanner sc = new Scanner(is);
        List<Cars> cars = new ArrayList<>();
        while (sc.hasNextLine()) {
            String[] cells = sc.nextLine().split(",");
            try {
                Integer id = Integer.parseInt(cells[0]);
                cars.add(new Cars(id, cells[1], cells[2]));
            }
            catch (Exception ex) {}
        }

        return cars;
    }

    @Override
    public List<Drivers> getAllDrivers() {
        InputStream is = classloader.getResourceAsStream("csv_files\\drivers.csv");
        Scanner sc = new Scanner(is);
        List<Drivers> drivers = new ArrayList<>();
        while (sc.hasNextLine()) {
            String[] cells = sc.nextLine().split(",");
            try {
                Boolean active = Boolean.parseBoolean(cells[3].toLowerCase());
                if (!active)
                    continue;

                Integer id = Integer.parseInt(cells[0]);
                drivers.add(new Drivers(id, cells[1], cells[2], active));
            }
            catch (Exception ex) {}
        }

        return drivers;
    }
}