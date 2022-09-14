package homework;

import java.util.Scanner;

public class lesson_2 {

    public static void main(String[] args) {

//        Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает
//        введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, вместо этого,
//                необходимо повторно запросить у пользователя ввод данных.

        System.out.println(returnDoubleNumber());

//    Если необходимо, исправьте данный код (задание 2
//    https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)

//        int[] intArray = {1, 2, 6, 4};
//        try {
//            int d = 0;
//            double catchedRes1 = (double) intArray[8] / d;
//            System.out.println("catchedRes1 = " + catchedRes1);
//        } catch (ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException | ClassCastException e) {
//            System.out.println("Catching exception: " + e);
//
//        }


//        Дан следующий код, исправьте его там, где требуется (задание 3
//        https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)


//        public static void main(String[] args) {
//            try {
//                int a = 90;
//                int b = 3;
//                System.out.println(a / b);
//                printSum(23, 234);
//                int[] abc = { 1, 2 };
//                abc[3] = 9;
//            } catch (ArithmeticException ex) {
//                System.out.println("Указатель не может указывать на null!");
//            } catch (ArrayIndexOutOfBoundsException ex) {
//                System.out.println("Массив выходит за пределы своего размера!");
//            } catch (Throwable ex) {
//                System.out.println("Что-то пошло не так...");
//        }
//        public static void printSum(Integer a, Integer b) throws IllegalArgumentException {
//            System.out.println(a + b);
//        }





    }

    public static Double returnDoubleNumber() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number: ");
        while (!scan.hasNextDouble()) {
            System.out.println("Error! Enter float number, separator - ',': ");
            scan.nextLine();
        }
        return scan.nextDouble();
    }

}
