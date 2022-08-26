import java.util.Random;
import java.util.Scanner;
public class course09 {
    public static void main(String[] args) {
        //Whiletest1();
        //Randomdo();
        Game();
    }
    public static void legacy(){
        int n = 1;
        do{
            System.out.println("do : " + n);
            n++;
        }while(n > 10);

        int number = 0;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("숫자를 입력해주세요 : ");
            number = sc.nextInt();
        }while(number != 0);
        System.out.println("반복문 종료");
    }
    public static void Whiletest1(){
        Scanner sc = new Scanner(System.in);
        String input;
        do{
            System.out.println("반복을 종료하시겠습니까 : ");
            input = sc.nextLine();
        }while(input.equals("x"));
        System.out.println("반복문 종료");
    }
    public static void Random(){

        Random random = new Random();
        int num = random.nextInt(100);
        System.out.println(num);

        int i = 1;
        while(i<11){
            int x = random.nextInt(10);
            System.out.println(x);
            i++;
        }
    }
    public static void Randomdo(){
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int answer;
        String game;
        do{
            num1 = rd.nextInt(10);
            num2 = rd.nextInt(10);
            System.out.print(String.format("%d + %d = ",num1,num2));
            answer = sc.nextInt();
            if(answer == num1 + num2){
                System.out.println("정답입니다!");

            }
            else {
                System.out.println("정답이 아닙니다.");
            }
            System.out.println("계속 하시겠습니까? (Y,N)");
            game = sc.next();
        }while(game.equals("Y"));
    }
    public static void Game(){
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int answer;

        boolean state = true;
        System.out.println("돈을 넣어주세요 : ");
        int money = sc.nextInt();
        do{
            if(money <= 0){
                System.out.println("돈이 부족합니다.");
                state = false;
            }
            else{
                money -= 500;
                System.out.println("money : " + money);
                num1 = rd.nextInt(10);
                num2 = rd.nextInt(10);
                System.out.print(String.format("%d + %d = ",num1,num2));
                answer = sc.nextInt();
                if(answer == num1 + num2){
                    System.out.println("정답입니다!");

                }
                else {
                    System.out.println("정답이 아닙니다.");
                }
            }
        }while(state);
    }
}
