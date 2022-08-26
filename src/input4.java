import java.util.Scanner;
import java.util.InputMismatchException;
public class input4 {
    public static void main(String[] args) {
        //Test();
        //Test2();
        //Whiletest();
        //gugudantest();
        coffemachine();
        /*
        Scanner input = new Scanner(System.in);
        int month = 0;
            try {
                month = input.nextInt();
            } catch (InputMismatchException ime) {
                month = -1;
            }
            if (month == 2) {
                System.out.println("28일 입니다.");
            } else {
                switch (month % 2) {
                    case 0:
                        System.out.println("30일 입니다.");
                        break;
                    case 1:
                        System.out.println("31일 입니다.");
                        break;
                    default:
                        System.out.println("잘못된 입력입니다.");
                }
            }
         */
        }
        public static void Test(){
            int month = 0;
            Scanner input = new Scanner(System.in);
            System.out.println("월을 입력해 주세요 : ");
            try {
                month = input.nextInt();
            } catch (InputMismatchException ime) {
                month = 0;
            }
            switch(month){
                case 1: case 3: case 5: case 7: case 9: case 11:
                    System.out.println(month + "월은 31일 까지 입니다.");
                    break;
                case 4: case 6: case 8: case 10: case 12:
                    System.out.println(month + "월은 30일 까지 입니다.");
                    break;
                case 2:
                    System.out.println(month + "월은 28일 까지 입니다.");
                    break;
                default:
                    System.out.println("잘못된 입력입니다.");
                    break;
            }
        }
        public static void Test2(){
        int num = 0;
        int i = 1;
        num = num + 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10;
            System.out.println(num);
            num = 0;
        while(i <= 10){
            num += i;
            i++;
        }
            System.out.println(num);
            num = 0;
        for(int j = 1; j <= 10; j++){
            num += j;
            }
            System.out.println("1부터 10까지의 합은 " + num + "입니다.");
        int testnum = 1;
        while(testnum <= 10){
            System.out.println(testnum);
            testnum++;
        }
        testnum = 1;
        while(testnum <= 100){
            if(testnum % 2 == 0){
                System.out.println(testnum);
            }
            testnum++;
        }
        }
        public static void Whiletest(){
        int i = 2;
        int j = 1;
        while(i <= 9){
            while(j <= 9){
                System.out.println(i + " * " + j + " = " + i*j);
                j++;
            }
            i++;
            j = 1;
        }
    }
    public static void gugudantest(){
    Scanner input = new Scanner(System.in);
    int dan = 1;
    int i = 1;
    try{
        dan = input.nextInt();
    }catch (InputMismatchException ime){
        dan = 1;
    }
    while(i <= 9){
        System.out.println(String.format("%d * %d = %d", dan, i, dan * i));
        i++;
    }
    }
    public static void coffemachine(){
        Scanner input = new Scanner(System.in);
        int Cprice = 300;
        int money;
        int coffee = 0;
        System.out.println("자판기에 얼마를 넣을까요? : ");
        try{
            money = input.nextInt();
        }catch (InputMismatchException ime){
            System.out.println("비정상적인 값이 입력되었습니다.");
            money = 0;
        }
        while(money >= 300){
            money -= Cprice;
            coffee += 1;
            System.out.println(String.format("커피 %d잔, 잔돈 %d원", coffee, money));
        }
    }
}
