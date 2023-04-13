//defining a Person class.
public class ClassesObjects {
//      creating 5 fields for the class.
    public String firstName;
    public String lastName;
    public String city;
    public String state;
    public int zipCode;
//      creating an instance method inside the class
    public String data(){
        return "My name is " + firstName + " " + lastName + ". " + "I am from " + city + " " + state + ". My zip code is " + zipCode + ".";
     }
//      creating a main method with a new instantiation of the Person class with 5 variables. Then outputting the data method with the instantiation's variables
    public static void main(String[] args) {
        ClassesObjects Nick = new ClassesObjects();
        Nick.lastName = "Owens";
        Nick.firstName = "Nick";
        Nick.city = "San Antonio";
        Nick.state = "Texas";
        Nick.zipCode = 78204;
        ClassesObjects Navia = new ClassesObjects();
        Navia.lastName = "Alexander";
        Navia.firstName = "Navia";
        Navia.city = "San Antonio";
        Navia.state = "Texas";
        Navia.zipCode = 78204;
        System.out.println(Navia.data());
    }
}
    // make 5 fields for the class, or instance variables. First Name, last name, city, state, zip code.

    // create an instance method inside the class,
// also recognized as a field. Make it a string that spits put the 5 objects in a sentence.

        // instantiate a new Person object inside a main method. Give it 5 variables . Output the
// data for the newly instantiated object using the instance method you created.
//
// Create a new Person class inside the main method with new variable values. Output it.