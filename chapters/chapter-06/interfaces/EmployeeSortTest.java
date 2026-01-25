package interfaces;

import java.util.Arrays;

/**
 * В этой программе демонстрируется применение
 * интерфейса Comparable
 */

public class EmployeeSortTest {
    static void main() {
        var staff = new Employee[3];
        staff[0] = new Employee("Harry Hacker", 35000);
        staff[1] = new Employee("Carl Cracker", 75000);
        staff[2] = new Employee("Tony Tester", 38000);
        Arrays.sort(staff);
        //вывести данные обо всех объектах типа Employee
        for (Employee employee : staff) {
            System.out.println("name=" + employee.getName() + ", salary=" + employee.getSalary());
        }
    }
}
