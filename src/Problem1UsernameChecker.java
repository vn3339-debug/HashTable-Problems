import java.util.*;

public class Problem1UsernameChecker {
    public static void main(String[] args) {

        Map<String, Integer> users = new HashMap<>();
        Map<String, Integer> attempts = new HashMap<>();

        users.put("john_doe", 1);

        String username = "john_doe";

        if (users.containsKey(username)) {
            System.out.println("Username taken");
            System.out.println("Suggestions: " + username + "1, " + username + "2");
        } else {
            System.out.println("Available");
        }

        attempts.put(username, attempts.getOrDefault(username, 0) + 1);

        System.out.println("Attempts: " + attempts.get(username));
    }
}