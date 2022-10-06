package home_work_14;


public class HW14 {
    public static void main (String[] args) {
        Person first = new Person("Will", "Smith", "New York", "2936729462846");
        Person second = new Person("Jackie", "Chan", "Shanghai", "12312412412");
        Person third = new Person("Sherlock", "Holmes", "London", "37742123513");


        System.out.println(first.personInfo());
        System.out.println(second.personInfo());
        System.out.println(third.personInfo());


    }
}