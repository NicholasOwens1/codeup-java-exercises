package Animal;

public class SayQuote {
    public static void main(String[] args) {
        Crocodile Killer = new Crocodile("Killer", Quote.randomQuote());
        System.out.println(Killer.makeNoise());
    }
}
