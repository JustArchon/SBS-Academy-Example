import java.util.Scanner;
public class input3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age < 20){
            System.out.println("미성년 입니다.");
        }else{
            System.out.println("성인 입니다.");
        }
    }
}
