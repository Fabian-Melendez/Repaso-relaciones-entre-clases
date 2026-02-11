public class Coche extends Vehiculo {

    private boolean usaCinturon;

    public Coche(String marca, int velMax, boolean usaCinturon) {
        super(marca, velMax);
        this.usaCinturon = usaCinturon;
    }

    public void conducir() {
        System.out.println("Coche en movimiento.");
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Usa cinturón?: "
                + (usaCinturon ? "Sí" : "No"));
    }
}
