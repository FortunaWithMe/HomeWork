package home_work_16;

import home_work_14.Person;

import java.util.Scanner;

public class HW16 {
    public static void main(String[] args) {

        System.out.println("Введіть данні для першого користувача");
        Scanner scanner = new Scanner (System.in);
        PersonInfo person1 = new PersonInfo("John", 18, "January", 1970,
                "firasmail@gmail.com", "+380663179896", "null", 0.0,
                "null", 0);
        System.out.println("Введіть Ваше прізвище");
        person1.setSurname(scanner.next());
        System.out.println("Введlіть Вашу вагу у форматі '0,0'");
        person1.setWeight(scanner.nextDouble());
        System.out.println("Введіть Ваш тиск у форматі '0/0'");
        person1.setPressure(scanner.next());
        System.out.println("Введіть кількість пройдених кроків");
        person1.setNumberOfSteps(scanner.nextInt());

        person1.getAgeOfUser();
        System.out.println(" ");
        person1.printAccountInfo();
        System.out.println(" ");



        System.out.println("Введіть данні для другого користувача");
        PersonInfo person2 = new PersonInfo("James", 23, "May", 2006,
                "secondmail@gmail.com", "+380663179896", "null", 0.0,
                "null", 0);
        System.out.println("Введіть Ваше прізвище");
        person2.setSurname(scanner.next());
        System.out.println("Введlіть Вашу вагу у форматі '0,0'");
        person2.setWeight(scanner.nextDouble());
        System.out.println("Введіть Ваш тиск у форматі '0/0'");
        person2.setPressure(scanner.next());
        System.out.println("Введіть кількість пройдених кроків");
        person2.setNumberOfSteps(scanner.nextInt());

        person2.getAgeOfUser();
        System.out.println(" ");
        person2.printAccountInfo();
        System.out.println(" ");



        System.out.println("Введіть данні для третього користувача");
        PersonInfo person3 = new PersonInfo("Mark", 12, "Oktober", 1999,
                "thirdmail@gmail.com", "+380663179896", "null", 0.0,
                "null", 0);
        System.out.println("Введіть Ваше прізвище");
        person3.setSurname(scanner.next());
        System.out.println("Введlіть Вашу вагу у форматі '0,0'");
        person3.setWeight(scanner.nextDouble());
        System.out.println("Введіть Ваш тиск у форматі '0/0'");
        person3.setPressure(scanner.next());
        System.out.println("Введіть кількість пройдених кроків");
        person3.setNumberOfSteps(scanner.nextInt());

        person3.getAgeOfUser();
        System.out.println(" ");
        person3.printAccountInfo();



    }


}
