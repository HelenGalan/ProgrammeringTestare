package vecka372026;

public class Lamp {

    private boolean isOn;

    public Lamp(boolean isOn) {
        this.isOn = isOn;
    }

    public void turnOn() {
        isOn = true;
    }

    public  void  turOff() {
        isOn = false;
    }

    public boolean getIsOn() {
        return isOn;
    }
}
