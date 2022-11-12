
public class task1 {

    public static final int MIN_LENGTH = 3;

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7 };
        int[] array1 = { 1, 2 };
        checkArrayLength(array);
        System.out.println(checkArrayLength(array1));
    }

    public static int checkArrayLength(int[] array) {
        if ((array == null) || (array.length <= MIN_LENGTH)) {
            System.out.println("The array is null or empty");
            return -1;
        } else {
            System.out.println("The array length is " + array.length);
            return array.length;
        }

    }
}