package Relaciones;

public class DogWalker {
    private String name;

    public DogWalker(String name) {
        this.name = name;
    }

    public void walk(Dog dog) {
        System.out.println("I'm walk with " + dog.getName());
    }
}
