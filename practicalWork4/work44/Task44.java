package practicalWork4.work44;

public class Task44 {
    public static void main(String[] args) {
        int number = 1;
        int a = 0;

        while (number >=1 && number <= 300) {
            int x;
            int y;

            x = number % 3;
            y = number % 4;
            if (x == 0 || y == 0) {
                System.out.print(number + " ");
                a++;
            }

            number++;

            if (a >= 10) {
                break;
            }
        }
    }
}
