package za.ac.cput;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Assertions.*;

/*
Authors : Chadwin Kyle Fritz(218068360), Natheer Shade(217159109), Thabo Tshabalala(221715126)
Date : 23/02/2024
*/

class EmployeeTest {

    private Employee employee1;
    private Employee employee2;
    private Employee employee3;
    @BeforeEach
    void setUp() {
        // Initialize Employee objects
        employee1 = new Employee("E001", "Chadwin", "Fritz", 43000.0);
        employee2 = new Employee("E002", "Natheer", "Shade", 44000.0);
        employee3 = employee1;
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
    public void nonStopRunTime(){
        double emp = employee1.getSalary() * 10 + 100000;
    }

    @Test
    void testFailingCondition() {
        assertNotEquals(employee3.getEmpNum(), employee1.getEmpNum()
                , "This test intentionally fails because of a specific condition.");
    }
    // This fails

    @Disabled("This test is currently disabled for some reason.")
    @Test
    void testDisabledCondition() {
        assertNull(employee3);
    }
    // Test code is disabled

    @Test
    void testToString() {
        String expectedToString1 = "Employee{empNum='E001', name='Chadwin', sName='Fritz', salary=43000.0}";
        String expectedToString2 = "Employee{empNum='E002', name='Natheer', sName='Shade', salary=44000.0}";
        assertEquals(expectedToString1, employee1.toString());
        assertEquals(expectedToString2, employee2.toString());
    }
}
