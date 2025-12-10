public class LinearSearchMessage {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20};
        int search = 15;

        System.out.println(searchElement(arr, search));
    }

    static String searchElement(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key)
                return "Element found at index " + i;
        }
        return "Element not found";
    }
}

// OUTPUT:
// Element found at index 2
