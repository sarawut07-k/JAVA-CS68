package week4;
public class Animal {

    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println("กำลังกินอาหาร");
    }

    public void sleep() {
        System.out.println("กำลังนอน");
    }

    public void exercise() {
        System.out.println("กำลังขับถ่าย");
    }

    public void showInfo() {
        System.out.println("ชื่อ: " + name);
        System.out.println("อายุประมาณ : " + age + " ปี");
    }

}