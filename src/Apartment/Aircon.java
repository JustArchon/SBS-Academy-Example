package Apartment;

import java.util.Random;

public class Aircon implements OnOff{
    public String id;
    public double temp = 26.0;

    public Aircon(String id){
        this.id = id;
    }

    @Override
    public boolean on() {
        System.out.println(id + "-> 에어컨이 " + temp+ "도로 켜졌습니다.");
        return true;
    }

    public boolean on(double changeTemp) {
        this.temp = changeTemp;
        System.out.println(id + "-> 에어컨이 " + temp+ "도로 켜졌습니다.");
        return true;
    }

    @Override
    public boolean off() {
        System.out.println(id + "-> 에어컨이 꺼졌습니다.");
        return false;
    }
}
