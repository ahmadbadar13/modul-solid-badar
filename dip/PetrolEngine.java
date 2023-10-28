package dip;

class PetrolEngine implements EngineInterface {
    @Override
    public void start() {
        System.out.println("Mesin bensin dihidupkan.");
    }
}
