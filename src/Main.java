import transport.Auto;

public class Main {
    public static void main(String[] args) {
        Auto car1 = new Auto("Lada","Granta",1.7f, "жёлтый", 2015, "России", "автоматическая", "седан", "н987хо41",5,"летняя");
        Auto car2 = new Auto("Audi","A8 50 L TDI quattro",3.0f,"черный",2020,"Германии", "автоматическая", "универсал", "н887хо46",5,"летняя");
        Auto car3 = new Auto("BMW", "Z8",3.0f,"черный",2021,"Германии", "автоматическая", "минивен", "н937хо61",7,"зимняя");
        Auto car4 = new Auto("Kia",null, 2.4f,"красный",2018,"Южной Корее", "механическая", "универсал", "н063хо40",4,"летняя");
        Auto car5 = new Auto("Hyundai","Avante",0,"оранжевый",2016,"Южной Корее", "автоматическая", "внедорожник", "н987хо41",7,"зимняя");
        car1.automobile();
        car2.automobile();
        car3.automobile();
        car4.automobile();
        car5.automobile();
    }
}