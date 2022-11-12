import java.util.Arrays;

public class task2 {
    public static final int MIN_LENGTH = 3;

    public static void main(String[] args) {

        int[] array = { 1, 2, 3, 4, 5, 6, 7 };
        int[] array1 = { 1, 2 };

        System.out.println(checkArrayLength(array, 1));
        System.out.println(checkArrayLength(array1, 1));
        System.out.println(checkArrayLength(array, 10));
        System.out.println(checkArrayLength(null, 10));
    }

    public static int checkArrayLength(int[] array, int num) {

        if (array == null) {
            System.out.println("The array is empty");
            return -3;
        } else if (array.length <= MIN_LENGTH) {
            System.out.println("The array length is small");
            return -1;
        } else if (Arrays.stream(array)
                .anyMatch(x -> x == num)) {
            System.out.println("The array contains the value " + num);
            return 1;
        } else {
            System.out.println("The array dont contains the value " + num);
            return -2;
        }

    }
}
