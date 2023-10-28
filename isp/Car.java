package isp;

class Car implements VehicleInterface, DoorInterface {
    @Override
    public void drive() {
        System.out.println("Mobil sedang mengemudi.");
    }

    @Override
    public void stop() {
        System.out.println("Mobil sedang berhenti.");
    }

    @Override
    public void refuel() {
        System.out.println("Mobil sedang mengisi bahan bakar.");
    }

    public void openDoors() {
        System.out.println("Pintu mobil terbuka.");
    }
}
