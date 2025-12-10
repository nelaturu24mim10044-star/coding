public class TryCatchBlock {
    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.println(c);

            int[] arr = new int[3];
            System.out.println(arr[5]); 

        } catch (ArithmeticException e) {
            System.out.println("You cannot divide by zero.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is invalid.");
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}


// OUTPUT:
// You cannot divide by zero.

// Finally block executed.
