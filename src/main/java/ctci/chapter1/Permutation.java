package ctci.chapter1;


import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Approaches
 * Sort both of them and see if they equal each other (NLogN)
 * Create a hashmap of occurrences and check if keys/values match. (N)
 */
public class Permutation {
    public boolean isPermutation(final String str1, final String str2) {
        final Map<Character, Long> strMap1 = createOccurrenceMap(str1);
        final Map<Character, Long> strMap2 = createOccurrenceMap(str2);
        return strMap1.entrySet().stream()
                .allMatch(e -> strMap2.containsKey(e.getKey()) && strMap2.get(e.getKey()).equals(e.getValue()));
    }

    private Map<Character, Long> createOccurrenceMap(final String str) {
        return str.chars().mapToObj(i -> (char) i)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }
}
