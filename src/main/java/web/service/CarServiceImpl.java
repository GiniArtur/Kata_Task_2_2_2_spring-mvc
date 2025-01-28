package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private final List<Car> cars = new ArrayList<>(List.of(
            new Car(1L, 2015, "Mazda", "jvbsjbvjs1"),
            new Car(2L, 2014, "Mazda", "jvbsjbvjs2"),
            new Car(3L, 2020, "Mazda", "jvbsjbvjs3"),
            new Car(4L, 2023, "Mazda", "jvbsjbvjs4"),
            new Car(5L, 2024, "Mazda", "jvbsjbvjs5")));

    @Override
    public List<Car> getCarsList(Integer count) {
        List<Car> carsList = new ArrayList<>();
        if (count == null || count <= 0) {
            count = cars.size();
        }
        for (int i = 0; i < count && i < cars.size(); i++) {   //-1
            carsList.add(cars.get(i));
        }
        return carsList;
    }
}
