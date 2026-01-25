package lambda;

import java.util.Arrays;
import java.util.Date;
import javax.swing.*;
import javax.swing.Timer;

/**
 * В этой программе демонстрируется
 * применение лямбда-выражений
 */
public class LambdaTest {
    static void main() {
        String[] planets = new String[]{
                "Mercury", "Venus", "Earth",
                "Mars", "Jupiter", "Saturn",
                "Uranus", "Neptune"
        };
        System.out.println(Arrays.toString(planets));
        System.out.println("Отсортировано в порядке словаря:");
        Arrays.sort(planets);
        System.out.println(Arrays.toString(planets));
        System.out.println("Отсортировано по длине:");
        Arrays.sort(planets, (first, second) -> first.length() - second.length());
        System.out.println(Arrays.toString(planets));
        Timer timer = new Timer(1000, event -> System.out.println("Сейчас " + new Date()));
        timer.start();
        //выполнять программу до тех пор, пока пользователь
        //не выберет экранную кнопку "ОК"
        JOptionPane.showMessageDialog(null, "Выйти из программы?");
        System.exit(0);
    }
}
