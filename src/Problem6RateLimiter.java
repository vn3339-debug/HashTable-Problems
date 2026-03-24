import java.util.*;

public class Problem6RateLimiter {
    public static void main(String[] args) {

        Map<String, Integer> requestCount = new HashMap<>();

        String client = "user1";

        for (int i = 1; i <= 5; i++) {
            requestCount.put(client, requestCount.getOrDefault(client, 0) + 1);

            if (requestCount.get(client) > 3) {
                System.out.println("Rate limit exceeded");
            } else {
                System.out.println("Request allowed");
            }
        }
    }
}