import java.util.Scanner;

public class Bug {

    //define a variable with any name whose type is an array where each element is a double.
    // Give the array a length of 5
    //  Define a new array with a constant as a variable.
//    Define an array with 5 elements. The array's length will equal the number of elements automatically.
//    Iterate over the 5 element long array you just created and output each element.
//    Iterate over the same array. This time use the enhanced for technique
//    to subtract the last index value from the current index. For example,
//    if the 0 index has a value 5, and the current index us 1 with a value of 10, subtract 5 from 10 so that
//    the new 1 index is 5.
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int[] rolls = new int[5];
//    ask user how many monkeys
//    System.out.println("How many monkeys? Enter an integer, you can't have half a monkey.");
//    final int powerLevel = scanner.nextInt();
//    String[] monkeys = new String[powerLevel];
    double[] list = {12.4, 32.32, 832.34, 1.1, 34.85};
//    for (int i = 0; i < list.length; i++) {
//        System.out.println(list[i]);

    int it = 0;
    for (double numbers : list) {
        System.out.println(it);
        it++;
    }
    }


    }





