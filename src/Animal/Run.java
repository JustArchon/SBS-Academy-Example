package Animal;

import Color.Color;
import Test.Human;


class Dog extends Animal{
    @Override
    public void walk() {
        System.out.println("개가 발발발 걷습니다.");
    }
}
public class Run{
    public static void main(String[] args){
        System.out.println(Valiable.a);
        System.out.println(Valiable.test());
        System.out.println(Valiable.test2());
        System.out.println(Valiable.test5());
        System.out.println(Valiable.test6());

        Human human = new Human("알리");
        Human human2 = new Human(12, true);
        System.out.println(human.getName());
        System.out.println(human2.getAge());
        System.out.println(human2.getMarried());
        Color C1 = new Color(142,112,34);
        Color C2 = new Color(56,42,42);
        Color C3 = Color.mixColor(C1,C2);
        System.out.println(String.format("%d ,%d , %d",C3.getRed(),C3.getBlue(),C3.getGreen()));
//        Animal cat = new Animal();
//        cat.setName("나비");
//        System.out.println(cat.getName());
//        cat.setAge(5);
//        System.out.println(cat.getAge());
//        cat.setColor("흰색");
//        System.out.println(cat.getColor());
//        cat.setGender("암");
//        System.out.println(cat.getGender());
//
//        Dog dog = new Dog();
//        dog.setName("방울이");
//        dog.setAge(7);
//        dog.setColor("검정");
//        dog.setGender("수");
//
//        System.out.println(dog.getName() + " " + dog.getAge() + " " + dog.getColor() + " " + dog.getGender());
//        dog.walk();
//        System.out.println(dog);
    }
}