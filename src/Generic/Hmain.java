package Generic;

import java.util.LinkedList;

public class Hmain {
    public static void main(String[] args) {
        Test test = new Test();
        test.a = "10";
        test.b = 100;
        System.out.println(test.a);
        System.out.println(test.a.getClass().getName());
        System.out.println(test.b);
        System.out.println(test.b.getClass().getName());
        Test<Integer, String> test2 = new Test();
        test2.a = 100;
        test2.b = "100";
    }
}
