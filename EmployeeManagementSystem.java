import java.util.ArrayList;
import java.util.List;

abstract class Employee {
    private String employeeId;
    private String name;
    private String department;

    public Employee(String employeeId, String name, String department) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
    }

    public abstract double calculateSalary();

    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }
}

class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(String employeeId, String name, String department, double monthlySalary) {
        super(employeeId, name, department);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(String employeeId, String name, String department, double hourlyRate, int hoursWorked) {
        super(employeeId, name, department);
        this.hourlyRate =  hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        // Create employees
        Employee fullTimeEmployee = new FullTimeEmployee("E101", "Vijay", "Software Engineer", 5000);
        Employee partTimeEmployee = new PartTimeEmployee("E102", "Vivek", "IT", 20, 80);

        // Add employees to the list
        employees.add(fullTimeEmployee);
        employees.add(partTimeEmployee);

        // Calculate and display salaries
        for (Employee employee : employees) {
            System.out.println("Employee: " + employee.getName() +
                    ", Department: " + employee.getDepartment() +
                    ", Salary: $" + employee.calculateSalary());
        }
    }
}