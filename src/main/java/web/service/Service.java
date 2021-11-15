package web.service;

import web.model.Car;
import web.model.Cars;

import java.util.List;
import java.util.stream.Collectors;

public class Service {
    private Cars cars;

    public Service() {
        cars = new Cars();
    }

    public List<Car> getSpecifiedCars(int quantity){
        return cars.getCars().stream().limit(quantity).collect(Collectors.toList());
    }
}
