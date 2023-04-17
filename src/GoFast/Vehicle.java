package GoFast;

public class Vehicle {
//  Creating an instance variable for this class
    private static String name;
//  Creating the getter
    public static String getName() {return name;}
//  Creating the constructor setter
    public Vehicle(String name) {
        Vehicle.name = name;
    }
//  Method that prints a car noise
    public void makeNoise(){
        System.out.println("vroomm");
    }
//  Using the class WarpStar to extend the vehicle class.
    static class WarpStar extends Vehicle {
//  Creating a constructor to
        public WarpStar(String starName) {
            super(starName);
        }
        public void breakingDownNoise(){
            super.makeNoise();
            System.out.println("skidd");
        }
    public void makeNoise(){
        System.out.println("sparkle sparkle");
    }
    }

    static class Car extends Vehicle {
        public Car(String carName) {
            super(carName);
        }
    }
}
