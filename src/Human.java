public class Human {
    int yearOfBirth;
    String name;
    String town;
    String jobTitle;
    Human(int yearOfBirth, String name, String town, String jobTitle){
        this.yearOfBirth=yearOfBirth;
        this.name=name;
        this.town=town;
        this.jobTitle=jobTitle;
    }
    void information(){
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + (2022 - yearOfBirth) + " году. Я работаю на должности "+jobTitle +". Будем знакомы!");
    }
}
