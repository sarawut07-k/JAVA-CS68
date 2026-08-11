package week4;
public class Tiger extends Animal{

    private String color;
    public Tiger(String name, int age, String color) {
        super(name, age);
        this.color = color;

    }

    public void roar(){
        System.out.println(name +" กำลังคำราม");
    }

    public void showCoLor(){
        System.out.println("สี : " + color);

    }

    public void hunt() {
    System.out.println(name + " กำลังล่าเหยื่อ");

    }
    public void strong() {
    System.out.println(name + " มีร่างกายแข็งแกร่ง");
    }
    
    public void showFangs() {
    System.out.println(name + " มีเขี้ยว");
    }
    
}
