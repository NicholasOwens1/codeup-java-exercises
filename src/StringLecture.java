import java.util.Scanner;

public class StringLecture {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("continue? [y/N}");
        String userChoice = input.next();
        String message2 = "This is my message";
        int position = message2.indexOf("is");
        System.out.println(position);
        System.out.println(message2.trim());
    }
}
