package GoFast;

public class Garage {

    private static String name;

    public static String getName() {
        return name;
    }

    public Garage() {
        Garage.name = name;
    }

    Vehicle[] vehicles;

    public void alarmCascade(){
        for (Vehicle vehicle : this.vehicles) {
           vehicle.makeNoise();
        }
    };



}
