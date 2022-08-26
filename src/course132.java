import java.util.Scanner;
public class course132 {
    public static void main(String[] args) {
        System.out.println(calculator());
    }

    public static int calculator() {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 숫자 : ");
        int num1 = sc.nextInt();
        System.out.print("두번째 숫자 : ");
        int num2 = sc.nextInt();
        sc.nextLine();
        System.out.print("사칙연산 연산자를 넣어주세요 : ");
        String Op = sc.nextLine();
        System.out.println("");
        switch (Op) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                return num1 / num2;
            default:
                System.out.println("지원하지 않는 매개변수 입니다.");
                break;
        }
        return 0;
    }
}