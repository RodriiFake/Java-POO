package Polimorfismo;

import java.awt.print.Paper;

public class Main {
    public static void main(String[] args) {
        /*Polimorfismo en tiempo de ejecución (sobrescritura de métodos)*/
        Animal animal = new Animal();
        animal.hacerSonido();
        animal = new Perro();
        animal.hacerSonido();
        animal = new Gato();
        animal.hacerSonido();

        /*Polimorfismo en tiempo de compilación (sobrecarga de métodos)*/
        Calculadora calculadora = new Calculadora();
        calculadora.sumar(10,10);
        calculadora.sumar(10.5,10.0);
        calculadora.sumar(10,10, 10);
        calculadora.sumar("Ejemplo de ", "polimorfismo en tiempo de compilación");
    }
}
