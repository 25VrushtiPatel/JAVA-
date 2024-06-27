public class InheritanceDemo {
    public static void main(String[] args) {
        Dog myDog = new Dog("MAX");

        System.out.println("My dog's name is " + myDog.getName());
        myDog.sound(); // Outputs: The dog barks.
        myDog.eat(); // Outputs: The animal is eating.
        myDog.fetch(); // Outputs: The dog is fetching.
    }
}