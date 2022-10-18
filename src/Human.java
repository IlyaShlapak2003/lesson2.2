public class Human {
    private Integer yearOfBirth;
    private String name;
    private String town;
    private String jobTitle;

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

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        if (town == null || name.isEmpty() || name.isBlank()) {
            this.town = "'инормация не указана'";
        } else {
            this.town = town;
        }
    }

    public Integer getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(Integer yearOfBirth) {
        if (yearOfBirth < 0) {
            this.yearOfBirth = Math.abs(yearOfBirth);
        } else if (yearOfBirth == null) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth;
        }
    }

    void information() {
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + getTown() + ". Я родился в " + (2022 - getYearOfBirth()) + " году. Я работаю на должности " + jobTitle + ". Будем знакомы!");
    }
}
