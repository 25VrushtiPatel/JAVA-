import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Person {
    String name;
    String address;
    String telephoneNumber;
    String mobileNumber;
    String headOfFamily;
    String uniqueID;

    public Person(String name, String address, String telephoneNumber, String mobileNumber, String headOfFamily, String uniqueID) {
        this.name = name;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
        this.mobileNumber = mobileNumber;
        this.headOfFamily = headOfFamily;
        this.uniqueID = uniqueID;
    }
}

public class Directory {
    private Map<String, Person> database = new HashMap<>();

    public void createEntry() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter address: ");
        String address = scanner.nextLine();

        System.out.print("Enter telephone number (with STD code): ");
        String telephoneNumber = scanner.nextLine();

        System.out.print("Enter mobile number: ");
        String mobileNumber = scanner.nextLine();

        System.out.print("Enter head of family: ");
        String headOfFamily = scanner.nextLine();

        System.out.print("Enter unique ID: ");
        String uniqueID = scanner.nextLine();

        if (database.containsKey(uniqueID)) {
            System.out.println("Unique ID already exists. Please try again.");
            return;
        }

        Person person = new Person(name, address, telephoneNumber, mobileNumber, headOfFamily, uniqueID);
        database.put(uniqueID, person);
        System.out.println("Entry created successfully!");
    }

    public void editEntry() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter unique ID: ");
        String uniqueID = scanner.nextLine();

        if (!database.containsKey(uniqueID)) {
            System.out.println("Unique ID not found. Please try again.");
            return;
        }

        Person person = database.get(uniqueID);

        System.out.print("Enter new name (or press enter to keep current): ");
        String name = scanner.nextLine();
        if (!name.isEmpty()) {
            person.name = name;
        }

        System.out.print("Enter new address (or press enter to keep current): ");
        String address = scanner.nextLine();
        if (!address.isEmpty()) {
            person.address = address;
        }

        System.out.print("Enter new telephone number (with STD code) (or press enter to keep current): ");
        String telephoneNumber = scanner.nextLine();
        if (!telephoneNumber.isEmpty()) {
            person.telephoneNumber = telephoneNumber;
        }

        System.out.print("Enter new mobile number (or press enter to keep current): ");
        String mobileNumber = scanner.nextLine();
        if (!mobileNumber.isEmpty()) {
            person.mobileNumber = mobileNumber;
        }

        System.out.print("Enter new head of family (or press enter to keep current): ");
        String headOfFamily = scanner.nextLine();
        if (!headOfFamily.isEmpty()) {
            person.headOfFamily = headOfFamily;
        }

        System.out.println("Entry edited successfully!");
    }

    public void displayMenu() {
        System.out.println("Directory Menu:");
        System.out.println("1. Create a database entry");
        System.out.println("2. Edit an entry");
        System.out.println("3. Exit");
    }

    public static void main(String[] args) {
        Directory directory = new Directory();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            directory.displayMenu();
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    directory.createEntry();
                    break;
                case 2:
                    directory.editEntry();
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}