public class Auto {
    String brand;
    String model;
    float engineVolume;
    String color;
    int productionYear;
    String productionCountry;
    Auto(String brand, String model, float engineVolume,String color, int productionYear, String productionCountry){
        this.brand=brand;
        this.model=model;
        this.engineVolume=engineVolume;
        this.color=color;
        this.productionYear=productionYear;
        this.productionCountry=productionCountry;
    }
    void automobile(){
        System.out.println(brand + " " + model + ", " + productionYear + " год выпуска, сборка в " + productionCountry + ", " + color + " цвет кузова, объем двигателя - " + engineVolume);
    }

}
