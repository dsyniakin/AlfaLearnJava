package practicalWork7.work73;

import java.util.Scanner;

public class Task73 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер матрицы:");
        int size = scan.nextInt();

        createMatrix(size);
    }

    public static int[][] createMatrix(int size) {
        int[][] matrix = new int[size][size];

        int number = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = number + i;
                number = number + size;
            }
            number = number - (number - 1);
        }

        printMatrix(matrix);

        return matrix;
    }

    public static void printMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {
                //System.out.print("-");
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
