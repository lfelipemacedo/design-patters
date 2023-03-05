package abstractfactory;

import abstractfactory.car.Car;
import abstractfactory.car.CarEnum;
import abstractfactory.factory.Factory;
import abstractfactory.factory.FactoryEnum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

class FordFactoryTest {

    public Factory factory = Factory.getFactory(FactoryEnum.FORD);

    @Test
    void testMaverick() throws Exception {
        Car car = factory.createCar(CarEnum.MAVERICK);

        Assertions.assertEquals("Maverick", car.getName());
        Assertions.assertEquals("Pickup", car.getStyle());
        Assertions.assertEquals(new BigDecimal(240000), car.getPrice());
    }

    @Test
    void testRanger() throws Exception {
        Car car = factory.createCar(CarEnum.RANGER);

        Assertions.assertEquals("Ranger", car.getName());
        Assertions.assertEquals("Pickup", car.getStyle());
        Assertions.assertEquals(new BigDecimal(319990), car.getPrice());
    }

    @Test
    void testTerritory() throws Exception {
        Car car = factory.createCar(CarEnum.TERRITORY);

        Assertions.assertEquals("Territory", car.getName());
        Assertions.assertEquals("SUV", car.getStyle());
        Assertions.assertEquals(new BigDecimal(216120), car.getPrice());
    }

    @Test
    void testCarNotExist() throws Exception {
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            factory.createCar(CarEnum.HB20);
        });

        Assertions.assertTrue(exception.getMessage().contains("Car does not exist"));
    }
}
