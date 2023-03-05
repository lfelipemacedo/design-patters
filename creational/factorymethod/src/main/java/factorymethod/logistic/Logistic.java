package factorymethod.logistic;

import factorymethod.enums.LogisticEnum;
import factorymethod.transport.*;

import java.util.EnumMap;
import java.util.Map;

public interface Logistic {

    static Logistic getLogistic(LogisticEnum logisticEnum) {
        return getLogisticMap().get(logisticEnum);
    }

    private static Map<LogisticEnum, Logistic> getLogisticMap() {
        Map<LogisticEnum, Logistic> logistics = new EnumMap<>(LogisticEnum.class);
        logistics.put(LogisticEnum.AIR, new AirLogistic());
        logistics.put(LogisticEnum.ROAD, new RoadLogistic());
        logistics.put(LogisticEnum.SEA, new SeaLogistic());

        return logistics;
    }

    Transport createTransport();

    default void deliver() {
        Transport transport = createTransport();
        transport.deliver();
    }
}
