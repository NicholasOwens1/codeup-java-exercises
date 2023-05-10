package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        System.out.println("Enter something");
        return scanner.nextLine();
    }

    boolean yesNo(String prompt) {
        System.out.println("Enter Y or N");
        String choice = scanner.nextLine();
        return choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("yes")
                || choice.equalsIgnoreCase("si") || choice.equalsIgnoreCase("ye");

    }

    int getInt(String prompt) {
        System.out.println("Enter an integer");
        return scanner.nextInt();
    }

    int getInt(int min, int max, String prompt) {
//        set up scanner
        this.scanner = new Scanner(System.in);
//        ask user for number
        System.out.println("enter an integer between " + min + " and " + max);
//        assign variable to user's answer
        int answer = scanner.nextInt();
        while (answer < min || answer > max) {
            System.out.println("enter a number between " + min + " and " + max);
            answer = scanner.nextInt();
        }
        System.out.println("Great job! Here is your number.\n");
        return answer;
    }

    double getDouble() {
        System.out.println("Enter a decimal number");
        return scanner.nextDouble();
    }

    double getDouble(double min, double max) {
//        set up scanner
        this.scanner = new Scanner(System.in);
//        ask user for number
        System.out.println("enter an integer between " + min + " and " + max);
        String userInput = getString();
        try {
            Double.valueOf(userInput);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a number.");
            return getDouble(min, max);
        }
//        assign variable to user's answer
        double answer = scanner.nextDouble();
        while (answer < min || answer > max) {
            System.out.println("enter a number between " + min + " and " + max);
            answer = scanner.nextDouble();
        }
        System.out.println("Great job! Here is your number.\n");
        return answer;
    }
}

//        }