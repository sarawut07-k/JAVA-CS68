package week6;

public class Motorcycle extends Vehicle {

    public Motorcycle(String brand) {
        super(brand);
    }
    @Override
    public void startEngine() {
        System.out.println(brand + ": Motorcycle Engine Started: ");
    }
    
    
    public void fireEx(){
        System.out.println(brand + "มีท่อไอเสียอยู่ด้านท้าย ");
    }

    public void wheelie() {
        System.out.println(brand + ": Motorcycle is doing a wheelie!");
    }
    


    
}
