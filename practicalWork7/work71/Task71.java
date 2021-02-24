package practicalWork7.work71;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Task71 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите кол-во элементов массива:");
        int size = scan.nextInt();

        if (size <= 0) {
            System.out.println("Введен некорректное значение кол-ва элементов массива");;
        } else {
            int[] mas = new int[size];
            mas = createArray(size);
            System.out.println(Arrays.toString(mas));
        }
    }

    public static int[] createArray(int size) {
        int[] mas = new int[size];
        int var = 0;
        for(int i = 0; i < mas.length; i++) {
            mas[i] = var + 2;
            var = var + 2;
        }
        return mas;
    }
}
