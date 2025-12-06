import java.util.*;

public class VowelStringCount {
    public static void main(String[] args) {
        Set<String> words = new HashSet<>(Arrays.asList("apple", "cat", "orange", "ice", "ball"));

        int count = 0;
        for (String w : words) {
            String lower = w.toLowerCase();
            if (lower.startsWith("a") || lower.startsWith("e") || lower.startsWith("i") || lower.startsWith("o") || 
                lower.startsWith("u")) 
            {
                count++;
            }
        }

        System.out.println(count);
    }
}

OUTPUT:
3