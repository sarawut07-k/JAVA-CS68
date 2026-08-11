package week4;
public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("ลูกชิ้น", 3, "พันธุ์ร็อทไวเลอร์");
        
        System.out.println("======Dog======");
        dog.showInfo();
        dog.eat();
        dog.bark();
        dog.sleep();
        dog.showBreed();
        dog.exercise();

        //-------------------------------------------------------
        
        Cat cat = new Cat("ทองแท่ง", 2, "สีขาว-ดำ");
        System.out.println("======Cat======");
        cat.showInfo();
        cat.eat();
        cat.meow();
        cat.sleep();
        cat.showCoLor();
        cat.exercise();

        //-------------------------------------------------------
        Tiger tiger = new Tiger("บิ๊ก", 5, "สีส้ม-ดำ");  
        System.out.println("======Tiger======");
        tiger.showInfo();
        tiger.eat();
        tiger.roar();
        tiger.sleep();
        tiger.showCoLor();
        tiger.exercise();
        tiger.hunt();
        tiger.strong();

        //-------------------------------------------------------
        Bird bird = new Bird("ยัมมี่", 1, "นกแก้ว");
        System.out.println("======Bird======");
        bird.showInfo();
        bird.eat();
        bird.chirp();
        bird.sleep();
        bird.showSpecies();
        bird.exercise();
        bird.fly();
        bird.imitateSound();
    }

}    