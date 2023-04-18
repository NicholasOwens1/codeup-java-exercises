import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.SplittableRandom;

public class ServerNameGenerator {
//       String array of 10 adjectives
        static String[] adjectives = {"angry", "hungry", "happy", "elated", "crispy","moist", "juicy", "delectable", "relentless","oblivious"};
//       String array of 10 nouns
        static String[] nouns = {"mouse" , "mazda","rage","meathook", "cup","flash","mob","psychic","whip","shirt"};
//      Method that returns a random element from an array of strings.
        static String randomElement(String[] arr) {
            return arr[getRandomInt(0, arr.length -1)];
        }

    public static int getRandomInt(int min, int max) {
        int randomNumber = (int) (Math.random() * max) + min;
        return randomNumber;
    }

    public static void main(String[] args) {
        System.out.println("Here is your server name.");
        System.out.println(randomElement(adjectives) + "-" + randomElement(nouns));
    }
}
