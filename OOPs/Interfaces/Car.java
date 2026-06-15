package OOPs.Interfaces;

import java.util.*;

public class Car implements Brakes, Engine, Media {
    public void start() {
        System.out.println("engine start");
    }

    public void stop() {
        System.out.println("engine stop");
    }

    public void acce() {
        System.out.println("engine acce");
    }

    public void brake() {
        System.out.println("brake stop");
    }
}
