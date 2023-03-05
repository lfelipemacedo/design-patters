package abstractfactory.factory;

import abstractfactory.car.Car;
import abstractfactory.car.CarEnum;
import abstractfactory.car.toyota.Corolla;
import abstractfactory.car.toyota.Hilux;
import abstractfactory.car.toyota.Yaris;

public class ToyotaFactory extends Factory {
    @Override
    public Car createCar(CarEnum carEnum) throws Exception {
        return switch (carEnum) {
            case COROLLA -> new Corolla();
            case HILUX -> new Hilux();
            case YARIS -> new Yaris();
            default -> throw new IllegalArgumentException("Car does not exist");
        };
    }
}
