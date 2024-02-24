package za.ac.cput;

import java.util.Objects;

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
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 &&
                empNum.equals(employee.empNum) &&
                name.equals(employee.name) &&
                sName.equals(employee.sName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empNum, name, sName, salary);
    }

}