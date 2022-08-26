import java.util.Scanner;
public class course11 {
    public static void main(String[] args) {
        arraytest1();
        arraytest2();
        arraytest3();
    }
    public static void arraytest1(){
        Scanner sc = new Scanner(System.in);
        System.out.print("배열의 크기를 정해주세요 : ");
        int arrsize = sc.nextInt();
        int[] newarray = new int[arrsize];
        for(int i = 0; i < arrsize; i++){
            System.out.print((i+1) + "번째 숫자를 입력해 주세요 : ");
            int inputnum = sc.nextInt();
            newarray[i] = inputnum;
        }
        for(int num : newarray){
            System.out.print(num + " ");
        }
        System.out.println("");
    }
    public static void arraytest2(){
        int[] newarray = new int[100];
        for(int i = 0; i < 100; i++){
            newarray[i] = i+1;
            if(newarray[i] % 2 == 0){
                System.out.println(newarray[i]);
            }
        }
    }
    public static void arraytest3(){
        char[] newarray = new char[26];
        char alphabet = 'A';
        for(int i = 0; i < 26; i++ , alphabet++){
            newarray[i] = alphabet;
        }
        for(char num : newarray){
            System.out.println(num + " : " + (int)num);
        }
    }
}
