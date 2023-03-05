package abstractfactory.factory;

import abstractfactory.car.Car;
import abstractfactory.car.CarEnum;
import abstractfactory.car.ford.Maverick;
import abstractfactory.car.ford.Ranger;
import abstractfactory.car.ford.Territory;

public class FordFactory extends Factory {
    public Car createCar(CarEnum carEnum) throws Exception {
        return switch (carEnum) {
            case MAVERICK -> new Maverick();
            case RANGER -> new Ranger();
            case TERRITORY -> new Territory();
            default -> throw new IllegalArgumentException("Car does not exist");
        };
    }
}
