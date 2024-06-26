package HerenciaConAsociacion;

public class Vehiculo {
    private String marca;
    private String placa;
    private Integer numeroLlantas;

    public Vehiculo(String marca, String placa, Integer numeroLlantas) {
        this.marca = marca;
        this.placa = placa;
        this.numeroLlantas = numeroLlantas;
    }

    public void mostrarVehiculo() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Placa: " + this.placa);
        System.out.println("Numero Llantas: " + this.numeroLlantas);
    }
}
