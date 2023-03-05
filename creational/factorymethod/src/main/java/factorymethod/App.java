package factorymethod;

import factorymethod.logistic.Logistic;
import factorymethod.enums.LogisticEnum;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Logistic logistic = Logistic.getLogistic(LogisticEnum.ROAD);
        logistic.deliver();
    }
}
