package Animal;

public class Valiable {
    public Valiable(){

    }
    static String a = "전역변수";
    public static void main(String[] args) {
    }
    public static String test(){
        String b = "지역변수";

        String a = b;
        return a;
    }
    public static String test2() {
        return a;
    }
    static String c = "hello";
    public static String test5(){
        String c = "100";
        return ("함수 내부에서 print : " + c);
    }
    public static String test6(){
        return ("함수 외부에서 print : " + c);
    }
}
