package rpg;

public class D20 {
    public static int rolld20(){
//        casts the double that math.random produces to int;
        return (int) (Math.random() * 20) + 1;
    }
}
