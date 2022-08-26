import java.util.Scanner;
public class course131 {
    public static void main(String[] args) {
        System.out.println(division(10,0));
        System.out.println(division(10,5));
        System.out.println(compare(300,200));
    }
    public static int division(int num1, int num2){
        if(num1 == 0 || num2 == 0){
            System.out.println("0으로 나눌수 없습니다. 기본값 0을 반환합니다.");
            return 0;
        }
        else {
            int div = num1 / num2;
            return div;
            //System.out.println(String.format("%d 나누기 %d 의 값은 어떤 수인가요? : ",num1,num2));
        }
    }
    public static int compare(int num1, int num2){
        if(num1 > num2){
            return num1;
        }
        else
        {
            return num2;
        }
    }
}
