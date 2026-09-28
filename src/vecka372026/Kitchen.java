package vecka372026;

public class Kitchen {
    static void main() {

        Lamp lamp = new Lamp(false);

        if (lamp.getIsOn()) {
            System.out.println("Lampan lyser");
        } else {
            System.out.println("Lampan är släckt");
        }

        lamp.turnOn();

        if (lamp.getIsOn()) {
            System.out.println("Lampan lyser");
        } else {
            System.out.println("Lampan är släckt");
        }

        lamp.turOff();

        if (lamp.getIsOn()) {
            System.out.println("Lampan lyser");
        } else {
            System.out.println("Lampan är släckt");
        }
    }
}
