import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dog dog = new Dog("Firulais");
        DogOwner dogOwner = new DogOwner("Rodrigo", dog);
        dogOwner.play();

        DogWalker dogWalker = new DogWalker("Jesus");
        dogWalker.walk(dog);
    }
}