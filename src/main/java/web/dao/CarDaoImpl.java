package web.dao;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.List;

@Component
public class CarDaoImpl implements CarDao {

    private static final List<Car> cars = List.of(
            new Car(123456L, "Ferrari", Car.carEquipment.COMFORT),
            new Car(67891011L, "Volkswagen", Car.carEquipment.BASIC),
            new Car(1213141516L, "Subaru", Car.carEquipment.STANDARD),
            new Car(171819202122L, "Lada", Car.carEquipment.BASIC),
            new Car(232425262728L, "Bestune", Car.carEquipment.COMFORT)
    );

    @Override
    public List<Car> getCars(Integer count) {
        if (count == null || count >= cars.size()) {
            return cars;
        }
        return cars.subList(0, count);
    }
}
