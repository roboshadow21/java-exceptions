package homework;

import java.util.Arrays;

public class lesson_1 {
    public static void main(String[] args) {
        //    Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
        System.out.println(test1(2, -3));
        System.out.println(Arrays.toString(test2(-3)));
        System.out.println(test3("asd4"));
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

}
