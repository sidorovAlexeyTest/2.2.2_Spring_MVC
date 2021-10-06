package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Component("carDaoImpl")
public class CarDaoImpl implements CarDao{

    private static List<Car> cars = Arrays.asList(
            new Car("Volvo", 1989, true),
            new Car("Chevrolet", 1965, true),
            new Car("Toyota", 2020, false),
            new Car("Peujeot", 2000, true),
            new Car("Renualt", 1990, false)
    );

    @Override
    public List<Car> getSomeCars(int count) {
        if(count == -1 || count >= 5) count = cars.size();
        return cars.stream()
                .limit(count)
                .collect(Collectors.toList());
    }
}
