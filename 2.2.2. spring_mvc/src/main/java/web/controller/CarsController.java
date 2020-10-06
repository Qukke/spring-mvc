package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

    private static List<Car> carList = new ArrayList<>();
    static {
        carList.add(new Car(11241234L, "Tesla", "S"));
        carList.add(new Car(16567452L, "Tesla", "Roadster"));
        carList.add(new Car(38987654L, "Tesla", "X"));
        carList.add(new Car(41234156L, "Tesla", "Y"));
        carList.add(new Car(59876665L, "Tesla", "D"));
    }

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(name = "count", required = false) Integer count,
            ModelMap modelMap){
        if (count > 5) count = 5;
        if (count < 0) count = 0;
        modelMap.addAttribute("list", carList.subList(0, count));
        return "cars";
    }


}
