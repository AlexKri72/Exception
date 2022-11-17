
/*
Дан следующий код, исправьте его там, где требуется :
 try {
       int a = 90;
       int b = 3;
       System.out.println(a / b);
       printSum(23, 234);
       int[] abc = { 1, 2 };
       abc[3] = 9;
   } catch (Throwable ex) {
       System.out.println("Что-то пошло не так...");
   } catch (NullPointerException ex) {
       System.out.println("Указатель не может указывать на null!");
   } catch (IndexOutOfBoundsException ex) {
       System.out.println("Массив выходит за пределы своего размера!");
   }
}
public static void printSum(Integer a, Integer b) throws FileNotFoundException {
   System.out.println(a + b);
}
*/
import java.io.FileNotFoundException;

public class task2_3 {
    public static void main(String[] args) {

        try {
            int a = 90;
            int b = 3;
            System.out.println(a + " / " + b + " = " + a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (Throwable ex) { // если мы указываем родителя, то остальные подклассы не нужны!
            System.out.println("Что-то пошло не так...");
        } // catch (NullPointerException ex) {
          // System.out.println("Указатель не может указывать на null!");
          // } catch (IndexOutOfBoundsException ex) {
          // System.out.println("Массив выходит за пределы своего размера!");
          // }
    }

    public static void printSum(Integer a, Integer b) throws FileNotFoundException {
        System.out.println(a + " + " + b + " = " + (a + b));
    }

}
