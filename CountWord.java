import java.util.HashMap;
import java.util.Map;

public class CountWord {
    public static void main(String[] args) {
        String[] input = { "xc", "dz", "bbb", "dz" };
        String[] query = { "bbb", "ac", "dz" };
        int[] result = countOccurrences(input, query);

        for (int count : result) {
            System.out.print(count + " ");
        }
        // Output: 1 0 2
    }

    public static int[] countOccurrences(String[] input, String[] query) {
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : input) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        int[] result = new int[query.length];
        for (int i = 0; i < query.length; i++) {
            result[i] = wordCount.getOrDefault(query[i], 0);
        }

        return result;
    }
}
