package factorymethod.logistic;

import factorymethod.transport.Ship;
import factorymethod.transport.Transport;

public class SeaLogistic implements Logistic {
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
