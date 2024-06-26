package Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List <Vehiculo> listaVehiculos = new ArrayList<>();
        listaVehiculos.add(new Coche());
        listaVehiculos.add(new Bicicleta());

        for (Vehiculo vehiculo : listaVehiculos) {
            vehiculo.mover();
            if (vehiculo instanceof Bicicleta) {
                Bicicleta bicicleta = (Bicicleta) vehiculo;
                bicicleta.pedalear();
            }
            if (vehiculo instanceof Coche) {
                Coche coche = (Coche) vehiculo;
                coche.tocarClaxon();
            }
        }
    }
}
