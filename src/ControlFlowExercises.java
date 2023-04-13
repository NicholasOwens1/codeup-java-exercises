import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        int i = 5;
        int j = 2;
        double h = 2;
//        double z = 2;


//        Math.pow(j, 2);
//        while (i <= 15) {
//            System.out.println(i);
//            i++;
//            for (int num = 105; num > -10;) {
//                System.out.println(num -= 5);
//        do {
//            System.out.println(h);
//            h = Math.pow(h, 2);
//        } while (h < 100000);
//            }
//        System.out.println(h);
//        for (double z = 2; z < 10000;) {
//            z = Math.pow(z, 2);
//            System.out.println(z);
//        }
//        }
//    }
        for (long num = 1; num < 101; num++) {
            if (num % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (num % 5 == 0) {
                System.out.println("buzz");
            } else if (num % 3 == 0) {
                System.out.println("fizz");
            } else {
                System.out.println(num);
            }

            Scanner input = new Scanner(System.in);
        }
    }
}

