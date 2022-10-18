public class Flower {
    private String flowerColor;
    private String country;
    private float cost;
    Integer lifeSpan;

    public String getFlowerColor() {
        return flowerColor;
    }

    public String getCountry() {
        return country;
    }

    public float getCost() {
        return cost;
    }

    public void setFlowerColor(String flowerColor) {
        this.flowerColor = flowerColor;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }


    Flower(String flowerColor, String country, float cost, Integer lifeSpan){
        if(flowerColor==null || flowerColor.isBlank() || flowerColor.isEmpty()){
            this.flowerColor="белый";
        }
        else{
            this.flowerColor=flowerColor;
        }
        if(country==null || country.isBlank() || country.isEmpty()){
            this.country="Россия";
        }
        else{
            this.country=country;
        }
        if (cost<=0){
            this.cost=1;
        }
        else {
            this.cost=cost;
        }
        if (lifeSpan<=0){
            this.lifeSpan=3;
        }
        else{
            this.lifeSpan=lifeSpan;
        }

    }
    void information(){
        System.out.println("flowerColor = " + flowerColor+" "+"getCountry() = " + getCountry()+" "+"getCost() = " + getCost()+" "+"lifeSpan = " + lifeSpan);
    }
}
