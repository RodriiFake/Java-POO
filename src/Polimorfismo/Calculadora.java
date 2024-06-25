package Polimorfismo;

public class Calculadora {
    public void sumar(int a, int b){
        System.out.println(a + b);
    }

    public void sumar(double a, double b){
        System.out.println(a + b);
    }

    public void sumar(int a, int b, int c){
        System.out.println(a + b + c);
    }

    public void sumar(String a, String b){
        System.out.println(a + b);
    }
}
