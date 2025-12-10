public class ArrayAccess {
    public static void main(String[] args) {
        int[] arr = new int[5];

        try {
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index is out of range!");
        }
    }
}

OUTPUT:
Index is out of range!
