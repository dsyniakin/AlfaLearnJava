package practicalWork5.work54;

public class Task54 {
    public static void main(String[] args) {
        String myStr1 = "Cartoon";
        String myStr2 = "Tomcat";

        int indexLet = 0;

        while (indexLet < myStr1.length()) {
            char letter = myStr1.charAt(indexLet);
            int find = myStr2.indexOf(letter);

            if (find == -1) {
                System.out.print(letter + " ");
            }

            indexLet++;
        }
    }
}
