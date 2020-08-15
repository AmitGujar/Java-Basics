import java.util.Scanner;
// two dimentional array
class Twoarry {
    public static void main(String[] args) {
        int n, i, j;
        Scanner S = new Scanner(System.in);

        System.out.println("Enter the N = ");
        n = S.nextInt();

        System.out.println("Enter the M = ");
        int m = S.nextInt();
        int[][] a = new int[n][m];

        System.out.println("Enter Array Elements = ");
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                a[i][j] = S.nextInt();
            }
        }
        System.out.println("Array Elements = ");
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                System.out.println(a[i][j]);
            }
            System.out.println();
        }
    }
}