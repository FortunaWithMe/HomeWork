package home_work;
// Текс завдання в README.MD

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        System.out.println("Ведіть число");

        int a;
        int b;


        b = (int) (Math.random() *10);

        for (int i = 0; i < 3; i++)

            {
                a = number.nextInt();
                if (a == b) {
                    System.out.println("Ви виграли");
                    break;
                } else if (a != b) {
                    System.out.println("Прошраш");
                }
            }
        }
    }

