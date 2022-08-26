package AbstractTest;

public class Mains {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Dog dog1 = new Dog();
        
        cat1.drink();
        cat1.eat();
        cat1.sleep();
        cat1.run(10);
        cat1.hind("상자");
        System.out.println("");
        dog1.drink();
        dog1.eat();
        dog1.sleep();
        dog1.run(20);
        dog1.hind("소파");
    }
}
