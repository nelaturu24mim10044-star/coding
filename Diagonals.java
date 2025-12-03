public class Diagonals {
    public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int n = mat.length;

        System.out.print("Primary diagonal: ");
        for (int i = 0; i < n; i++) {
            System.out.print(mat[i][i]);
            if (i < n - 1) System.out.print(" ");
        }
        System.out.println();

        System.out.print("Secondary diagonal: ");
        for (int i = 0; i < n; i++) {
            System.out.print(mat[i][n - 1 - i]);
            if (i < n - 1) System.out.print(" ");
        }
        System.out.println();
    }
}

OUTPUT:
Primary diagonal: 1 5 9
Secondary diagonal: 3 5 7
