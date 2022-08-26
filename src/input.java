import java.io.*;
import java.util.Scanner;
public class input {
    public static void main(String[] args) throws IOException{
//        // 조건 연산자를 사용해 15가 짝수면 true를 아니면 false를 출력해 주세요
//        int num = 15;
//        boolean test1 = (num % 2 == 0) ? true : false;
//        int age = 30;
//        String test2 = (age < 19) ? "미성년입니다" : "성인 입니다";
//        System.out.println(test1);
//        System.out.println(test2);

        Scanner scan = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("숫자를 입력해 주세요.");
        String number = scan.nextLine();
        System.out.println(number);
        System.out.println("숫자를 입력해 주세요.");
        String number2 = br.readLine();
        System.out.println(number2);

        // 조건 연산자를 사용해 15가 짝수면 true를 아니면 false를 출력해 주세요
        int num = scan.nextInt();
        boolean test1 = (num % 2 == 0) ? true : false;
        int age = scan.nextInt();
        String test2 = (age < 19) ? "미성년입니다" : "성인 입니다";
        System.out.println(test1);
        System.out.println(test2);
    }
}
