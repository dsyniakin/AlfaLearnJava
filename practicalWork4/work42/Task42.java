package practicalWork4.work42;

import java.util.Scanner;

public class Task42 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число: ");
        int varNumber;
        varNumber = scan.nextInt();

        if(varNumber <=0 || varNumber > 9 ) {
            System.out.println("Другое");
        } else if (varNumber == 1) {
            System.out.println("Один");
        } else if (varNumber == 2) {
            System.out.println("Два");
        } else if (varNumber == 3) {
            System.out.println("Три");
        } else if (varNumber == 4) {
            System.out.println("Четыре");
        } else if (varNumber == 5) {
            System.out.println("Пять");
        } else if (varNumber == 6) {
            System.out.println("Шесть");
        } else if (varNumber == 7) {
            System.out.println("Семь");
        } else if (varNumber == 8) {
            System.out.println("Восемь");
        } else {
            System.out.println("Девять");
        }
    }
}
