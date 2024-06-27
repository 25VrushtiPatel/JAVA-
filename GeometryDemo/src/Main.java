public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("Rectangle:");
        rectangle.printArea();
        rectangle.printPerimeter();

        Square square = new Square(5);
        System.out.println("\nSquare:");
        square.printArea();
        square.printPerimeter();
    }
}