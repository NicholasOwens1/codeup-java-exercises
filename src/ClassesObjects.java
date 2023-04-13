//defining a Person class.
public class ClassesObjects {
//      creating 5 fields for the class.
    public String firstName;
    public String lastName;
    public String city;
    public String state;
    public int zipCode;

    
//      creating an instance method inside the class

//      creating a constructor that gives default values to ClassesObjects
    public ClassesObjects() {
//        System.out.println("A new person is born!");
        this.firstName = "no data entered";
        this.lastName = "no data entered";
        this.city = "no data entered";
        this.state = "no data entered";
        this.zipCode = 00000;
    }

    public ClassesObjects(String firstName, String lastName, String city, String state, int zipcode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.state = state;
        this.zipCode = zipcode;
    }
    public String data(){
        return "My name is " + firstName + " " + lastName + ". " + "I am from " + city + " " + state + ". My zip code is " + zipCode + ".";
     }
//      creating a main method with a new instantiation of the Person class with 5 variables. Then outputting the data method with the instantiation's variables
    public static void main(String[] args) {
        ClassesObjects Nick = new ClassesObjects("Nick", "Owens",
                "San Antonio", "Texas" , 78204);
//        Nick.lastName = "Owens";
//        Nick.firstName = "Nick";
//        Nick.city = "San Antonio";
//        Nick.state = "Texas";
//        Nick.zipCode = 78204;
        System.out.println(Nick.data());
        ClassesObjects Navia = new ClassesObjects("Navia", "Alexander",
                "San Antonio", "Texas", 78204 );
//        Navia.lastName = "Alexander";
//        Navia.firstName = "Navia";
//        Navia.city = "San Antonio";
//        Navia.state = "Texas";
//        Navia.zipCode = 78204;
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
//Create a constructor method that outputs "A new person is born!"
//Comment out the "A new person is born!" output code.
//Refactor your code to give the 5 data values defaults of "no data entered"
// to new classes automatically using constructors.
//Create another constructor that can specifies the 5 data values when the object is created.
// In the main argument, comment out the old instantiation code.
// Instantiate the classes and input the 5 data values as arguments when they are created instead of
// writing out a new variable list.
// Refactor the code to do the same thing using  the "this" keyword