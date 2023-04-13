package Animal;

public class Crocodile {
    private String name;
    private String sound;
//  getter to get name out of private status
    public String getName(){
        return name;
    }
//  getter to get sound out of private status
    public String getSound(){
        return sound;
    }
//  creating a setter to set sound
    public void setSound(String sound){
        this.sound = sound;
    }

    public Crocodile(String name, String sound){
        this.name = name;
        this.sound = sound;

    }



    public String makeNoise() {
        return name +  " goes " + sound;
    }



//    public static void main(String[] args) {
//        Animal.Crocodile KRool = new Animal.Crocodile();
//        KRool.name = "King K. Rool";
//        KRool.sound = "Punch";
//        System.out.println(KRool.makeNoise());
//    }

}
