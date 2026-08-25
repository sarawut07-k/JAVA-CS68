package JAVA015;

public class Train extends Vehicle {
    public Train(String brand) {
        super(brand);
    }

   
    @Override
    public void startEngine() {
        System.out.println("Train");
        System.out.println("Name : " + brand);
        System.out.println("Type : Train");
        System.out.println("Action : " + brand + " is starting.");
    }

    
}
