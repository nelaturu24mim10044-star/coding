import java.util.*;

public class SetIntersection {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5, 6));

        set1.retainAll(set2);

        System.out.println(set1);
    }
}

OUTPUT:
[3, 4]