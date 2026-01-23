import java.util.Scanner;

public class InputTest {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.println("Как тебя зовут? ");
        String name = in.nextLine();
        System.out.println("Сколько тебе лет? ");
        int age = in.nextInt();
        System.out.println("Привет, " + name + "! В следующем году тебе будет " + age + " лет.");
    }
}

