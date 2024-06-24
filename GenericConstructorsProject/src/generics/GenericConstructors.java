package generics;

public class GenericConstructors {
    private double value;

    // Generic constructor
    public <T extends Number> GenericConstructors(T arg) {
        value = arg.doubleValue();
    }

    public void show() {
        System.out.println("Value: " + value);
    }
}
