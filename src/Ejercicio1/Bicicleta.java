package Ejercicio1;

public class Bicicleta extends Vehiculo{
    @Override
    public void mover() {
        System.out.println("Mover bicicleta");
    }

    public void pedalear() {
        System.out.println("Pedalear bicicleta");
    }
}
