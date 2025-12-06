import java.util.*;

public class WordCounter {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "apple", "orange", "banana", "apple"};

        Map<String, Integer> countMap = new HashMap<>();

        for (String w : words) {
            countMap.put(w, countMap.getOrDefault(w, 0) + 1);
        }

        System.out.println(countMap);
    }
}

OUTPUT:
{banana=2, orange=1, apple=3}