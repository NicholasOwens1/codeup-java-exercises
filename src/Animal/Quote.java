package Animal;

public class Quote {
    public static String randomQuote() {
//        casts the double that math.random produces to int;
        int num = (int)(Math.random() * 4) + 1;
        if (num == 4 ) {
            return "I will never draw my sword for another man again, or be dangled by another mans dream." ;
        } else if (num == 3) {
            return "A dream, it’s something you do for yourself, not for others";
        } else if (num == 2) {
            return "It's your life. Do what you want with it.";
        } else if (num == 1) {
            return "From where I stand...you're the same as that idol you worship. Completely hollow.";
        }   return "";
}
}


