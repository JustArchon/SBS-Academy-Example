package AbstractTest;

public abstract class Animal {

    public abstract void eat();
    public abstract void sleep();
    public abstract void drink();

    public void run(int speed){
        System.out.print(speed);
    }
    public void hind(String splace){
        System.out.printf("%s에 숨었습니다.",splace);
    }
    public void play(String ss){}
}
