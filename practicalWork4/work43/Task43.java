package practicalWork4.work43;

public class Task43 {
    public static void main(String[] args) {
        int var = 1;

        while (var < 9) {
            System.out.print(var + " ");
            int var2 = var;
            while (var2 > 1 && var < 9) {
                var2 = var2 - 1;
                System.out.print(var2 + " ");
            }
            var++;
            System.out.println();
        }
    }
}
