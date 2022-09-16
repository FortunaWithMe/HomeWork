import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        System.out.println("Виберіть операцію");
        System.out.println("Додавання - a");
        System.out.println("Віднімання - b");
        System.out.println("Множення - c");
        System.out.println("Ділення - d");

        Scanner Calculator = new Scanner(System.in);
        double number1;
        double number2;
        double result;

        char action = Calculator.nextLine().charAt(0);
        System.out.println("Введіть переше ціле число");
        number1 = Calculator.nextInt();
        System.out.println("Введіть друге ціле число");
        number2 = Calculator.nextInt();

        if (action == 'a') {
            result = (number1 + number2);
            System.out.println(result);
        }
        if (action == 'b') {
            result = (number1 - number2);
            System.out.println(result);
        }
        if (action == 'c') {
            result = (number1 * number2);
            System.out.println(result);
        }
        if (action == 'd') {
            result = (number1 / number2);
            System.out.println("Відповідь = " + result);
        }
        else {
            System.out.println("Помилка, невірні данні");
        }

    }
}