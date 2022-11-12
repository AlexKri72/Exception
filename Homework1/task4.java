/*
 *  4*. Реализуйте метод, принимающий в качестве аргументов 
 * два целочисленных массива, и возвращающий новый массив, 
 * каждый элемент которого равен частному элементов двух 
 * входящих массивов в той же ячейке. 
 * Если длины массивов не равны, необходимо как-то оповестить пользователя. 
 * Важно: 
 * При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше
*/
package Homework1;

public class task4 {
    public static void main(String[] args) {
        Integer[] array1 = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
        Integer[] array2 = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        Different(array1, array2);

    }

    public static Integer[] Different(Integer[] arr1, Integer[] arr2) {
        if (arr1 == null | arr2 == null) {
            System.out.println("Error: Objects do not exist");
            return null;
        } else if (arr1.length == 0 || arr2.length == 0) {
            System.out.println("Error: One or both arrays are empty");
            return null;
        } else if (arr1.length == arr2.length) {
            Integer[] arr3 = new Integer[arr1.length];
            for (int i = 0; i < arr3.length; i++) {
                if (arr2[i] == 0) {
                    System.out.println(
                            "Error: One of the elements of the second array is zero, it cannot be divided by zero!");
                    return null;
                }
                arr3[i] = arr1[i] / arr2[i];
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
