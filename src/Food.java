public class Food {

    public String name;

    //  Name getter.
    public Food(String name) {
        this.name = name;
    }

    //  Output a message with the name variable.
    public void sayHello() {
       System.out.println("hello from " + name);
    }
}
//  This class will take on the fields of the class it extends from. It extends from Food.
    class Vegetable extends Food {
        public Vegetable(String vegetableName){
            super(vegetableName);
        }

    public void sayHello() {
        System.out.println("wassup");
    }

//  main method to
    public static void main(String[] args) {
        Vegetable tomato = new Vegetable("tomato");
        tomato.sayHello();
        System.out.println(tomato.name);
    }
}