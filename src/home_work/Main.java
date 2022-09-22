package home_work;
// Текс завдання в README.MD

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        System.out.println("Ведіть число");

        int a;
        int b;

        a = number.nextInt();
        b = (int) (Math.random() * 2);

        while (a != b) {

            {
                if (a == b) {
                    System.out.println("Ви виграли");
                    break;
                } else if (a != b) {
                    System.out.println("Спробуй ще");
                }

            }

            a = number.nextInt();
            {
                if (a == b) {
                    System.out.println("Ви виграли");
                    break;
                } else if (a != b) {
                    System.out.println("Може на цей раз вийде?");
                }
            }

            a = number.nextInt();
            {
                if (a == b) {
                    System.out.println("Ви виграли");
                    break;
                } else if (a != b) {
                    System.out.println("Ні, нажаль програш");
                    break;
                }

            }
        }
    }
}

