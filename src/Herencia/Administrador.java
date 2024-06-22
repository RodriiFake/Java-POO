package Herencia;

public class Administrador extends Empleado{
    public Administrador(String nombre, String apellido, int edad, String userName, String password){
        super(nombre, apellido, edad, userName, password);
    }
    public void createDesarrollador(String nombre, String apellido, int edad, String userName, String password, Double salario, String lenguaje) {
        Desarrollador nuevoDesarrollador = new Desarrollador(nombre, apellido, edad, userName, password, lenguaje);
        nuevoDesarrollador.setSalario(salario);
        nuevoDesarrollador.mostrarDatos();
    }
    public void createAnalista(String nombre, String apellido, int edad, String userName, String password, Double salario) {
        Analista nuevoAnalista = new Analista(nombre, apellido, edad, userName, password);
        nuevoAnalista.setSalario(salario);
        nuevoAnalista.mostrarDatos();
    }
}
