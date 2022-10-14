package home_work_16;

public class PersonInfo {

    //Незмінні
    private final String name;
    private final int dateOfBirth;
    private final String monthOfBirth;
    private final int yearOfBirth;
    private final String eMail;
    private final String telephone;

    //Змінювані
    private String surname;
    private Double weight;
    private String pressure;
    private int numberOfSteps;

    private int calerndarYear = 2022;
    private int ageOfUser;

    public PersonInfo(String name, int dateOfBirth, String monthOfBirth, int yearOfBirth, String eMail, String telephone,
                      String surname, Double weight, String pressure, int numberOfSteps) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.eMail = eMail;
        this.telephone = telephone;
        this.surname = surname;
        this.weight = weight;
        this.pressure = pressure;
        this.numberOfSteps = numberOfSteps;
    }

    public String getName() {
        return name;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public String getMonthOfBirth() {
        return monthOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String geteMail() {
        return eMail;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getPressure() {
        return pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public int getNumberOfSteps() {
        return numberOfSteps;
    }

    public void setNumberOfSteps(int numberOfSteps) {
        this.numberOfSteps = numberOfSteps;
    }

    public void getAgeOfUser() {
        ageOfUser = calerndarYear-yearOfBirth;
        System.out.println(ageOfUser);
    }

    public void printAccountInfo() {
        System.out.println(name + "\n" + dateOfBirth + "\n" + monthOfBirth + "\n" + yearOfBirth + "\n" + eMail + "\n"
                + telephone + "\n" + surname + "\n" + weight + "\n" + pressure + "\n" + numberOfSteps);
    }
}
