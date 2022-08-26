import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.*;
public class input2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        String agetest = age < 19? "미성년 입니다." : "성인 입니다.";
        System.out.println(agetest);
        int num = sc.nextInt();
        boolean test1 = num % 2 == 0? true : false;
        System.out.println(test1);
    }
}
