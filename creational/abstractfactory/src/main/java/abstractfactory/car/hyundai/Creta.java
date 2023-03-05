package abstractfactory.car.hyundai;

import abstractfactory.car.Car;

import java.math.BigDecimal;

public class Creta extends Car {

    public Creta() {
        this.name = "Creta";
        this.style = "Sedan";
        this.price = new BigDecimal(200000);
    }

    @Override
    protected String infos() {
        return toString();
    }
}
