package AbstractTest;

public class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("웨옹, 하면서 고양이전용 사료를 먹습니다.");
    }

    @Override
    public void sleep() {
        System.out.println("태평하게 캣 타워에 누워서 고양이가 잠을 잡니다.");
    }

    @Override
    public void drink() {
        System.out.println("고양이가 홀짝홀짝 물을 조금씩 먹습니다.");
    }
    @Override
    public void run(int speed){
        super.run(speed);
        System.out.println("의 속도로 고양이가 우다다다를 합니다.");
    }
    @Override
    public void hind(String splace){
        System.out.print("고양이가 ");
        super.hind(splace);
    }
}
