package practicalWork2.work23;

public class Task23 {
    public static void main(String[] args) {
        int a = 12;
        int b = 12;
        System.out.println("a -> " + a);
        System.out.println("b -> " + b);
        System.out.println();

        a = a - b;
        b = b + a;
        a = b - a;
        System.out.println("a -> " + a);
        System.out.println("b -> " + b);
    }
}
