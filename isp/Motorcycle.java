package isp;

class Motorcycle implements VehicleInterface, StopieInterface {
    @Override
    public void drive() {
        System.out.println("Motor sedang mengemudi.");
    }

    @Override
    public void stop() {
        System.out.println("Motor sedang berhenti.");
    }

    @Override
    public void refuel() {
        System.out.println("Motor sedang mengisi bahan bakar.");
    }

    public void stopie() {
        System.out.println("Motor sedang melakukan stopie.");
    }
}