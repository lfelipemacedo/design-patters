package abstractfactory.car.hyundai;

import abstractfactory.car.Car;

import java.math.BigDecimal;

public class HB20 extends Car {

    public HB20() {
        this.name = "HB20";
        this.style = "Hatch";
        this.price = new BigDecimal(117090);
    }

    @Override
    protected String infos() {
        return toString();
    }
}
