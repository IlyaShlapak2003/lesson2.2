public class Human {
    Integer yearOfBirth;
    String name;
    String town;
    String jobTitle;

    Human(Integer yearOfBirth, String name, String town, String jobTitle) {
        if (yearOfBirth < 0) {
            this.yearOfBirth = Math.abs(yearOfBirth);
        } else if (yearOfBirth == null) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth;
        }
        if (name == null) {
            this.name = "'инормация не указана'";
        } else {
            this.name = name;
        }
        if (town == null) {
            this.town = "'инормация не указана'";
        } else {
            this.town = town;
        }
        if (jobTitle == null) {
            this.jobTitle = "'инормация не указана'";
        } else {
            this.jobTitle = jobTitle;
        }
    }

    void information() {
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + (2022 - yearOfBirth) + " году. Я работаю на должности " + jobTitle + ". Будем знакомы!");
    }
}
