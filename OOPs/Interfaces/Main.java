package OOPs.Interfaces;

public class Main {
    public static void main(String[] args) {
        // Car car = new Car();
        // car.start();
        // car.stop();
        // car.acce();
        // car.brake();
        Media player = new Cdplayer();
        player.start();
        player.stop();
        Engine powerengine = new Powerengine();
        powerengine.start();
        powerengine.stop();
        powerengine.acce();
        Engine electricengine = new Electricengine();
        electricengine.start();
        electricengine.stop();
        electricengine.acce();

    }
}
