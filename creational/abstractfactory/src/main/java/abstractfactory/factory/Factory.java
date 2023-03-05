package abstractfactory.factory;

import abstractfactory.car.Car;
import abstractfactory.car.CarEnum;

public abstract class Factory {
    abstract public Car createCar(CarEnum carEnum) throws Exception;

    public static Factory getFactory(FactoryEnum factoryEnum) {
        return switch (factoryEnum) {
            case FORD -> new FordFactory();
            case HYUNDAI -> new HyundaiFactory();
            case TOYOTA -> new ToyotaFactory();
            case VOLKSWAGEN -> new VolkswagenFactory();
            default -> throw new IllegalArgumentException("Factory does not exist");
        };
    }
}
