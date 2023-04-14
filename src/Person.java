public class Person {
//  private field String name
    private String name;
//  public method giving access to the private "name"
    public String getName(){
        return name;
    }
//  sets
    public void setName(String name){
        this.name = name;
    }
    public void sayHello(){
        System.out.println(getName());
    }

    public Person(String name){
        System.out.println("A new person is created!");
       this.name = name;
    }

    public static void main(String[] args) {
        Person Jake = new Person("Jake");
        System.out.println(Jake.getName());
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);
        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());




    }}
