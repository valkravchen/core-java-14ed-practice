package example2;

public class StaticTest {
    static void main() {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Tom", 40000);
        staff[1] = new Employee("Dick", 60000);
        staff[2] = new Employee("Harry", 65000);
        for (Employee employee : staff) {
            employee.setId();
            System.out.println("name=" + employee.getName() +", id=" + employee.getId() +
                    ", salary=" + employee.getSalary());
        }
        int n = Employee.getNextId();
        System.out.println("Next available id=" + n);
    }
}

class Employee {
    private static int nextId = 1;
    private String name;
    private int salary;
    private int id;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
        id = 0;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        id = nextId;
        nextId++;
    }

    public static int getNextId() {
        return nextId;
    }

    static void main() {
        Employee employee = new Employee("Harry", 50000);
        System.out.println(employee.getName() + " " + employee.getSalary());
    }
}
