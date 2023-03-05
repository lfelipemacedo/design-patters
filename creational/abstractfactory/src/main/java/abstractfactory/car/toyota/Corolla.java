package abstractfactory.car.toyota;

import abstractfactory.car.Car;

import java.math.BigDecimal;

public class Corolla extends Car {

    public Corolla() {
        this.name = "Corolla";
        this.style = "Sedan";
        this.price = new BigDecimal(146890);
    }

    @Override
    protected String infos() {
        return toString();
    }
}
