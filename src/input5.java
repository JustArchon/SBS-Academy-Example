import java.util.Scanner;
public class input5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 0;
        for(int i = 1; i <= 10; i++){
            num += i;
        }
        System.out.println(num);
        for (int i = 2; i <= 100; i++){
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }
        int dan = input.nextInt();
        for(int i = 1; i <= 9; i++){
            System.out.println(dan + " * " + i + " = " + dan*i);
        }

        for(int d = 1; d <= 9; d++){
            System.out.println(d + "단");
            for(int x = 1; x <= 9; x++){
                System.out.println(d + " X " + x + " = " + d*x);
            }
        }
        for(int i = 1; i <= 3; i++){
            System.out.println("");
            for(int j = 1; j <= 4; j++){
                System.out.print("*");
            }
        }
        System.out.println("");
        for(int i = 1; i <= 4; i++){
            for(int j = 1;  j <= i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
