package com.vrushti.assignment;

import employees.Developer;
import employees.Manager;
import utilities.EmployeeUtilities;

public class AssignmentMain {
    public static void main(String[] args) {
        // Create instances of Manager and Developer
        Manager manager = new Manager();
        manager.setName("VRUSHTI");
        manager.setEmployeeId(101);
        manager.setSalary(90000);
        manager.setTeamSize(10);

        Developer developer = new Developer();
        developer.setName("BANSI");
        developer.setEmployeeId(102);
        developer.setSalary(80000);
        developer.setProgrammingLanguage("Java");

        // Use EmployeeUtilities methods 
        EmployeeUtilities.printEmployeeDetails(manager);
        EmployeeUtilities.printEmployeeDetails(developer);

        System.out.println("\nGiving a 10% raise to both employees...\n");

        EmployeeUtilities.giveRaise(manager, 10);
        EmployeeUtilities.giveRaise(developer, 10);

        // Print updated details
        EmployeeUtilities.printEmployeeDetails(manager);
        EmployeeUtilities.printEmployeeDetails(developer);
    }
}
