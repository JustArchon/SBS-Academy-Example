import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.sql.SQLOutput;

public class course03 {
    public static void main(String[] args) {
        // 정수
        int a = 10;
        // 실수
        double b = 5.6;
        // 문자
        char c ='a';
        // 논리
        boolean d = true;
        // 문자열
        String e = "abcd";
        // 상수
        Integer f = null;

        a = 100;
        System.out.println(a);

        final int test = 55;
        System.out.println(3+5);
        System.out.println(3-5);
        System.out.println(3*5);
        System.out.println(3/5);
        System.out.println(3%5);

        int korean = 80;
        int math = 100;
        int english = 75;

        int sum = korean + math + english;
        System.out.println("안녕하세요");
        System.out.println("sum : " + sum);
        int avg = sum / 3;
        System.out.println("avg : " + avg);

        int score = 99;
        int lastScore = ++score;
        System.out.println(lastScore);

        int lastScore2 =  --score;
        System.out.println(lastScore2);

        int number = 5;
        int number2 = 0;
        number2 = number;
        ++number2;
        System.out.println("number : " + number + " number2 : " + number2);

        int a1 = 5;
        int b1 = 5;
        System.out.println(a1++);
        System.out.println(a1);

        System.out.println(5 > 2);
        System.out.println(5 < 2);

        int age = 30;
        boolean result = age > 10;
        System.out.println(result);

        boolean result1 = 5 > 3 && 10 < 5;
        System.out.println(result1);

        boolean result2 = 5 > 3 || 10 < 5;
        System.out.println(result2);

        boolean result3 = !(5>3);
        System.out.println(result3);

        int numA = 10;
        numA += 2;
        System.out.println(numA);

        numA -= 2;
        System.out.println(numA);

        numA *= 2;
        System.out.println(numA);

        numA /= 2;
        System.out.println(numA);

        numA %= 2;
        System.out.println(numA);

        int last = (5<3)?  1 : 2;
        System.out.println(last);

        int age1 = 16;
        int age2 = 14;
        char result4 = (age1<age2)? 'T' : 'F';
        System.out.println(result4);
    }
}
