import java.util.HashMap;

public class HashMapLesson {
    public static void main(String[] args) {


    HashMap<String, String> usernames = new HashMap<>();

// and putting some data into it
usernames.put("Ryan", "ryanorsinger");
usernames.put("Zach", "zgulde");
usernames.put("Fernando", "fmendozaro");
usernames.put("Justin", "jreich5");
        System.out.println(usernames);
        System.out.println(usernames.get("Zach"));
        System.out.println(usernames.containsValue("jreich5"));
}
    }