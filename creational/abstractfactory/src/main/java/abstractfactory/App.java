package abstractfactory;

import abstractfactory.car.Car;
import abstractfactory.car.CarEnum;
import abstractfactory.factory.Factory;
import abstractfactory.factory.FactoryEnum;

public class App {
    public static void main(String[] args) throws Exception {
        Factory factory = Factory.getFactory(FactoryEnum.FORD);
        Car car = factory.createCar(CarEnum.RANGER);
        System.out.println(car.getName());
    }
}
