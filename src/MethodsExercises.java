import java.sql.SQLOutput;
import java.util.Scanner;

public class MethodsExercises {

    static int add(int n1, int n2) {
        return n1 + n2;
    }

    static int subtract(int n1, int n2) {
        return n1 - n2;
    }


    static int divide(int n1, int n2) {
        return n1 / n2;
    }

    static int modulus(int n1, int n2) {
        return n1 % n2;
    }

    public static int getInteger(int min, int max) {
//        set up scanner
        Scanner input = new Scanner(System.in);
//        ask user for number
        System.out.println("enter an integer between " + min + " and " + max);
//        assign variable to user's answer
        int answer = (int) Integer.parseInt(input.next());
        while (answer < min || answer > max) {
            System.out.println("enter a number between " + min + " and " + max);
            answer = (int) Integer.parseInt(input.next());
        }
        System.out.println("Great job! Here is your number.\n");
        return answer;

    }
//    public static long getPower(int base(5), int exponent(4)) {
//    if the exponent is 0 return 1
//        if (exponent == 0) {
//            return 1;
//    if the exponent is 1 return the base
//        } else if (exponent == 1) {
//            return base;
//    if the exponent is 2, square the base
//        } else if (exponent == 2) {
//            return base * base;
//        }
//    otherwise return base *
//        return base * getPower(5, 3);

    //    }
    static int multiply(int n1, int n2) {
        for (int i = n1; i <= n2; i++) {
            n1 += i;
        }
        return n1;
    }

            public static long recursion(int m, int n) {
////        if either input is 0, return 0
        if (m == 0 || n == 0) {
            return 0;
////            otherwise, return m + n-1, this will cause the calculation to loop until n = 0
        } return m + recursion(m, n-1);
        }
    public static int factorial(int num) {
//        System.out.println("Enter an integer from 10 to 10.");
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(recursion(3, 4));
//        System.out.println(getPower(2,3));
        System.out.println(factorial(getInteger(1, 20)));
//        System.out.println(add(3, 4));
//        System.out.println(subtract(10, 10));
//        System.out.println(multiply(3, 5));
//        System.out.println(divide(10, 2));
//        System.out.println(modulus(10, 5));

    }

}

//}