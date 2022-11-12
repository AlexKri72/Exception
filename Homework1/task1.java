//Реализуйте 3 метода, чтобы в каждом из них получить 
//разные исключения

package Homework1;

import java.io.FileReader;

public class task1 {
    public static void main(String[] args) {
        Integer[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        for (Integer i : Metod1(array, 4)) {
            System.out.print(i + " ");
        }
        /*
         * Будет вот такое исключение:
         * 0 0 0 1 1 1 1 2 2 Exception in thread "main" java.lang.ArithmeticException: /
         * by zero
         * at Homework1.task1.Metod1(task1.java:35)
         * at Homework1.task1.main(task1.java:18)
         */
        for (Integer i : Metod1(array, 0)) {
            System.out.print(i + " ");
        }
        /*
         * Будет вот такое исключение:
         * 1 2 3 4 5 6 7 8 9 Exception in thread "main"
         * java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9
         * at Homework1.task1.Metod2(task1.java:31)
         * at Homework1.task1.main(task1.java:17)
         */
        Metod2(array);
        /*
         * Вот с бесконечной рекурсией:
         * at Homework1.task1.Metod3(task1.java:49)
         * at Homework1.task1.Metod3(task1.java:49)
         * at Homework1.task1.Metod3(task1.java:49)
         * at Homework1.task1.Metod3(task1.java:49)
         * at Homework1.task1.Metod3(task1.java:49)
         * at Homework1.task1.Metod3(task1.java:49)
         * at Homework1.task1.Metod3(task1.java:49)
         * at Homework1.task1.Metod3(task1.java:49)
         * at Homework1.task1.Metod3(task1.java:49)
         * at Homework1.task1.Metod3(task1.java:49)
         * at Homework1.task1.Metod3(task1.java:49)
         * at Homework1.task1.Metod3(task1.java:49)
         * at Homework1.task1.Metod3(task1.java:49)
         * PS C:\Users\1\Desktop\Exception> ^C
         */
        Metod3(array);
        /*
         * Будет вот таккая ошибка:
         * PS C:\Users\1\Desktop\Exception> c:; cd 'c:\Users\1\Desktop\Exception'; &
         * 'C:\Program Files\Java\jdk-18.0.1.1\bin\java.exe' '--enable-preview'
         * '-XX:+ShowCodeDetailsInExceptionMessages' '-cp'
         * 'C:\Users\1\AppData\Roaming\Code\User\workspaceStorage\
         * 8e6d3d0bfc14fab94af179fc08474dbf\redhat.java\jdt_ws\Exception_ab473d1f\bin'
         * 'Homework1.task1'
         * 0 0 0 1 1 1 1 2 2 file1.txt (Не удается найти указанный файл)
         */
        Metod4();
    }

    public static int[] Metod1(Integer[] array1, int num) {
        int[] arrOut = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            arrOut[i] = array1[i] / num;
        }
        return arrOut;
    }

    public static void Metod2(Integer[] array) {
        for (int i = 0; i < 20; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void Metod3(Integer[] array) {
        Metod3(array);
    }

    public static void Metod4() {
        try {
            FileReader file = new FileReader("file1.txt");
            file.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
