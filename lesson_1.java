package homework;

import java.util.Arrays;

public class lesson_1 {
    public static void main(String[] args) {
        //    Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

        System.out.println(test1(2, -3));
        System.out.println(Arrays.toString(test2(-3)));
        System.out.println(test3("asd4"));

//        Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
//        каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. Если длины
//        массивов не равны, необходимо как-то оповестить пользователя.

        int[] arr1 = {5, 6, 4};
        int[] arr2 = {3, 2, 2, 7};
        System.out.println(Arrays.toString(arraysDiff(arr1, arr2)));
    }

    public static int test1(int x, int y) {
        int res = x + y;
        if (x < 0 || y < 0) {
            throw new IllegalArgumentException("Value supposed to be positive!");
        }
        return res;
    }
    public static int[] test2(int num) {
        if (num < 0) {
            throw new NegativeArraySizeException("Array size should be positive!");
        }
        int[] arr = new int[num];
        return arr;
    }
    public static Character test3(String arg) {
        if (arg.length() < 5) {
            throw new StringIndexOutOfBoundsException("String length should be more then 4");
        }
        return arg.charAt(5);
    }

    public static int[] arraysDiff(int[] arr1, int[] arr2) {
        int[] resultArr = new int[arr1.length];
        int sum = 0;
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Arrays length should be equal!");
        }
        for (int i = 0; i < arr1.length; i++) {
            resultArr[i] = arr1[i] - arr2[i];
        }
        return resultArr;
    }

}
