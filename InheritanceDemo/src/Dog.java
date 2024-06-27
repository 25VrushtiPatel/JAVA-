public class Dog extends Animal {
    public Dog(String name) {
        super(name); // Calls the constructor of the Animal class
    }

    @Override
    public void sound() {
        System.out.println("The dog barks.");
    }

    public void fetch() {
        System.out.println("The dog is fetching.");
    }
}