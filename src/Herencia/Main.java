package Herencia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Administrador admin = new Administrador("Sergio", "Aruquipa", 25, "Sergio.aruquipa", "pass123");
        admin.mostrarDatos();
        System.out.println("");
        int opcion = 0;
        try {
            do {
                System.out.println("Elige una opción:");
                System.out.println("1. Registrar desarrollador");
                System.out.println("2. Registrar Analista");
                opcion = Integer.parseInt(scanner.nextLine());
                switch (opcion) {
                    case 1:
                        registrarDesarrollador(admin, scanner);
                        break;
                    case 2:
                        registrarAnalista(admin, scanner);
                        break;
                }
            } while (opcion > 0 && opcion < 3);
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida, por favor ingresa un número.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void registrarDesarrollador(Administrador admin, Scanner scanner) {
        System.out.println("Ingrese el nombre del desarrollador");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el apellido del desarrollador");
        String apellido = scanner.nextLine();
        System.out.println("Ingrese la edad del desarrollador");
        int edad = Integer.parseInt(scanner.nextLine());
        System.out.println("Ingrese el usuario del desarrollador");
        String usuario = scanner.nextLine();
        System.out.println("Ingrese el password del desarrollador");
        String password = scanner.nextLine();
        System.out.println("Ingrese el lenguaje del desarrollador");
        String lenguaje = scanner.nextLine();
        System.out.println("Ingrese el salario del desarrollador");
        double salario = Double.parseDouble(scanner.nextLine());
        admin.createDesarrollador(nombre, apellido, edad, usuario, password, salario, lenguaje);
    }

    public static void registrarAnalista(Administrador admin, Scanner scanner) {
        System.out.println("Ingrese el nombre del analista");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el apellido del analista");
        String apellido = scanner.nextLine();
        System.out.println("Ingrese la edad del analista");
        int edad = Integer.parseInt(scanner.nextLine());
        System.out.println("Ingrese el usuario del analista");
        String usuario = scanner.nextLine();
        System.out.println("Ingrese el password del analista");
        String password = scanner.nextLine();
        System.out.println("Ingrese el lenguaje del analista");
        String lenguaje = scanner.nextLine();
        System.out.println("Ingrese el salario del analista");
        double salario = Double.parseDouble(scanner.nextLine());
        admin.createAnalista(nombre, apellido, edad, usuario, password, salario);
    }
}
