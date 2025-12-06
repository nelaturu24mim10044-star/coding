import java.util.*;

public class MergeLists {
    public static void main(String[] args) {
        int[] list1 = {5, 2, 8};
        int[] list2 = {8, 3, 1};

        List<Integer> merged = new ArrayList<>();

        for (int num : list1) {
            if (!merged.contains(num)) {
                merged.add(num);
            }
        }

        for (int num : list2) {
            if (!merged.contains(num)) {  
                merged.add(num);
            }
        }

        Collections.sort(merged);

        System.out.println(merged);
    }
}

OUTPUT:
[1, 2, 3, 5, 8]