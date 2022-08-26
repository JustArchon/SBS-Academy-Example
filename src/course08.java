public class course08 {
    public static void main(String[] args) {
        gugudan();
    }
    public static void legacy(){
        int n = 1;
        boolean WB = true;
        while(WB){
            if (n == 5){
                WB = false;
            }
            System.out.println("lol");
            n++;
        }
    }
    public static void Whiletest(){
        for(int i = 1; i <= 10; i++){
            System.out.println(i);
            if (i == 5) {
                break;
            }
        }
    }
    public static void Whiletest2(){
        int sum = 0;
        for(int i = 1; i <= 10; i++){
            if(sum > 10){
                break;
            }
            System.out.println("숫자: " + i);
            sum += i;
            System.out.println("합 : " + sum);
        }
    }
    public static void Whiletest3(){
        int n = 0;
        while(n < 10){
            n++;
            if(n==5){
                continue;
            }
            System.out.println(n);
        }
    }
    public static void Whiletest4(){
        int sum = 0;
        for(int i = 1; i <= 10; i++){
            if(i % 2 == 0){
                continue;
            }
            sum += i;
            System.out.println("숫자: " + i);
            System.out.println("합 : " + sum);
        }
    }
    public static void gugudan(){
        for(int i = 1; i <= 9; i++){
            if(i % 2 == 0){
                continue;
            }
            for(int j = 1; j <=9; j++){
                System.out.println(String.format("%d X %d = %d",i,j,i*j));
            }
        }
    }
}
