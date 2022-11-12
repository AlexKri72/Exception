public class task4 {
    public static void main(String[] args) {
        Integer[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        Integer[] array1 = { 1, 2, 3, 4, null, 5, 6, 7, 8, 9 };
        Integer[] array2 = { 1, 2, null, 3, 4, null, 5, 6, null, 7, 8, 9 };
        CheckArray(array);
        CheckArray(array1);
        CheckArray(array2);
    }

    public static void CheckArray(Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                System.out.println("Index of NULL-element is: " + i);
            }
        }
    }
}
