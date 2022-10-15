public class Auto {
    String brand;
    String model;
    float engineVolume;
    String color;
    Integer productionYear;
    String productionCountry;

    Auto(String brand, String model, float engineVolume, String color, Integer productionYear, String productionCountry) {
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

    void automobile() {
        System.out.println(brand + " " + model + ", " + productionYear + " год выпуска, сборка в " + productionCountry + ", " + color + " цвет кузова, объем двигателя - " + engineVolume);
    }

}
