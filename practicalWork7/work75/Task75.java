package practicalWork7.work75;

import java.util.Arrays;
import java.util.Scanner;

public class Task75 {

    //В процессе разработки

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите цифры от 1 - 9:");
        String numbers = scan.nextLine();

        countOfSequenceNumbers(numbers);
    }

    public static int[] countOfSequenceNumbers(String numbers) {
        int[] mass = new int[numbers.length()];

        int indexnumber = 0;

        for (int i : mass) {
            int a = numbers.charAt(indexnumber);
            mass[i] = a;
            indexnumber = indexnumber + 1;

            if (indexnumber > numbers.length()) {
                break;
            }

        }

        for (int j = 0; j < mass.length; j++) {
            System.out.println(mass[j]);
        }

        return mass;
    }
}
