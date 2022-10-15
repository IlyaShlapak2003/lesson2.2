public class Main {
    public static void main(String[] args) {
        Human hum1 = new Human(35, "Максим", "Минск","бренд-менеджера");
        Human hum2 = new Human(29, "Аня", "Москва","мтодиста образовательных программ");
        Human hum3 = new Human(28, "Катя", "Калининград","продакт-менеджера");
        Human hum4 = new Human(27, null, "Москва","директора по развитию бизнеса");
        hum1.information();
        hum2.information();
        hum3.information();
        hum4.information();
    }
}