import java.sql.SQLOutput;

public class MethodsLecture {
    public static void main(String[] args) {
        System.out.println(sayHello("meek"));
    }
    public static String sayHello() {
        String message = "Hello";
        return message;
    }

    public static String sayHello(String name) {
      String message = "Hello, " + name + "!";
      return message;
    }
    public static int returnTwo() {
        return 2;
    }
    public static void count(int n) {
        if (n <= 0) {
            System.out.println("All done!");
            return;
        }
        System.out.println(n);
        count(n - 1);
    }
}
