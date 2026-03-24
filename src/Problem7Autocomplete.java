import java.util.*;

public class Problem7Autocomplete {
    public static void main(String[] args) {

        Map<String, Integer> queries = new HashMap<>();

        queries.put("java tutorial", 5);
        queries.put("javascript", 3);

        String prefix = "jav";

        for (String q : queries.keySet()) {
            if (q.startsWith(prefix)) {
                System.out.println("Suggestion: " + q);
            }
        }
    }
}