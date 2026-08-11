package week4;

public class Bird extends Animal {

    private String species;
    

    public Bird(String name, int age, String species) {
        super(name, age);
        this.species = species;
    }

    public void chirp() {
        System.out.println(name + " กำลังร้องจิ๊บๆ");
    }



    

    public void showSpecies() {
        System.out.println("ชนิด: " + species);
    }
    public void fly() {
    System.out.println(name + " กำลังบิน");
    }
    public void imitateSound() {
        System.out.println(name + " กำลังเลียนเสียงคน");
    }
    
}
