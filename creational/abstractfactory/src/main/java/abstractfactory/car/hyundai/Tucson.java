package abstractfactory.car.hyundai;

import abstractfactory.car.Car;

import java.math.BigDecimal;

public class Tucson extends Car {

    public Tucson() {
        this.name = "Tucson";
        this.style = "SUV";
        this.price = new BigDecimal(221990);
    }

    @Override
    protected String infos() {
        return toString();
    }
}
