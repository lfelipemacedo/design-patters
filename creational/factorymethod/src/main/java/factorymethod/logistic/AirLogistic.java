package factorymethod.logistic;

import factorymethod.transport.Airplane;
import factorymethod.transport.Transport;

public class AirLogistic implements Logistic {
    @Override
    public Transport createTransport() {
        return new Airplane();
    }
}
