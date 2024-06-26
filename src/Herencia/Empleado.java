package Herencia;

public class Empleado extends Persona{
    private String userName;
    private String password;
    private Double salario;
    public Empleado(String nombre, String apellido, int edad, String userName, String password) {
        super(nombre, apellido, edad);
        this.userName = userName;
        this.password = password;
        this.salario = 0.0;
    }
    public void mostrarDatos() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApellido());
        System.out.println("Edad: " + getEdad());
        System.out.println("Salario: " + getSalario());
        System.out.println("Usuario: " + getUserName());
    }

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public Double getSalario() {
        return salario;
    }
    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
