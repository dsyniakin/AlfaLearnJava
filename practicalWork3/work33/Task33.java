package practicalWork3.work33;

public class Task33 {
    public static void main(String[] args) {
        double costCupboard = 830;

        double costCupboardNew = costCupboard - (costCupboard * 0.13);

        costCupboardNew = Math.round(costCupboardNew + (costCupboardNew * 0.07));
        System.out.println("Стоимость шкафа " + costCupboardNew);
    }
}

