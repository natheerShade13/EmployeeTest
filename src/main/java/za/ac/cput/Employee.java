package za.ac.cput;

import java.util.Objects;

/*
Authors : Chadwin Kyle Fritz(218068360), Natheer Shade(217159109), Thabo Tshabalala(221715126)
Date : 23/02/2024
*/

public class Employee {

    private String empNum;
    private String name;
    private String sName;
    private double salary;

    public Employee(){

    }

    public Employee(String empNum, String name, String sName, double salary) {
        this.empNum = empNum;
        this.name = name;
        this.sName = sName;
        this.salary = salary;
    }

    public String getEmpNum() {
        return empNum;
    }

    public void setEmpNum(String empNum) {
        this.empNum = empNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empNum='" + empNum + '\'' +
                ", name='" + name + '\'' +
                ", sName='" + sName + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        // Check if the compared object is the same instance
        if (this == o) return true;
    
        // Check if the compared object is null or of a different class
        if (o == null || getClass() != o.getClass()) return false;
    
        // Cast the compared object to the same class
        Employee employee = (Employee) o;
    
        // Compare each field for equality
        return Double.compare(employee.salary, salary) == 0 &&
                Objects.equals(empNum, employee.empNum) &&
                Objects.equals(name, employee.name) &&
                Objects.equals(sName, employee.sName);
    }
    
    @Override
    public int hashCode() {
        // Generate a hash code based on the hash codes of individual fields
        return Objects.hash(empNum, name, sName, salary);
    }

}
