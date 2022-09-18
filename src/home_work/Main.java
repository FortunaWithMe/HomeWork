package home_work;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // порахувати обʼєм та сумарну довжину стрін паралелепіпеда

        Scanner calculator = new Scanner(System.in);
        int a;
        int b;
        int c;

        System.out.println("Введіть сторону - a");
        a = calculator.nextInt();
        System.out.println("Введіть сторону - b");
        b = calculator.nextInt();
        System.out.println("Введіть сторону - с");
        c = calculator.nextInt();

        int volume = a*b*c;
        int length = (a+b+c)*4;

        System.out.println("Об'єм паралелепіпеда = " + volume);
        System.out.println("Сумарна довжина всіх сторін = " + length);

    }
}