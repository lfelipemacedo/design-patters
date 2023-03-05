package factorymethod.transport;

public class Ship extends Transport {

    public Ship() {
        this.name = "Ship";
    }

    @Override
    public void deliver() {
        System.out.println("Delivered by Ship");
    }
}
