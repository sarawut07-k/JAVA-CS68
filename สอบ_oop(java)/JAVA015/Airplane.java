package JAVA015;

public class Airplane extends Vehicle implements Flyable {
    public Airplane(String brand) {
        super(brand);
    }

    @Override
    public void startEngine() {
        System.out.println("Airplane");
        System.out.println("Name : " + brand);
        System.out.println("Type : Airplane");
        System.out.println("Action : " + brand + " is starting.");
    }

    @Override
    public void travelInAir(String destination) {
        System.out.println("Action : " + brand + " is flying to " + destination);
    }
}