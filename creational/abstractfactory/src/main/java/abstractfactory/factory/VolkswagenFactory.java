package abstractfactory.factory;

import abstractfactory.car.Car;
import abstractfactory.car.CarEnum;
import abstractfactory.car.volkswagen.Amarok;
import abstractfactory.car.volkswagen.Gol;
import abstractfactory.car.volkswagen.Polo;

public class VolkswagenFactory extends Factory {
    @Override
    public Car createCar(CarEnum carEnum) throws Exception {
        return switch (carEnum) {
            case AMAROK -> new Amarok();
            case GOL -> new Gol();
            case POLO -> new Polo();
            default -> throw new IllegalArgumentException("Car does not exist");
        };
    }
}
