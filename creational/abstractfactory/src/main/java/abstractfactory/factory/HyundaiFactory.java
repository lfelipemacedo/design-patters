package abstractfactory.factory;

import abstractfactory.car.Car;
import abstractfactory.car.CarEnum;
import abstractfactory.car.hyundai.Creta;
import abstractfactory.car.hyundai.HB20;
import abstractfactory.car.hyundai.Tucson;

public class HyundaiFactory extends Factory {
    @Override
    public Car createCar(CarEnum carEnum) throws Exception {
        return switch (carEnum) {
            case CRETA -> new Creta();
            case HB20 -> new HB20();
            case TUCSON -> new Tucson();
            default -> throw new IllegalArgumentException("Car does not exist");
        };
    }
}
