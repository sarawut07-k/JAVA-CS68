package JAVA015;
public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota");
        car.startEngine();
        car.travelOnRoad("is travleling on the road.");

        System.out.println("----------------------------------------------");

        Train train = new Train("SRT Train");
        train.startEngine();
        train.travelOnRail("is traveling on the railway.");

        System.out.println("----------------------------------------------");

        Airplane airplane = new Airplane("Thai Airways");
        airplane.startEngine();
        airplane.travelInAir("Training to Bangkok.");
    }
}
