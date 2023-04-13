//defining a Person class.
public class Person {
    public String firstName;
    public String lastName;
    public String city;
    public String state;
    public int zipCode;

    public String data(){
        return "My name is " + firstName + " " + lastName + ". " + "I am from " + city + " " + state + ". My zip code is " + zipCode + ".";
     }

    public static void main(String[] args) {
        Person Nick = new Person();
        Nick.lastName = "Owens";
        Nick.firstName = "Nick";
        Nick.city = "San Antonio";
        Nick.state = "Texas";
        Nick.zipCode = 78204;
        System.out.println(Nick.data());
    }
}
    // make 5 fields for the class, or instance variables. First Name, last name, city, state, zip code.

    // create an instance method inside the class,
// also recognized as a field. Make it a string that spits put the 5 objects in a sentence.

        // instantiate a new Person object inside a main method. Give it 5 variables . Output the
// data for the newly instantiated object using the instance method you created.
