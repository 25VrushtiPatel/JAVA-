package generics;

public class GenericMethod {

    // Generic method to display array elements
    public <T> void displayArrayElements(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }
}
