import java.sql.SQLOutput;
import java.util.ArrayList;

public class CollectionsLesson {
    public static void main(String[] args) {
        ArrayList<Integer>  numbers = new ArrayList<>();
        numbers.add(20); //adding an element
        numbers.add(0, 21); //specify an index. 1st argument is the index to place the element, second is the element to be placed
        numbers.add(22);
        System.out.println(numbers);
        System.out.println(numbers.size()); //output the size of the ArrayList. Note we use "size", not "length"
        System.out.println(numbers.get(0)); // output the first element
        System.out.println(numbers.indexOf(21)); // output the index of the "21" element
        System.out.println(numbers.indexOf("monkey")); // try to output an element that isn't in the ArrayList

        ArrayList<String> roasts = new ArrayList<>();
        roasts.add("light");
        roasts.add("medium");
        roasts.add("medium");
        roasts.add("dark");

//        System.out.println(roasts.isEmpty()); // output whether the list is empty or not.
    }
}


//
