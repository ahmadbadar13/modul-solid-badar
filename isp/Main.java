package isp;

public class Main {
    public static void main(String[] args) {
        System.out.println("Authors: 3411211061 - Ahmad Badar\n");
        Car car = new Car();
        car.drive();
        car.stop();
        car.refuel();
        car.openDoors();

        Motorcycle motor = new Motorcycle();
        motor.drive();
        motor.stop();
        motor.refuel();
        motor.stopie();
    }
}
