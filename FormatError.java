import java.util.Scanner;

public class FormatError {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String input = sc.nextLine();

        try {
            int num = Integer.parseInt(input);
            System.out.println("You entered number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Error :" + input + " is not a int!");
        }

        sc.close();
    }
}


// OUTPUT:
// Enter a number: sai

// Error :sai is not a int!
