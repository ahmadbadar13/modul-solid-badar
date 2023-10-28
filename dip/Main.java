package dip;

public class Main {
    public static void main(String[] args) {
        System.out.println("Authors: 3411211061 - Ahmad Badar\n");
        Car fuelCar = new Car(new PetrolEngine());
        Car dieselCar = new Car(new DieselEngine());
        Car hybridCar = new Car(new HybridEngine());

        fuelCar.start();
        dieselCar.start();
        hybridCar.start();
    }
}