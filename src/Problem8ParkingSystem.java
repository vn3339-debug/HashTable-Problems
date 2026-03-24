import java.util.*;

public class Problem8ParkingSystem {
    public static void main(String[] args) {

        int[] parking = new int[5]; // 0 = empty

        int vehicleHash = "ABC123".hashCode() % 5;

        int spot = Math.abs(vehicleHash);

        while (parking[spot] == 1) {
            spot = (spot + 1) % 5;
        }

        parking[spot] = 1;

        System.out.println("Vehicle parked at spot: " + spot);
    }
}