import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Talk to Bob");
        String talk = scanner.nextLine();
        if (talk.trim().isEmpty()) {
            System.out.println("Fine. Be that way!");
        } else if (talk.endsWith("?")) {
            System.out.println("Sure");
        } else if (talk.endsWith("!")) {
            System.out.println("Whoa, chill out!");
        } else System.out.println("Whatever.");
    }
}
