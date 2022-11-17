/*
 * Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение. 
 * Ввод текста вместо числа не должно приводить к падению приложения, 
 * вместо этого, необходимо повторно запросить у пользователя ввод данных.
 * 
 * Решение: число с плавающей запятой вводится по америнканской системе - через ТОЧКУ!
*/

import java.util.Scanner;

public class task2_1 {
    public static void main(String[] args) {
        System.out.println("Yes, this is correct number: " + enteredFloat() + "\n\n");
    }

    public static Float enteredFloat() {
        Scanner scan = new Scanner(System.in);
        boolean isDataValid = false;
        Float yourNumber = null;
        System.out.print("\n\nEnter a float number: ");
        do {

            try {
                String inputString = scan.next();
                if (inputString.contains(".")) {
                    yourNumber = Float.parseFloat(inputString);
                    isDataValid = true;
                } else {
                    System.out.print("The entered number is not a float, try again: ");
                    isDataValid = false;
                }

            } catch (NumberFormatException e) {
                System.out.print("The entered number is not a float, try again: ");
                isDataValid = false;
            }
        } while (!isDataValid);
        scan.close();
        return yourNumber;
    }
}
