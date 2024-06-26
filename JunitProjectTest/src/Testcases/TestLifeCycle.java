package Testcases;

//demonstrate the life cycle of Testing
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class TestLifeCycle {

 @BeforeEach
 void beforeEachTest() {
     System.out.println("Before Each Test"); //prints 2nd //printed 5th
 }

 @AfterEach
 void afterEachTest() {
     System.out.println("After Each Test"); //printed 4th //Printed 7th
 }

 @BeforeAll
 void beforeAllTests() {
     System.out.println("Before All Tests");  //prints 1st
 }

 @AfterAll
 void afterAllTests() {
     System.out.println("After All Tests");  //printed 8th
 }

 @Test
 void testMethod1() {
     System.out.println("Test Method 1....."); //printed 3rd
 }

 @Test
 void testMethod2() {
     System.out.println("Test Method 2....."); //printed 6th
 }
}
