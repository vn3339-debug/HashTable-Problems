import java.util.*;

public class Problem5AnalyticsDashboard {
    public static void main(String[] args) {

        Map<String, Integer> pageViews = new HashMap<>();
        Map<String, Integer> sources = new HashMap<>();

        pageViews.put("/home", 1);
        pageViews.put("/home", pageViews.getOrDefault("/home", 0) + 1);

        sources.put("google", sources.getOrDefault("google", 0) + 1);
        sources.put("facebook", sources.getOrDefault("facebook", 0) + 1);

        System.out.println("Page Views: " + pageViews);
        System.out.println("Sources: " + sources);
    }
}