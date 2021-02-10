package practicalWork4.work41;

import java.util.Scanner;

public class Task41 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOne;
        System.out.println("Введите первое число: ");
        numberOne = scan.nextInt();

        Scanner scan2 = new Scanner(System.in);
        int numberTwo;
        System.out.println("Введите второе число: ");
        numberTwo = scan2.nextInt();

        Scanner scan3 = new Scanner(System.in);
        int numberThree;
        System.out.println("Введите третье число: ");
        numberThree = scan3.nextInt();

        int numberMax = numberOne;

        if (numberOne < numberTwo) {
            numberMax = numberTwo;
        } if (numberOne < numberThree) {
            numberMax = numberThree;
        }

        System.out.println("Наибольшее значение: " + numberMax);
    }
}
