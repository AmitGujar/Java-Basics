import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class prime {
    //check prime number
    public static void main(String[] args) throws IOException {
        BufferedReader B = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Number = ");
        int n = Integer.parseInt(B.readLine());
        int i, j;
        for (i = 1; i <=n ; i++) {
            for (j = 2; j < i; j++) {
                if (i % j==0)
                    break;
            }
            if (i == j)
                System.out.println("" + i);
        }
    }
}
