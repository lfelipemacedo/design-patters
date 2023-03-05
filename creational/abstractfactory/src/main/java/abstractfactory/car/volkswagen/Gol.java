package abstractfactory.car.volkswagen;

import abstractfactory.car.Car;

import java.math.BigDecimal;

public class Gol extends Car {

    public Gol() {
        this.name = "Gol";
        this.style = "Hatch";
        this.price = new BigDecimal(79990);
    }
    @Override
    protected String infos() {
        return toString();
    }
}
