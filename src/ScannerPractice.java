import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter name");
        String name = scanner.next();
        System.out.println("Hello, " +name);
    }
}
