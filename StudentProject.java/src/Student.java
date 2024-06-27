public class Student {
	
    private String name;
    private String email;

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for email
    public String getEmail() {
        return email;
    }

    // Setter method for email
    public void setEmail(String email) {
        this.email = email;
    }

    // Main method to test the Student class
    public static void main(String[] args) {
        // Create a new Student object
        Student student = new Student();

        // Set initial values using setter methods
        student.setName("John Doe");
        student.setEmail("john.doe@example.com");

        // Display initial values
        System.out.println("Initial Values:");
        System.out.println("Name: " + student.getName());
        System.out.println("Email: " + student.getEmail());

        // Modify values using setter methods
        student.setName("Jane Smith");
        student.setEmail("jane.smith@example.com");

        // Display modified values
        System.out.println("Modified Values:");
        System.out.println("Name: " + student.getName());
        System.out.println("Email: " + student.getEmail());
    }
}
