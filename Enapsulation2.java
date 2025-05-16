import java.util.*;
class Employee1 {
    private String name;
    private int id;
    private double salary;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        } else {
            System.out.println("Invalid ID. ID must be positive.");
        }
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid Salary. Salary must be non-negative.");
        }
    }
    public void displayDetails() {
        if (id > 0 && salary >= 0) {
            System.out.println("Employee Details:");
            System.out.println("Name: " + name);
            System.out.println("ID: " + id);
            System.out.println("Salary: $" + salary);
        } else {
            System.out.println("Employee data is not valid.");
        }
    }
}
public class Enapsulation2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee1 emp = new Employee1();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        emp.setName(name);
        System.out.print("Enter Id: ");
        int id = sc.nextInt();
        emp.setId(id);
        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();
        emp.setSalary(salary);
        emp.displayDetails();
    }
}
