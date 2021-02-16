package practicalWork6.work62;

import java.util.Scanner;

public class Task62 {
    public static void main(String[] args) {
        System.out.println("Введите целое число:");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        String result = latestDigit(number);
        System.out.println("Последние два числа наоборот: " + result);
    }

    public static String latestDigit(int number) {
        int number1 = number % 10;
        int number2 = number % 100 / 10;
        String result;

        if (number > -10 && number < 10) {
            result = "Введите как минимум двухзначное число";
        }  else if (number < -10) {
            result = "" + number1 + "" + number2 * -1;
        } else {
            result = "" + number1 + "" + number2;
        }
        return result;
    }
}
