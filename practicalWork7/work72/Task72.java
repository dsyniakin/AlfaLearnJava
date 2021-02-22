package practicalWork7.work72;

import java.sql.Array;
import java.util.Arrays;

public class Task72 {
    public static void main(String[] args) {
        int[] mas = { 2, 5, 8, 9, 3, 15 };

        int sum;
        sum = sumOddElementsArray(mas);

        System.out.println("Массив положительных значений: " + Arrays.toString(mas));
        System.out.println("Сумма нечетных элементов: " + sum);

    }

    public static int sumOddElementsArray (int[] array) {
        int number = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            number = array[i];

            if (number < 0) {
                sum = -1;
                break;
            }

            if(number % 2 != 0){
                sum = sum + number;
            }
        }
        return sum;
    }
}
