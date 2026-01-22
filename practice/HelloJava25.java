public class HelloJava25 {
     void main() {
         System.out.println("Hello from Java 25!");
         System.out.println("JDK version: " + System.getProperty("java.version"));
         int x = 6;
         int y = 4;
         int result = x < y ? x : y;
         System.out.println(result);
    }
}
