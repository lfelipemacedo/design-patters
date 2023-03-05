package abstractfactory.car;

import java.math.BigDecimal;

public abstract class Car {

    protected String name;
    protected String style;
    protected BigDecimal price;

    public String getName() {
        return name;
    }

    public String getStyle() {
        return style;
    }

    public BigDecimal getPrice() {
        return price;
    }

    protected abstract String infos();
}
