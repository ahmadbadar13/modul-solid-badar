package dip;

class DieselEngine implements EngineInterface {
    @Override
    public void start() {
        System.out.println("Mesin diesel dihidupkan.");
    }
}