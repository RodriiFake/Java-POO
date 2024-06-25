package Casteo;

public class Main {
    public static void main(String[] args) {
        Animal miAnimal = new Perro();  // Polimorfismo en tiempo de ejecución

        miAnimal.hacerSonido();  // Llama a hacerSonido() de Perro

        // Casteo de Animal a Perro para acceder a métodos específicos de Perro
        if (miAnimal instanceof Perro) {
            Perro miPerro = (Perro) miAnimal;
            miPerro.moverCola();
        }

        miAnimal = new Gato();  // Cambio a un objeto Gato
        miAnimal.hacerSonido();  // Llama a hacerSonido() de Gato

        // Casteo de Animal a Gato para acceder a métodos específicos de Gato
        if (miAnimal instanceof Gato) {
            Gato miGato = (Gato) miAnimal;
            miGato.ronronear();
        }
    }
}
