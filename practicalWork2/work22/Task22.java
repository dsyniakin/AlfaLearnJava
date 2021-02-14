package practicalWork2.work22;

public class Task22 {
    public static void main(String[] args) {
        long msec = System.currentTimeMillis();
        //System.out.println(msec);

        long sec = (msec / 1000) % 60;
        //System.out.println(sec);

        long min = (msec / 1000) / 60 % 60;
        //System.out.println(min);

        long hour = (msec / 1000) / 60 / 60 % 24;
        //System.out.println(hour);

        long day = (msec / 1000) / 60 / 60 / 24;
        //System.out.println(day);

        System.out.println(day + ":" + hour + ":" + min + ":" + sec);
    }
}
