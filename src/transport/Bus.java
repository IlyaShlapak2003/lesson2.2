package transport;

public class Bus extends Transport{
    private static String appointment;
    private static Integer numberOfSeats;
    private static String registrationNumber;


    public Bus(String brand, String model, String color, Integer productionYear, String productionCountry, Integer maxSpeed) {
        super(brand, model, color, productionYear, productionCountry, maxSpeed);
    }

    public Bus(String brand, String model, String color, Integer productionYear, String productionCountry, Integer maxSpeed,String appointment,Integer numberOfSeats,String registrationNumber) {
        super(brand, model, color, productionYear, productionCountry, maxSpeed);
        if(appointment==null || appointment.isEmpty() || appointment.isBlank()){
            this.appointment="Неизвестно";
        }
        else {
            this.appointment=appointment;
        }
        if (registrationNumber == null) {
            this.registrationNumber = "х000хх000";
        } else {
            this.registrationNumber = registrationNumber;
        }
        if (numberOfSeats <= 2) {
            this.numberOfSeats = 5;
        } else {
            this.numberOfSeats = numberOfSeats;
        }

    }

    public static String getAppointment() {
        return appointment;
    }
    public static Integer getNumberOfSeats() {
        return numberOfSeats;
    }
    public static String getRegistrationNumber() {
        return registrationNumber;
    }
    public static void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber == null) {
            Bus.registrationNumber = "х000хх000";
        } else {
            Bus.registrationNumber = registrationNumber;
        }
    }
    public boolean correctRegistrationNumber() {
        if (registrationNumber.length() != 9) {
            return false;
        }
        char[] chars = registrationNumber.toCharArray();
        if (!Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[4]) || !Character.isAlphabetic(chars[5])) {
            return false;
        }
        if (!Character.isDigit(chars[1]) || !Character.isDigit(chars[2]) || !Character.isDigit(chars[3]) || !Character.isDigit(chars[6]) || !Character.isDigit(chars[7]) || !Character.isDigit(chars[8])) {
            return false;
        } else {
            return true;
        }
    }

    public static void information() {
        System.out.println(getBrand() + " "
                + getModel() + ", "
                + getProductionYear() +
                " год выпуска, сборка в " + getProductionCountry() +
                ", " + getColor() + " цвет кузова"+
                ", регистрационный номер " + getRegistrationNumber() +
                ", количество мест " + getNumberOfSeats()+", назначение "+getAppointment());
    }
}
