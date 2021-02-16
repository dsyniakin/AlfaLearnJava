package practicalWork6.work64;

import java.util.Scanner;

public class Task64 {
    public static void main(String[] args) {
        System.out.println("Введите целое положительное число:");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        String result = convertDecimalToBinary(number);
        System.out.println("Число в двоичной системе исчесления: " + result);

        //Testing
        //System.out.println("Check: " + Integer.toBinaryString(number));
    }

    public static String convertDecimalToBinary(int number) {
        String result  = "";
        int binary;
        while (number != 0) {
            binary = number % 2;
            result = binary + result;
            number = number / 2;
        }

        return result;
    }
}
