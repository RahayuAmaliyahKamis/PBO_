package y;

public class Lenovo implements Laptop {
    private int volume;
    boolean IsPowerOn;

    public Lenovo() {
        this.volume = 50;
    }

    @Override
    public void powerOn() {
        IsPowerOn = true;
        System.out.println("Laptop is On");
        System.out.println("Lenovo ThinkPad");
    }

    @Override
    public void powerOff() {
        IsPowerOn = false;
        System.out.println("Shutdown is process---");
    }

    @Override
    public void volumeUp() {
        if (IsPowerOn) {
            if (this.volume == MAX_VOL) {
                System.out.println("Volume is Full");
            } else {
                this.volume += 10;
                System.out.println("Volume is :" + this.getVolume());
            }
        }
    }

    @Override
    public void volumeDown() {
        if (IsPowerOn) {
            if (this.volume == MIN_VOL) {
                System.out.println("Volume is 0%");
            } else {
                this.volume -= 10;
                System.out.println("Volume is :" + this.getVolume());
            }
        }
    }

    public int getVolume() {
        return this.volume;
    }
}
