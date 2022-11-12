public class task3 {
    public static void main(String[] args) {
        int[][] array = { { 1, 1, 0 }, { 0, 1, 1 }, { 1, 0, 1 } };
        int[][] array1 = { { 1, 1, 3 }, { 0, 1, 1 }, { 1, 0, 1 } };
        int[][] array2 = { { 0, 1, 1 }, { 1, 0, 1 } };

        ArraySum(array);
        ArraySum(array1);
        ArraySum(array2);
    }

    public static int ArraySum(int[][] array)

    {
        if (array.length != array[0].length) {
            System.out.println("Array is not square!");
            return -1;
        } else {
            int sum = 0;
            for (int[] i : array) {
                for (int j : i) {
                    if (j == 0 || j == 1) {
                        sum = sum + j;
                    } else {
                        System.out.println("Contains of the array is not valid!");
                        return -1;
                    }
                }

            }
            System.out.println("Array sum is " + sum);
            return sum;
        }
    }
}
