import java.util.*;

public class Problem2FlashSaleInventory {
    public static void main(String[] args) {

        Map<String, Integer> stock = new HashMap<>();
        Queue<Integer> waitingList = new LinkedList<>();

        stock.put("IPHONE", 2);

        for (int user = 1; user <= 4; user++) {
            if (stock.get("IPHONE") > 0) {
                stock.put("IPHONE", stock.get("IPHONE") - 1);
                System.out.println("User " + user + " purchased successfully");
            } else {
                waitingList.add(user);
                System.out.println("User " + user + " added to waiting list");
            }
        }
    }
}