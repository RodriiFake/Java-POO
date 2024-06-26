package HerenciaConAsociacion;

public class Propietario {
    private String nombre;
    private Vehiculo vehiculo;
    public Propietario(String nombre, Vehiculo vehiculo) {
        this.nombre = nombre;
        this.vehiculo = vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + this.nombre);
        this.vehiculo.mostrarVehiculo();
    }
}
