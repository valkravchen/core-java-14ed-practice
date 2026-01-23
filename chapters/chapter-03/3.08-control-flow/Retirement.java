import java.util.Scanner;

public class Retirement {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.println("Сколько денег вам нужно, чтобы выйти на пенсию? ");
        double goal = in.nextDouble();
        System.out.println("Сколько денег вы будете вносить каждый год? ");
        double payment = in.nextDouble();
        System.out.println("Процентная ставка в %: ");
        double interestRate = in.nextDouble();
        double balance = 0;
        int years = 0;
        while (balance < goal) {
            balance += payment;
            double interest = balance * interestRate / 100;
            balance += interest;
            years++;
        }
        System.out.println("Вы можете выйти на пенсию через " + years + " лет");
    }
}
