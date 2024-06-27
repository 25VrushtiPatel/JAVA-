public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void sound() {
        System.out.println("The animal makes a sound.");
    }

    public void eat() {
        System.out.println("The animal is eating.");
    }

    public String getName() {
        return name;
    }
}