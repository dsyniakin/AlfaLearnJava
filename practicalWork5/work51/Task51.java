package practicalWork5.work51;

public class Task51 {
    public static void main(String[] args) {
        String str = "The decimal system, invented in India around AD 600, was a revolution in quantitative reasoning: using only 10 symbols, even very large numbers could be written down compactly";
        //System.out.println(str.length());

        int half = str.length() / 2;
        //System.out.println(half);

        String strHalf = str.substring(half);
        System.out.println(strHalf);
    }
}
