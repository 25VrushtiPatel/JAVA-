public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Jini Patel", 20, "123-456-7890", "123 Main St", 50000.0, "Software Engineering");
        System.out.println("Employee Details:");
        employee.displayEmployeeDetails();

        System.out.println();

        Manager manager = new Manager("Vrushti Patel", 22, "987-654-3210", "456 Main St", 100000.0, "Marketing");
        System.out.println("Manager Details:");
        manager.displayManagerDetails();
    }
}