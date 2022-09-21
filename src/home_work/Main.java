package home_work;
// Текс завдання в README.MD

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner name = new Scanner(System.in);
        System.out.println("Ведіть число");

        int a;
        int b;

        a = name.nextInt();
        b = (int) (Math.random()*6);

        {
            if( a == b)
            {
                System.out.println("Ви виграли");
            }

            else
            {
                System.out.println("Програш");
            }
        }

    }
}

