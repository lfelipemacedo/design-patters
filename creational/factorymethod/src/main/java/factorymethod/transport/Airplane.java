package factorymethod.transport;

public class Airplane extends Transport {

    public Airplane() {
        this.name = "Airplane";
    }

    @Override
    public void deliver() {
        System.out.println("Delivered by Airplane");
    }
}
