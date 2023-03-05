package factorymethod.logistic;

import factorymethod.transport.Transport;
import factorymethod.transport.Truck;

public class RoadLogistic implements Logistic {
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
