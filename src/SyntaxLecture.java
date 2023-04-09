public class SyntaxLecture {
    public static void main(String[] args) {
        /* Declaring variables
         * without initializing */
        int weight;
        // Initialization after declaration
        weight = 12;
        // Initialize and declaee at once
        String breed = "Foo";
        String name= "German Shepherd";
        int rage = 10;
//        System.out.print(name + "is a " + breed);

        //very small numbers: byte datatype
        byte smol = 12;
        System.out.println(smol);
        //declare a long: can hold a big number
        long bigNumber;
//       assign the small value to the large varaible
        //"pour the small bucket into the large bucket"
        bigNumber = smol;
        System.out.println(bigNumber);
        //assign big value to the big bucket
        bigNumber = 900000;
        //  assigning a big value to a smaller data type won't work
        smol = (byte) bigNumber;
        System.out.println(smol);

        float poo;
        long value = 232133;
        double airpod = 22.21123;
    }
}
