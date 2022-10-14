public class Human {
    int yearOfBiirth;
    String name;
    String town;
    Human(int yearOfBiirth, String name, String town){
        this.yearOfBiirth=yearOfBiirth;
        this.name=name;
        this.town=town;
    }
    void information(){
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + (2022 - yearOfBiirth) + " году. Будем знакомы!");
    }
}
