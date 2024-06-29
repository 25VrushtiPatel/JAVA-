package CovariantTypes;

public class CovariantReturnTypeExample {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat cat = new Cat();

        Animal animalFromAnimal = animal.getAnimal();
        Cat catFromCat = cat.getAnimal();

        if (animalFromAnimal instanceof Cat) {
            Cat catFromAnimal = (Cat) animalFromAnimal;
            System.out.println("catFromAnimal is an instance of Cat: " + true);
        } else {
            System.out.println("catFromAnimal is an instance of Cat: " + false);
        }

        System.out.println("animalFromAnimal is an instance of Animal: " + (animalFromAnimal instanceof Animal));
        System.out.println("catFromCat is an instance of Cat: " + (catFromCat instanceof Cat));
    }
}