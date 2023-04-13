public class Crocodile {
    public String name;
    public String sound;

    public String makeNoise() {
        return name +  " goes " + sound;
    }

    public static void main(String[] args) {
        Crocodile KRool = new Crocodile();
        KRool.name = "King K. Rool";
        KRool.sound = "Punch";
        System.out.println(KRool.makeNoise());
    }

}
