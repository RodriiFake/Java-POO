package Herencia;

public class Analista extends Empleado{
    public Analista(String nombre, String apellido, int edad, String userName, String password){
        super(nombre, apellido, edad, userName, password);
    }

    public void redactarHu(){
        System.out.println("Redactando HU...");
    }
}
