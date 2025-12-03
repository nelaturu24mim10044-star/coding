public class CheckSorted {
    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 5, 7};
        int[] a2 = {3, 1, 4};

        System.out.println("a1 is " + checkSorted(a1));
        System.out.println("a2 is " + checkSorted(a2));
    }

    static String checkSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return "Not Sorted";
            }
        }
        return "Sorted";
    }
}

OUTPUT:
a1 is Sorted
a2 is Not Sorted