public class Main {
    public static void main(String[] args) {
        Human hum1 = new Human(35, "Максим", "Минск", "бренд-менеджера");
        Human hum2 = new Human(29, "Аня", "Москва", "мтодиста образовательных программ");
        Human hum3 = new Human(28, "Катя", "Калининград", "продакт-менеджера");
        Human hum4 = new Human(27, null, "Москва", "директора по развитию бизнеса");
        Human hum5 = new Human(21, "Владимир", "Казань", "отсутсвует, не работает");
        hum1.information();
        hum2.information();
        hum3.information();
        hum4.information();
        hum5.information();
        System.out.println();
        Flower rose = new Flower("", "Голандия", 35.39f, 0);
        Flower chrysanthemum = new Flower("", "", 15f, 5);
        Flower peony = new Flower("", "Англия", 69.9f, 1);
        Flower gypsophila = new Flower("", "Турция", 19.5f, 10);
        rose.information();
        chrysanthemum.information();
        peony.information();
        gypsophila.information();
        System.out.println();
        printCostOfFlowers(peony, peony, peony, gypsophila, gypsophila, rose);
    }

    private static void printCostOfFlowers(Flower... flowers) {
        double totalCost = 0;
        int minimumLifeSpan = Integer.MAX_VALUE;
        for (Flower flower : flowers) {
            if (flower.lifeSpan < minimumLifeSpan) {
                minimumLifeSpan = flower.lifeSpan;
            }
            totalCost += flower.getCost();
            flower.information();
        }
        totalCost = totalCost * 1.1;
        System.out.println("Стоимость букета = " + totalCost);
        System.out.println("Срок стояния букета = " + minimumLifeSpan);

    }
}