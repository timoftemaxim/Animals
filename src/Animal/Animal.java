package Animal;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void feed() {
        System.out.println("Animalul " + name + " a fost hranit.");
    }
}