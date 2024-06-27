public class Area {
    private double length;
    private double breadth;

    // Method to set the dimensions 
    public void setDim(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to get the area of the rectangle
    public double getArea() {
        return length * breadth;
    }

    public static void main(String[] args) {
        // Create an instance of the Area class
        Area rectangle = new Area();

        // Set the dimensions of the rectangle
        rectangle.setDim(5.0, 3.0);
        
        System.out.println("The area of the rectangle is: " + rectangle.getArea());
    }
}
