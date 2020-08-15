import java.util.Scanner;

class Maxthree{
    public static void main(String[] args) {
        //maximum of three numbers
        int a, b, c;
        Scanner S = new Scanner(System.in);
        System.out.println("Enter Value for A = ");
        a = S.nextByte();
        System.out.println("Enter Value for B = ");
        b = S.nextByte();
        System.out.println("Enter Value for C = ");
        c = S.nextByte();
        if (a > b && a > c) {
            System.out.println("A is Greater");
        }
        else if (b > a && b > c) {
            System.out.println("B is Greater");
        }
        else
            System.out.println("C is Greater");
    }
}