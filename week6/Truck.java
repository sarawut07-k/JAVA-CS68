package week6;

public class Truck extends Vehicle {

    public Truck(String brand) {
        super(brand);
    }
    
    public void startEngine() {
        System.out.println(brand + ": Truck Started: ");
    }

     public void loadCargo() {
        System.out.println(brand + ":ต่อพ่วงหลังบรรทุกได้ 18 ตัน");
    }
    
}
