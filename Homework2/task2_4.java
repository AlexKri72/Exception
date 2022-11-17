/*
 * Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. 
 * Пользователю должно показаться сообщение, что пустые строки вводить нельзя. 
*/

import java.io.IOException;
import java.util.Scanner;

public class task2_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean isDataValid = false;
        System.out.print("\n\nEnter a string: ");
        do {

            try {
                if (!scan.nextLine().trim().isEmpty()) {
                    System.out.println("Ok, this is correct input!\n\n");
                    isDataValid = true;
                } else {
                    isDataValid = false;
                    throw new IllegalArgumentException("The entered string is empty, try again: ");
                }

            } catch (Exception e) {
                System.out.print("Exception : " + e);
                isDataValid = false;
            }
        } while (!isDataValid);
        scan.close();
    }
}
