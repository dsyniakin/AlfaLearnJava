package practicalWork6.work65;

import java.util.Scanner;

public class Task65 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите высоту пирамиды от 1 до 9:");
        int height = scan.nextInt();

        printPyramid(height);
    }

    public static void printPyramid(int height) {
        if (height < 1 || height > 9) {
            System.out.println("Высота введена не правильно!");
        } else {
            int b = 1;
            while (b <= height) {
                String line = "" + b;
                int c = b;
                int d = 0;
                while (c > 1) {
                    d = c - 1;
                    line = d + line + d;
                    c--;
                }
                System.out.print(line);
                b++;
                System.out.println();
            }
        }
    }
}
