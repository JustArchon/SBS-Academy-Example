package finaltest;

public class Test4 {

    public Test4(){

    }

    public Test4(int a){
        System.out.println(a);
    }

    public Test4(String a){
        System.out.println(a);
    }

    public Test4(int a, String b){
        System.out.println(a + b);
    }

    public void plus(int x, int y){
        System.out.println(x + y);
    }

    public void plus(int x, int y, int z){
        System.out.println(x+y+z);
    }

    public void plus(){
        System.out.println("인자 없는 메소드");
    }
}
