import java.util.Scanner;

public class gcdnum {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Print First Number = ");
        int n1 = S.nextInt();
        System.out.println("Print Second Number = ");
        int n2 = S.nextInt();
        int i, ans = 0;
        for (i = 1; i <= n1 && i <=n2; i++) {
            if ((n1 % i == 0) && (n2 % i == 0))
                ans = i;
        }
        System.out.println("GCD = " + ans);
    }
}
