package AbstractTest;

public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("우적우적, 사료에 담긴 개 전용 사료를 먹습니다.");
    }

    @Override
    public void sleep() {
        System.out.println("개는 주인의 곁에서 잠을잡니다.");
    }

    @Override
    public void drink() {
        System.out.println("개가 물그릇에 담긴 물을 혀를 통해 국자로 퍼먹듯 물을 마십니다.");
    }
    @Override
    public void run(int speed){
        super.run(speed);
        System.out.println("의 속도로 개가 전력질주를 합니다.");
    }
    @Override
    public void hind(String splace){
        System.out.print("개가 ");
        super.hind(splace);
    }
}
