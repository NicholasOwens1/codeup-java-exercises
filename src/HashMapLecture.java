import java.util.HashMap;

public class HashMapLecture {
    public static void main(String[] args) {


        HashMap<String, Integer> careerWins = new HashMap<>();
        //Use the .put(0 method to add elements to a hashmap.

        careerWins.put("Gregg Popovich", 1366);
        careerWins.put("Don Nelson", 1335);
        careerWins.put("Lenny Wilkens", 1332);

        System.out.println(careerWins.get("Gregg Popovich"));
        careerWins.replace("Gregg Popovich", 1500);
        System.out.println(careerWins.get("Gregg Popovich"));

        
    }
}