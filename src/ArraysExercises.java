public class ArraysExercises {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers[0]);

        Person[] personList = new Person[3];
        personList[0] = new Person("Guts");
        personList[1] = new Person("Casca");
        personList[2] = new Person("Griffith");

        for (Person name : personList) {
            System.out.println(name.getName());

//            static void addPerson(String[], Person person) {
//
//            }


        }
    }
}