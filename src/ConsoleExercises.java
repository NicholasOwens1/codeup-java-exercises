import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useDelimiter("\n");
//        double pi = 3.14159;
//        System.out.printf("The value of pi is approximate ely %1.2f%n", pi );
//        System.out.println("enter an integer");
//        int enteredInt = Integer.parseInt(in.next());
//        System.out.println("enter 3 words");
//        String string = in.next();
//        System.out.println(string);
//        String string2 = in.next();
//        System.out.println(string2);
//        String string3 = in.next();
//        System.out.println(string3);
//        System.out.println("enter an sentence");
//        String sentence = in.nextLine();
//        System.out.println(sentence);
            System.out.println("enter a length");
                 double length = Integer.parseInt(in.next());
        System.out.println("enter a width");
                double width = Integer.parseInt(in.next());
                System.out.println("enter a height");
                 double height = Integer.parseInt(in.next());
        System.out.println(length*2 + width*2);
        System.out.println(length*width);
        System.out.println(length*width*height);
//### Bonus exercises -- from Justin Reich

//        1. Prompt the user to enter a favorite quote
//        - output the quote
//        - ask them to enter how many words are in the quote
//        - output the number they entered
//        - output if the number they entered indeed matched the number of words
//
//        2. Prompt the user to enter a list of top three favorite foods separated by only spaces
//
//        - Use the printf() to output the three top foods with the format:
//        1. FirstFood
//        2. SecondFood
//        3. ThirdFood
//
//        3. Prompt the user to enter a grocery list of three items
//                - each item should only be separated by a comma (no spaces)
//        - you will need to use the .useDelimiter() method on your scanner object
//                - output the result as a comma-separated list using printf()
        System.out.println("enter your favorite quote");
        String quote = in.next();
        System.out.println(quote);
        System.out.println("how many words are in the quote?");
        double quoteNums = Integer.parseInt(in.next());
        System.out.println(quoteNums);





    }
}
