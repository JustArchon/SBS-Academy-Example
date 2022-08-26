package finaltest;

public class Test3 extends Test2{
    public void test2Method(){

    }
//    public void test2Method2(){
//
//    }

    public final int a = 10;

    @Override
    public void override(){
        super.override();
        System.out.println("test3클래스 메소드");
    }
}
