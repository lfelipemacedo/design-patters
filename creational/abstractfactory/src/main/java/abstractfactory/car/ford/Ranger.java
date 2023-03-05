package abstractfactory.car.ford;

import abstractfactory.car.Car;

import java.math.BigDecimal;

public class Ranger extends Car {

    public Ranger() {
        this.name = "Ranger";
        this.style = "Pickup";
        this.price = new BigDecimal(319990);
    }

    @Override
    protected String infos() {
        return toString();
    }
}
