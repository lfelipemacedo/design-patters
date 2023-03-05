package abstractfactory.car.toyota;

import abstractfactory.car.Car;

import java.math.BigDecimal;

public class Hilux extends Car {

    public Hilux() {
        this.name = "Hilux";
        this.style = "Pickup";
        this.price = new BigDecimal(220690);
    }

    @Override
    protected String infos() {
        return toString();
    }
}
