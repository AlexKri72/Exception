/*
 * Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, 
 * и возвращающий новый массив, каждый элемент которого равен разности элементов 
 * двух входящих массивов в той же ячейке. Если длины массивов не равны, необходимо 
 * как-то оповестить пользователя. 
*/
package Homework1;

public class task3 {
    public static void main(String[] args) {
        Integer[] array1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        Integer[] array2 = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        Different(array1, array2);

    }

    public static Integer[] Different(Integer[] arr1, Integer[] arr2) {
        if (arr1.length == arr2.length) {
            Integer[] arr3 = new Integer[arr1.length];
            for (int i = 0; i < arr3.length; i++) {
                arr3[i] = arr1[i] - arr2[i];
            }
            for (Integer i : arr3) {
                System.out.print(i + " ");
            }
            return arr3;
        } else {
            System.out.println("Error: arrays of different lengths, it is impossible to perform the operation!");
            return null;
        }

    }
}
