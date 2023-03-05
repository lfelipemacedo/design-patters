package abstractfactory.car.toyota;

import abstractfactory.car.Car;

import java.math.BigDecimal;

public class Yaris extends Car {

    public Yaris() {
        this.name = "Yaris";
        this.style = "Sedan";
        this.price = new BigDecimal(94690);
    }

    @Override
    protected String infos() {
        return toString();
    }
}
