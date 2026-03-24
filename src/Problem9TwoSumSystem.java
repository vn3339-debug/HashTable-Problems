import java.util.*;

public class Problem10MultiLevelCache {
    public static void main(String[] args) {

        Map<String, String> L1 = new HashMap<>();
        Map<String, String> L2 = new HashMap<>();

        String video = "video1";

        L2.put(video, "SSD Data");

        if (L1.containsKey(video)) {
            System.out.println("L1 HIT");
        } else if (L2.containsKey(video)) {
            System.out.println("L2 HIT → Promoted to L1");
            L1.put(video, L2.get(video));
        } else {
            System.out.println("L3 DB HIT");
        }
    }
}