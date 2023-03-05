package factorymethod.transport;

public class Truck extends Transport {

    public Truck() {
        this.name = "Truck";
    }

    @Override
    public void deliver() {
        System.out.println("Delivered by Truck");
    }
}
