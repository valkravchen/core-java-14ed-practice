package abstractClasses;

public class PersonTest {
    static void main() {
        Person[] people = new Person[2];
        people[0] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        people[1] = new Student("Maria Morris", "computer science");
        for (Person person : people) {
            System.out.println(person.getName() + ", " + person.getDescription());
        }
    }
}
