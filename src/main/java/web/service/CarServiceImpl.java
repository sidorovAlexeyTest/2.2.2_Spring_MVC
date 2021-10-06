package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;

@Component("carServiceImpl")
public class CarServiceImpl implements CarService {

    private CarDao carDaoImpl;

    @Autowired
    public void setCarDao(@Qualifier("carDaoImpl") CarDao carDaoImpl) {
        this.carDaoImpl = carDaoImpl;
    }

    @Override
    public List<Car> getSomeCars(int count) {
        return carDaoImpl.getSomeCars(count);
    }
}
