package web.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Cars {

    private List<Car> cars;

    public Cars() {
        cars = new ArrayList<>();
        cars.add(new Car("Mazda", 1000, 1));
        cars.add(new Car("Toyota", 1800, 0));
        cars.add(new Car("Kia", 10500, 10));
        cars.add(new Car("Hundai", 6000, 5));
        cars.add(new Car("Audi", 800, 6));
    }

    public List<Car> getCars() {
        return cars;
    }

//    public List<Car> getSpecifiedCars(int quantity){
//        return cars.stream().limit(quantity).collect(Collectors.toList());
//    }
}
