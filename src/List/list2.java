package List;

import java.util.ArrayList;
import java.util.Scanner;
public class list2 {
    public static void main(String[] args) {
        listest2();
    }
    public static void listest1(){
        ArrayList<Integer> test2 = new ArrayList<>();
        int input = -1;
        Scanner sc = new Scanner(System.in);
        while(input != 0){
            input = sc.nextInt();
            System.out.println(input);
        }
    }
    public static void listest2(){
        ArrayList<String> test = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String input;
        boolean check = false;
        for(int i = 0; i < 5; i++){
            test.add(sc.nextLine());
        }
        sc.nextLine();
        System.out.println("찾고자하는 성씨를 입력하십시오.");
        input = sc.nextLine();
        for(String doc : test){
            if(doc.startsWith(input)){
                System.out.println(doc);
                check = true;
            }
        }
        if(!check){
            System.out.println("찾으시는 성씨는 존재하지 않습니다.");
        }
    }
}
