package GoFast;

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle.WarpStar legend = new Vehicle.WarpStar("hydra");
//        System.out.println(legend.getName());
        legend.makeNoise();
        legend.breakingDownNoise();
    }
}

