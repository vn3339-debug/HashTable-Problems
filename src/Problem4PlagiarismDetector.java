import java.util.*;

public class Problem4PlagiarismDetector {
    public static void main(String[] args) {

        String doc1 = "java is easy to learn";
        String doc2 = "java is easy and powerful";

        Set<String> set1 = new HashSet<>(Arrays.asList(doc1.split(" ")));
        Set<String> set2 = new HashSet<>(Arrays.asList(doc2.split(" ")));

        set1.retainAll(set2);

        System.out.println("Matching words: " + set1);
        System.out.println("Similarity: " + set1.size() * 10 + "%");
    }
}