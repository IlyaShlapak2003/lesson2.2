package transport;

public class Auto {
    private String brand;
    private String model;
    private float engineVolume;
    private String color;
    private Integer productionYear;
    private String productionCountry;
    private String transmission;
    private String bodyType;
    private String registrationNumber;
    private Integer numberOfSeats;
    private String rubber;


    public Auto(String brand, String model, float engineVolume, String color, Integer productionYear, String productionCountry, String transmission, String bodyType, String registrationNumber, Integer numberOfSeats, String rubber) {
        if (transmission == null) {
            this.transmission = "default";
        } else {
            this.transmission = transmission;
        }
        if (bodyType == null) {
            this.bodyType = "default";
        } else {
            this.bodyType = bodyType;
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
        if (rubber == null) {
            this.rubber = "default";
        } else {
            this.rubber = rubber;
        }
        if (brand == null) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null) {
            this.model = "defult";
        } else {
            this.model = model;
        }
        if (engineVolume == 0) {
            this.engineVolume = 1.5f;
        } else {
            this.engineVolume = engineVolume;
        }
        if (color == null) {
            this.color = "белый";
        } else {
            this.color = color;
        }
        if (productionYear == null) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }
        if (productionCountry == null) {
            this.productionCountry = "default";
        } else {
            this.productionCountry = productionCountry;
        }

    }

    public void setRubber(String rubber) {
        this.rubber = rubber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber == null) {
            this.registrationNumber = "х000хх000";
        } else {
            this.registrationNumber = registrationNumber;
        }
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setColor(String color) {
        if (color == null) {
            this.color = "белый";
        } else {
            this.color = color;
        }
    }

    public void setEngineVolume(float engineVolume) {
        if (engineVolume == 0) {
            this.engineVolume = 1.5f;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getRubber() {
        return rubber;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Integer getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getBodyType() {
        return bodyType;
    }

    public Integer getNumberOfSeats() {
        return numberOfSeats;
    }

    public void automobile() {
        System.out.println(getBrand() + " " + getModel() + ", " + getProductionYear() + " год выпуска, сборка в " + getProductionCountry() + ", " + getColor() + " цвет кузова, объем двигателя - " + getEngineVolume() + ", коробка передач " + getTransmission() + ", тип кузова " + getBodyType() + ", регистрационный номер " + getRegistrationNumber() + ", количество мест " + getNumberOfSeats());
    }

    public void changeRubber() {
        if (getRubber() == "летняя") {
            this.rubber = "зимняя";
        } else {
            this.rubber = "летняя";
        }
    }
    public boolean correctRegistrationNumber(){
        if(registrationNumber.length()!=9){
            return false;
        }
        char[] chars=registrationNumber.toCharArray();
        if(!Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[4]) || !Character.isAlphabetic(chars[5])){
            return false;
        }
        if(!Character.isDigit(chars[1]) || !Character.isDigit(chars[2]) || !Character.isDigit(chars[3]) || !Character.isDigit(chars[6]) || !Character.isDigit(chars[7]) || !Character.isDigit(chars[8])){
            return false;
        }
        else {
            return true;
        }
    }
}
