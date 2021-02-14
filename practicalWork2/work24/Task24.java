package practicalWork2.work24;

public class Task24 {
    public static void main(String[] args) {
        int number1 = 428;
        System.out.println("Number 1 -> " + number1);

        int number2 = (number1 % 10 * 100) + ((number1 % 100) - (number1 % 10)) + (number1 / 100);
        System.out.println("Number 2 -> " + number2);

        //Test
        //System.out.println(number1 / 100);

        int difference = number1 - number2;
        System.out.println(number1 + " - " + number2 + " = " + difference);
    }
}
