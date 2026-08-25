package JAVA015;
public class Vehicle {
     protected String brand;

     public Vehicle(String brand) {
        this.brand = brand;
     }
      public void startEngine() {
        System.out.println(brand + ": Engine Started: " );
    }

    public void stopEngine() {
        System.out.println(brand + ": Engine Stopped: " );
    }

    public void travelOnRoad(String destination) {
        System.out.println(brand + ": Traveling on the road to " + destination);
    }

    public void travelOnRail(String destination) {
        System.out.println(brand + ": Traveling on the rail to " + destination);
    }

    public void travelInAir(String destination) {
        System.out.println(brand + ": Traveling in the air to " + destination);
    }
    
}

    

