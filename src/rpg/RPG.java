package rpg;
//Create a class for your favorite type of animal.
//        The class should be named for your animal - Cat, Dog, Parrot etc.
//        It should have two instance variables - name and sound - and one method - makeNoise().
//        The output of the makeNoise method should be name +  " goes " + sound. Create a test class with a
//        main method to instantiate and test your class code.
public class RPG {
    public static void main(String[] args) {
        Fighter fighter1 = new Fighter();
        fighter1.name = "Monkey";
        fighter1.hitPoints = 17;
        fighter1.maxDamage = 14;

        Fighter fighter2 = new Fighter();
        fighter2.name = "Frieza";
        fighter2.hitPoints = 100;
        fighter2.maxDamage = 150;

    }

}
