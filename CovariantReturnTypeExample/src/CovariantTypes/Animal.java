package CovariantTypes;

public class Animal {
    public Animal getAnimal() {
        return new Cat(); // Return a Cat object instead of an Animal object
    }
}