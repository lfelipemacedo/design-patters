package abstractfactory.car.volkswagen;

import abstractfactory.car.Car;

import java.math.BigDecimal;

public class Amarok extends Car {

    public Amarok() {
        this.name = "Amarok";
        this.style = "Pickup";
        this.price = new BigDecimal(300000);
    }

    @Override
    protected String infos() {
        return toString();
    }
}
