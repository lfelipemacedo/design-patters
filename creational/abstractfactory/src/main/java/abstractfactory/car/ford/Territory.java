package abstractfactory.car.ford;

import abstractfactory.car.Car;

import java.math.BigDecimal;

public class Territory extends Car {

    public Territory() {
        this.name = "Territory";
        this.style = "SUV";
        this.price = new BigDecimal(216120);
    }

    @Override
    protected String infos() {
        return toString();
    }
}
