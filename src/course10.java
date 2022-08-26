import java.util.Scanner;
public class course10 {
    public static void main(String[] args) {
        arraytest5();
    }
    public static void arraytest(){
        int[] a = {1,2,3,4};
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }
    public static void arraytest2(){
        int[] scores = {30, 75, 80, 100, 50};
        for(int i = 0; i < scores.length; i++){
            if(scores[i] >= 60){
                System.out.println((i+1) + "번 학생은 합격입니다.");
            }
            else{
                System.out.println((i+1) + "번 학생은 불합격입니다.");
            }
        }
    }
    public static void arraytest3(){
        int[] a = {1,2,3,4};
        for (int num : a){
            System.out.println(num);
        }
    }
    public static void arraytest4(){
        int[] test = {65, 90, 70, 85, 100, 95, 75, 80, 60, 55};
        float sum = 0;
        float avg;
        for (int num : test){
            sum += num;
        }
        System.out.println(sum);
        avg = sum / test.length;
        System.out.println(avg);
    }
    public static void arraytest5(){
        int counter = 0;
        int[] scores = {30, 75, 80,  100, 50};
        for(int num : scores){
            counter++;
            if(num >= 60){
                System.out.println(counter + "번째 학생은 합격입니다.");
            }
            else
            {
                System.out.println(counter + "번째 학생은 불합격입니다.");
            }
        }
    }
}
