import java.util.*;

public class Problem3DNSCache {
    public static void main(String[] args) {

        Map<String, String> cache = new HashMap<>();

        String domain = "google.com";

        if (cache.containsKey(domain)) {
            System.out.println("Cache HIT: " + cache.get(domain));
        } else {
            String ip = "172.217.14.206";
            cache.put(domain, ip);
            System.out.println("Cache MISS → Stored: " + ip);
        }
    }
}