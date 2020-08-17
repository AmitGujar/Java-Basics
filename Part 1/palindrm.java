import java.util.Scanner;

public class palindrm {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.print("Enter Number = ");
        int n = S.nextInt();
        int rem = 0, rev = 0;
        int m = n;
        while (n > 0) {
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n/10;
        }
        if (m == rev) {
            System.out.println("Number is Palindrome.");
        }
        else
            System.out.println("Number is not Palindrome.");
    }
}
