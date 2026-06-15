package OOPs.Interfaces;

public class Electricengine implements Engine {
    public void stop() {
        System.out.println("engine stop");
    }

    public void start() {
        System.out.println("engine start");
    }

    public void acce() {
        System.out.println("engine acceleration");
    }
}
