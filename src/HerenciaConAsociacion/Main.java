package HerenciaConAsociacion;

public class Main {
    public static void main(String[] args) {
        Propietario propietario = new Propietario("Sergio", new Vehiculo("TOYOTA", "202-XHB", 4));

        propietario.setVehiculo(new Carro("WOLKSVAGEN", "1738-DUE", "PETA"));
        propietario.mostrarDatos();
    }
}
