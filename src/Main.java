public class Main {
    public static void main(String[] args) {
        Human hum1 = new Human(35, "Максим", "Минск","бренд-менеджера");
        Human hum2 = new Human(29, "Аня", "Москва","методиста образовательных программ");
        Human hum3 = new Human(28, "Катя", "Калининград","продакт-менеджера");
        Human hum4 = new Human(27, "Артем", "Москва","директора по развитию бизнеса");
        hum1.information();
        hum2.information();
        hum3.information();
        hum4.information();
        Auto car1 = new Auto("Lada","Granta",1.7f, "жёлтый", 2015, "России");
        Auto car2 = new Auto("Audi","A8 50 L TDI quattro",3.0f,"черный",2020,"Германии");
        Auto car3 = new Auto("BMW", "Z8",3.0f,"черный",2021,"Германии");
        Auto car4 = new Auto("Kia","Sportage 4-го поколения", 2.4f,"красный",2018,"Южной Корее");
        Auto car5 = new Auto("Hyundai","Avante",1.6f,"оранжевый",2016,"Южной Корее");
        car1.automobile();
        car2.automobile();
        car3.automobile();
        car4.automobile();
        car5.automobile();
    }
}