import java.util.Scanner;

public class perfect {
    //check perfect number
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.print("Enter Number = ");
        int n = S.nextByte();
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if(n % i == 0){
                sum = sum + i;
            }
        }
        if (sum == n) {
            System.out.println(n + " is Perfect...!!");
        }
        else
            System.out.println(n + " is not Perfect...!!");
    }
}
