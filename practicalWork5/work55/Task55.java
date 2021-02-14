package practicalWork5.work55;

import java.util.Scanner;

public class Task55 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите текст");
        String text = scan.nextLine();

        int indexLet = 0;

        while (indexLet < text.length()) {
            char letter = text.charAt(indexLet);

            int find1 = text.indexOf(letter);
            int find2 = text.lastIndexOf(letter);

            if (find1 == find2) {
                System.out.print(letter + " ");
            }

            indexLet++;
        }
    }
}
