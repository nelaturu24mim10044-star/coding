public class CountEven {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 11, 16};
        int count = 0;
        for (int v : arr) {
            if (v % 2 == 0) count++;
        }
        System.out.println(count); 
    }
}

OUTPUT:
3
