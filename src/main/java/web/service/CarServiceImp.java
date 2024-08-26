package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImp implements CarService {

    private final List<Car> carList = Arrays.asList(
            new Car("Audi", "A3", 2016),
            new Car("BMW", "X5", 2016),
            new Car("Audi", "A2", 2005),
            new Car("Mazda", "3", 2015),
            new Car("Audi", "Q7", 2019)
    );

    @Override
    public List<Car> getCars(Integer  count){
        if (count == null || count >= carList.size()) {
            return carList;
        }
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
