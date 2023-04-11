import java.util.Scanner;


public class ControlStatementsLoopsLectures {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double discountPercentage = 2.3;
        System.out.println(discountPercentage != 2.0);

        System.out.println(discountPercentage > 2 && discountPercentage == 2.3);

        String name = "nick";
        System.out.println(name == "nick");
        System.out.println("Continue? [y/N]");
        String userInput = in.next();

        boolean confirmation = userInput.equalsIgnoreCase("y");
        System.out.println(confirmation);

        if (discountPercentage > 2) {
//            conditional code
            System.out.println("discount percent is greater than 2.");

            int caseSwitch = 1;
            switch (caseSwitch) {
                case 1:
                    System.out.println("case 1");
                    break;
                case 2:
                    System.out.println("case 2");
                    break;
                case 3:
                    System.out.println("case 3");
                    break;
            }
        }
    }
}
