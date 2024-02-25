package za.ac.cput;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;


import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    private Employee employee1;
    private Employee employee2;
    @BeforeEach
    void setUp() {
        // Initialize Employee objects
        employee1 = new Employee("E001", "Chadwin", "Fritz", 43000.0);
        employee2 = new Employee("E002", "Natheer", "Shade", 44000.0);
    }

    @Test
    void testGetEmpNum() {
        assertEquals("E001", employee1.getEmpNum());
        assertEquals("E002", employee2.getEmpNum());
    }

    @Test
    void testGetName() {
        assertEquals("Chadwin", employee1.getName());
        assertEquals("Natheer", employee2.getName());
    }

    @Test
    void testObjectEquality() {
        Employee anotherEmployee = new Employee("E001", "Chadwin", "Fritz", 43000.0);
        assertEquals(employee1, anotherEmployee);
        assertNotEquals(employee1, employee2);
    }
@Test
    void testObjectIdentity(){
        Employee sameEmployee = employee1;
        assertSame(sameEmployee,employee1);
        assertNotSame(employee1,employee2);


    }
    @Test
    @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
    public void nonStopRunTimee(){
        //I don't know what to call here.
    }

    @Test
    void testFailingCondition() {
        assertNotEquals("E003", employee1.getEmpNum(), "This test intentionally fails because of a specific condition.");
    }

    @Disabled("This test is currently disabled for some reason.")
    @Test
    void testDisabledCondition() {
        // Test code is currently disabled
    }

    @Test
    void testToString() {
        String expectedToString1 = "Employee{empNum='E001', name='Chadwin', sName='Fritz', salary=43000.0}";
        String expectedToString2 = "Employee{empNum='E002', name='Natheer', sName='Shade', salary=44000.0}";
        assertEquals(expectedToString1, employee1.toString());
        assertEquals(expectedToString2, employee2.toString());
    }
}
