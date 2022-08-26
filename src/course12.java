import java.util.Scanner;
public class course12 {
    public static void main(String[] args) {
        System.out.println(plus(2,5));
        printName();
        printLan("C언어");
        int num = ten();
        System.out.println(num);
        System.out.println(ten());
        System.out.println(minus(10,2));
        System.out.println(multiply(10,2));
        divison(10, 2);
    }

    public static int plus(int num1, int num2){
        return num1 + num2;
    }

    public static void printName(){
        System.out.println("Hello world!");
    }
    public static void printLan(String language){
        System.out.println(language + "는 재미있어!");
    }
    public static int ten(){
        return 10;
    }

    public static int minus(int num1, int num2){
        return num1 - num2;
    }
    public static int multiply(int num1, int num2){
        return num1 * num2;
    }
    public static void divison(int num1, int num2){
        System.out.println(num1 / num2);
    }
}
