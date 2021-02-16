package practicalWork6.work63;

import java.util.Scanner;

public class Task63 {
    public static void main(String[] args) {
        System.out.println("Введите текст:");
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();

        System.out.println("Введите номер слова:");
        Scanner scan2 = new Scanner(System.in);
        int word = scan2.nextInt();

        char result = getFirstCharacterOfWord(text, word);
        System.out.println("Первая буква слова: " + result);

    }

    public static char getFirstCharacterOfWord (String str, int numberWord) {
        char firstWord;
        int quantityWords = 1;
        int a = 0;

        if (numberWord <= 0) {
            firstWord = '-';
        } else if (numberWord == 1) {
            firstWord = str.charAt(0);
        }  else {
            while (a < str.length()) {
                if (quantityWords == numberWord) {
                    break;
                }
                a = str.indexOf(" ", a + 1);

                if (a == -1) {
                    break;
                }
                quantityWords++;
            }

            if (a == -1) {
                firstWord = '-';
            } else {
                firstWord = str.charAt(a + 1);
            }
        }

        return firstWord;
    }
}
