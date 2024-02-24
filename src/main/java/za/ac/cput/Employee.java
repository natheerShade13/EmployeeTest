package za.ac.cput;
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

    public double increase(){
        return this.salary += 5000;
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

}
