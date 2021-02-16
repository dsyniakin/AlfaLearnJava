package practicalWork6.work61;

import java.util.Scanner;

public class Task61 {
    public static void main(String[] args) {
        System.out.println("Введите сторону А треугольника:");
        Scanner scn1 = new Scanner(System.in);
        double sideA = scn1.nextDouble();

        System.out.println("Введите сторону B треугольника:");
        Scanner scn2 = new Scanner(System.in);
        double sideB = scn2.nextDouble();

        System.out.println("Введите сторону C треугольника:");
        Scanner scn3 = new Scanner(System.in);
        double sideC = scn3.nextDouble();

        double areTrian = areaTriangle(sideA, sideB, sideC);
        System.out.println("Площадь треугольника: " + areTrian);
    }

    public static double areaTriangle (double a, double b, double c) {
        double p = (a + b + c) / 2;
        double areaTrian = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        return areaTrian;
    }
}
