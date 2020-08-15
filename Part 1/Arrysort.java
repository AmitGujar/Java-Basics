import java.util.Arrays;

class Arrysort {
    public static void main(String[] args) {
        //2-D Array mosh
        int[][] numbers = {{3, 2, 1}, {4, 5, 6}};
        //deep to string shows array in string format for multi d array
        Arrays.sort(numbers);
        System.out.println(Arrays.deepToString(numbers));
    }
}