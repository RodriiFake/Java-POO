package Herencia;

public class Desarrollador extends Empleado{
    private String lenguaje;
    public Desarrollador(String nombre, String apellido, int edad, String userName, String password, String lenguaje){
        super(nombre, apellido, edad, userName, password);
        this.lenguaje = lenguaje;
    }
    public void desarrollarPrograma(){
        System.out.println("Desarrollando aplicaciones con " + this.lenguaje + "...");
    }
}
