public class Vehiculo {

    protected String marca;
    protected int velMax;

    public Vehiculo(String marca, int velMAX) {
        this.marca = marca;
        this.velMax = velMAX;
    }

    public void encender() {
            System.out.println("Vehículo encendido.");
    }

    public void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Vel máxima: " + velMax + " km/h");
    }
}

