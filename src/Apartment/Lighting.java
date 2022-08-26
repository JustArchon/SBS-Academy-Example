package Apartment;

import java.util.Random;

public class Lighting implements OnOff{
    public String id;

    public Lighting(String id){
        this.id = id;
    }

    @Override
    public boolean on() {
        System.out.println(id + "-> 불을 켰습니다.");
        return true;
    }

    @Override
    public boolean off() {
        System.out.println(id + "-> 불을 껐습니다.");
        return false;
    }
    public boolean isOn(){
        Random rd = new Random();
        boolean check = rd.nextBoolean();
        System.out.println(check);
        return check;
    }
}
