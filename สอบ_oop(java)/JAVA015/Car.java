package JAVA015;
public class Car extends Vehicle {
    public Car(String brand) {
        super(brand);
    }
    

    @Override
    public void startEngine() {
        System.out.println("Car");
        System.out.println("Name : " + brand);
        System.out.println("Type : Car");
        System.out.println("Actoin : " + brand + " is starting");
    }


    
}
