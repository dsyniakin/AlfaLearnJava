package practicalWork3.work32;

public class Task32 {
    public static void main(String[] args) {
        double depSum = 125367.50;
        double monthes = 12;
        double percent = 12;

        double sumPer = Math.round((depSum * (percent / 100) / 12) * monthes);
        System.out.println("Сумма процентов " + sumPer);
    }
}
