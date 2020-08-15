import java.util.Arrays;
//one dimentional array
class Onearry {
    public static void main(String[] args) {
        int[] numbers = {4,1,3,2,5};
        Arrays.sort(numbers);
        System.out.println("Array Size = " + numbers.length);
        System.out.println("Array = " + Arrays.toString(numbers));
    }
}