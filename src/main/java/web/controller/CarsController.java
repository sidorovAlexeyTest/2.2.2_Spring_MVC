package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.List;
import java.util.Optional;

@Controller
public class CarsController {

    private CarService carServiceImpl;

    @Autowired
    private void setCarService(@Qualifier("carServiceImpl") CarService carServiceImpl) {
        this.carServiceImpl = carServiceImpl;
    }

    @GetMapping(value = "/cars")
    public String printSomeCars(ModelMap model, @RequestParam(value = "count", required = false) Optional<Integer> count) {
        List<Car> cars;
        cars = carServiceImpl.getSomeCars(count.orElse(-1));
        model.addAttribute("cars", cars);
        return "cars";
    }

}
