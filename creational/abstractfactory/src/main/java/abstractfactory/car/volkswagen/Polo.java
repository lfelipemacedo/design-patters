package abstractfactory.car.volkswagen;

import abstractfactory.car.Car;

import java.math.BigDecimal;

public class Polo extends Car {

    public Polo() {
        this.name = "Polo";
        this.style = "Sedan";
        this.price = new BigDecimal(83990);
    }

    @Override
    protected String infos() {
        return toString();
    }
}
