public class ObjectCounter {
    public static void main(String[] args) {
        // Create objects
        Member member1 = new Member("Jini", 30, "123-456-7890", "123 Main St", 50000.0);
        Member member2 = new Member("Siya", 40, "987-654-3210", "456 Near St", 100000.0);

        Employee employee1 = new Employee("Vrushti", 25, "555-123-4567", "789 Osam St", 60000.0, "Software Engineering");
        Employee employee2 = new Employee("Bansi", 35, "555-901-2345", "321 Market St", 70000.0, "Data Science");

        Manager manager1 = new Manager("Charmi", 45, "555-111-2222", "901 Pine St", 120000.0, "Marketing");
        Manager manager2 = new Manager("Dimple", 50, "555-333-4444", "567 Center St", 150000.0, "Sales");

        // Count objects
        int memberCount = Member.getCount();
        int employeeCount = Employee.getCount();
        int managerCount = Manager.getCount();

        // Print results
        System.out.println("Member objects: " + memberCount);
        System.out.println("Employee objects: " + employeeCount);
        System.out.println("Manager objects: " + managerCount);
    }
}