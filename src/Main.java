import transport.Auto;

import java.security.Key;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Auto car1 = new Auto("Lada",
                "Granta",
                1.7f,
                "жёлтый",
                2015,
                "России",
                "автоматическая",
                "седан",
                "н987хо41",
                5,
                "летняя");
        car1.setKey(new Auto.key(true,false));
        car1.setInsurance(new Auto.insurance(LocalDate.now(),1254,"125463875"));
        Auto.information(car1);

        Auto car2 = new Auto("Audi",
                "A8 50 L TDI quattro",
                3.0f,
                "черный", 2020,
                "Германии",
                "автоматическая",
                "универсал",
                "н887хо46",
                5,
                "летняя");
        car2.setKey(new Auto.key(false,false));
        car2.setInsurance(new Auto.insurance(LocalDate.now(),1254,"125463875"));
        Auto.information(car2);

        Auto car3 = new Auto("BMW",
                "Z8",
                3.0f,
                "черный",
                2021,
                "Германии",
                "автоматическая",
                "минивен",
                "н937хо61",
                7,
                "зимняя");
        car3.setKey(new Auto.key(true,true));
        car3.setInsurance(new Auto.insurance(LocalDate.now(),1254,"125463875"));
        Auto.information(car3);

        Auto car4 = new Auto("Kia",
                null,
                2.4f,
                "красный",
                2018,
                "Южной Корее",
                "механическая",
                "универсал",
                "н063хо40",
                4,
                "летняя");
        car4.setKey(new Auto.key(false,true));
        car4.setInsurance(new Auto.insurance(LocalDate.now(),1254,"125463875"));
        Auto.information(car4);

        Auto car5 = new Auto("Hyundai",
                "Avante",
                0,
                "оранжевый",
                2016,
                "Южной Корее",
                "автоматическая",
                "внедорожник",
                "н987хо41",
                7,
                "зимняя");
        car5.setKey(new Auto.key(true,false));
        car5.setInsurance(new Auto.insurance(LocalDate.now(),1254,"125463875"));
        Auto.information(car5);

    }
}