package CovariantTypes;

public class Cat extends Animal {
    @Override
    public Cat getAnimal() {
        return new Cat();
    }
}