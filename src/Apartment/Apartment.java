package Apartment;

public class Apartment {
    public static void main(String[] args) {
        String id = "동그라미 아파트 506호";

        Elevator elevator = new Elevator(id);
        Aircon aircon = new Aircon(id);
        Lighting lighting = new Lighting(id);
        Security security = new Security(id);

        elevator.callForUp(5);
        lighting.on();
        lighting.off();
        lighting.isOn();
        security.on();
        security.off();
        security.getExistPeople();
        aircon.on();
        aircon.off();
        aircon.on(15.3);
        elevator.callForDown(5);
    }
}
