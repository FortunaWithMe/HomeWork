package home_work_14;

public class Person {

    public String name;
    public String surname;
    public String city;
    public String phone;

    public Person (String name, String surname, String city, String phone) {
        this.name = name;
        this.surname = surname;
        this.city = city;
        this.phone = phone;

    }

    public String personInfo() {
        return ("Зателефонувати громадянинові " + this.name + " " + this.surname +
                " з міста " + this.city + " можна за номером " + this.phone);
    }

}
