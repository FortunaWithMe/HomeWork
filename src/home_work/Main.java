package home_work;
// Текс завдання в README.MD
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner name = new Scanner(System.in);
        Scanner frags = new Scanner(System.in);
        String a; //перша команда
        int a1;
        int a2;
        int a3;
        int a4;
        int a5;
        float middle_a;

        String b; //друга команда
        int b1;
        int b2;
        int b3;
        int b4;
        int b5;
        float middle_b;

        System.out.println("Введіть назву першої команди");
        a = name.next();

        System.out.println("Введіть кількість фрагів для першого гравця команди " +a);
        a1 = frags.nextInt();
        System.out.println("Введіть кількість фрагів для другого гравця команди " +a);
        a2 = frags.nextInt();
        System.out.println("Введіть кількість фрагів для третього гравця команди " +a);
        a3 = frags.nextInt();
        System.out.println("Введіть кількість фрагів для четвертого гравця команди " +a);
        a4 = frags.nextInt();
        System.out.println("Введіть кількість фрагів для пʼятого гравця команди " +a);
        a5 = frags.nextInt();

        System.out.println("Введіть назву другої команди");
        b = name.next();

        System.out.println("Введіть кількість фрагів для першого гравця команди " +b);
        b1 = frags.nextInt();
        System.out.println("Введіть кількість фрагів для другого гравця команди " +b);
        b2 = frags.nextInt();
        System.out.println("Введіть кількість фрагів для третього гравця команди " +b);
        b3 = frags.nextInt();
        System.out.println("Введіть кількість фрагів для четвертого гравця команди " +b);
        b4 = frags.nextInt();
        System.out.println("Введіть кількість фрагів для пʼятого гравця команди " +b);
        b5 = frags.nextInt();

        middle_a = (a1+a2+a3+a4+a5)/5f;
        middle_b = (b1+b2+b3+b4+b5)/5f;

        {
            if(middle_a > middle_b)
            {
                System.out.println("Виграла комманда - "+a);
            }
            else if (middle_a < middle_b)
            {
                System.out.println("Виграла комманда - "+b);
            }
            else if (middle_a == middle_b)
            {
                System.out.println("Перемогла дружба");
            }
        }

    }
}