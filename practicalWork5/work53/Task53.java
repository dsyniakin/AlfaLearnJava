package practicalWork5.work53;

public class Task53 {
    public static void main(String[] args) {
        String str = "An information system is designed to collect, process, store and distribute information";
        System.out.println(str);

        String wordFirst = str.substring(0, str.indexOf(" "));
        //System.out.println(wordFirst);

        int varLenght = str.length();

        String wordLast = str.substring(str.lastIndexOf(" ") + 1, varLenght);
        //System.out.println(wordLast);

        String partSent = str.substring(str.indexOf(" ") + 1, str.lastIndexOf(" ") - 1);
        //System.out.println(partSent);

        String newSent = wordLast + " " + partSent + " " + wordFirst;
        System.out.println(newSent);
    }
}
