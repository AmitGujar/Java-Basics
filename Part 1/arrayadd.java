import java.util.Scanner;
//addition and mean of array
public class arrayadd {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        System.out.print("Enter Size of Array = ");
        int n = S.nextInt();
        int [] a = new int[n];
        int sum = 0;
        System.out.print("Enter Array Elements = ");
        for (int i = 0; i < n; i++) {
            a[i] = S.nextInt();
            sum = sum + a[i];
        }
        for (int i = 0; i < n; i++) {
            System.out.println(a[i] + "");

        }
        System.out.println("Addition of Array = " + sum);
        float mean = (float)sum / n;
        System.out.println("Mean of Array = " + mean);
    }
}
