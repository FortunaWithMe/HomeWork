package home_work;
// Текс завдання в README.MD

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int war_li;
        int arc_li;
        int hors_li;
        double amount_li; //Кількіссть КОЖНОГО типу
        double power_li;

        int war_min;
        int arc_min;
        int hors_min;
        double amount_min; //Кількіссть КОЖНОГО типу
        double power_min;

        war_li = 13;
        arc_li = 24;
        hors_li = 46;
        amount_li = 860;
        power_li = (war_li+arc_li+hors_li)*amount_li;

        war_min = 9;
        arc_min = 35;
        hors_min = 12;
        amount_min = 860*1.5;
        power_min = (war_min+arc_min+hors_min)*amount_min;

        System.out.println("Загальний показник атаки династії Лі - " +power_li);
        System.out.println("Загальний показник атаки династії Мінь - " +power_min);

    }
}