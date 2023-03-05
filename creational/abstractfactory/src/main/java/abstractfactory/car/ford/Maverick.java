package abstractfactory.car.ford;

import abstractfactory.car.Car;

import java.math.BigDecimal;

public class Maverick extends Car {

    public Maverick() {
        this.name = "Maverick";
        this.style = "Pickup";
        this.price = new BigDecimal(240000);
    }

    @Override
    protected String infos() {
        return toString();
    }
}
