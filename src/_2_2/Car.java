package _2_2;

/**
 * Created by 28013 on 2016/9/27.
 */
public class Car {
    static class Auto {
        private double speed;

        Auto() {
            speed = 0;
        }

        public void start(double _speed) {
            speed = _speed;
        }

        public void stop() {
            speed = 0;
        }

        public void speedUp(double delta) {
            speed += delta;
        }

        public double getSpped() {
            return speed;
        }
    }

    static class Bus extends Auto {
        private int passengers;

        Bus() {
            super();
            passengers = 0;
        }

        public void getOn(int delta) {
            passengers += delta;
        }

        public void getOff(int delta) {
            passengers -= delta;
        }

        public int getPassengers() {
            return passengers;
        }

    }

    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.start(10);
        printSpeed(bus);
        bus.speedUp(15);
        printSpeed(bus);
        bus.stop();
        printSpeed(bus);
        bus.getOn(10);
        printPassengers(bus);
        bus.getOff(8);
        printPassengers(bus);
    }

    static void printSpeed(Auto a) {
        System.out.printf("Now speed is %f\n", a.getSpped());
    }

    static void printPassengers(Bus b) {
        System.out.printf("Now passengers number is %d\n", b.getPassengers());
    }
}
