package week4;

public class Dog extends Animal { 

    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public void bark() {
        System.out.println(name + " เห่า โฮ่งๆ");
    }

    public void showBreed() {
        System.out.println("สายพันธุ์: " + breed);
    }
    
}