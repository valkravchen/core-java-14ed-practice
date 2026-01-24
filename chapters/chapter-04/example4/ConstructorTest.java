package example4;

import java.util.Random;

public class ConstructorTest {
    static void main() {
        var staff = new Employee[3];
        staff[0] = new Employee("Harry", 40000);
        staff[1] = new Employee(60000);
        staff[2] = new Employee();
        for (Employee employee: staff) {
            System.out.println("name=" + employee.getName() + ", id=" + employee.getId() +
                    ", salary=" + employee.getSalary());
        }
    }
}

class Employee {
    private static int nextId;
    private int id;
    private String name = "";
    private double salary;

    static {
        var generator = new Random();
        nextId = generator.nextInt(10000);
    }

    {
        id = nextId;
        nextId++;
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee(double salary) {
        this("Employee #" + nextId, salary);
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }
}
