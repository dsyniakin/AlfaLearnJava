package practicalWork3.work31;

public class Task31 {
    public static void main(String[] args) {
        double pounds = 536.7;
        double grams = pounds * 453.6;
        System.out.println((int)(grams / 1000) + " килограмм " + Math.round(grams % 1000) + " грамм");
    }
}
