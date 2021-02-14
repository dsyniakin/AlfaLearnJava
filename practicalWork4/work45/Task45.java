package practicalWork4.work45;

public class Task45 {
    public static void main(String[] args) {
        System.out.print("* |" + " ");
        int a = 1;
        while (a <= 9) {
            System.out.print(a + " ");
            a++;
        }
        System.out.println();

        int b = 0;
        while (b <= 20) {
            System.out.print("-");
            b++;
        }
        System.out.println();

        int c = 1;
        while (c <= 9) {
            System.out.print(c + " | ");
            int d = 1;
            int e = c;
            while (d <=9) {
                System.out.print(d * e + " ");
                d++;
            }
            c++;
            System.out.println();
        }
    }
}
