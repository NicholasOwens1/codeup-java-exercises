package GoFast;

public class GarageTest {

    public static void main(String[] args) {
        Garage garage = new Garage();
        garage.vehicles = new Vehicle[3];
        garage.vehicles[0] = new Lambo("Huracan");
        garage.vehicles[1] = new Mazda("Mazda 3");
        garage.vehicles[2] = new Jeep("Grand Cherokee");
        garage.alarmCascade();
    }

}
