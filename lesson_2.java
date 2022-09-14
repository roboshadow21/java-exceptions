package homework;

import java.util.Scanner;

public class lesson_2 {

    public static void main(String[] args) {
        System.out.println(returnFloatNumber());

    }
    public static float returnFloatNumber() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number: ");
        while (!scan.hasNextFloat()) {
            System.out.println("Error! Enter float number, separator - ',': ");
            scan.nextLine();
        }
        return scan.nextFloat();
    }
}
