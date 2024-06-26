package HerenciaConAsociacion;

public class Carro extends Vehiculo {
    private String modelo;
    public Carro(String marca, String placa, String modelo) {
        super(marca, placa, 4);
        this.modelo = modelo;
    }
}
