import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
public class course13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        loop(10);
        greet();
        greet();
        greet();
        check(sc.nextInt());
    }
    public static void loop(int a){
        for(int i = 1; i <= a; i++){
            System.out.println(i);
        }

    }
    public static void greet(){
        System.out.println("안녕하세요.");
    }
    public static void check(int num){
        if(num == 0){
            System.out.println(num + "번이 입력되었습니다. 함수를 종료합니다.");
            return;
        }
        System.out.println(num);
    }

}
