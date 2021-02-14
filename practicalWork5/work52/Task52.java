package practicalWork5.work52;

public class Task52 {
    public static void main(String[] args) {
        String strName = "National Aviation University";

        char letter1 = strName.charAt(0);
        char letter2 = strName.charAt(strName.indexOf(" ") + 1);
        char letter3 = strName.charAt(strName.lastIndexOf(" ") + 1);

        System.out.println(letter1 + "" + letter2 + "" + letter3);
        //System.out.println(letter1);
    }
}
