package home_work_19;

import java.util.Scanner;
import static home_work_19.Drinks.*;

public class DrinkChoise {

    public void choiceDrink() {
        Scanner scanner = new Scanner(System.in);
        int item = 0;
        int summ = 0;
        boolean isRunning = true;
        while (isRunning) {

            System.out.println("Оберіть напій: " + "\n" + "COFFEE" + "\n" + "TEA" + "\n" + "LEMONADE" + "\n" + "MOJITO" +
                    "\n" + "MINERALWATER" + "\n" + "COCACOLA");
            System.out.println("Після закінчення вибору вибору введіть END");
            String usersChoose = scanner.nextLine();
            DrinksMachine drinksMachine = DrinksMachine.valueOf(usersChoose.toUpperCase());

            switch (drinksMachine) {

                case COFFEE -> {
                    System.out.println("Вартість кави " + COFFEEValue + " Грн");
                    summ += COFFEEValue;
                    item++;
                }

                case TEA -> {
                    System.out.println("Вартість чаю " + TEAValue + " Грн");
                    summ += TEAValue;
                    item++;
                }

                case LEMONADE -> {
                    System.out.println("Вартість лимонаду " + LEMONADEValue + " Грн");
                    summ += LEMONADEValue;
                    item++;
                }

                case MOJITO -> {
                    System.out.println("Вартість мохіто " + MOJITOValue + " Грн");
                    summ += MOJITOValue;
                    item++;
                }

                case MINERALWATER -> {
                    System.out.println("Вартість мінеральної води " + MINERALWATERValue + " Грн");
                    summ += MINERALWATERValue;
                    item++;
                }

                case COCACOLA -> {
                    System.out.println("Вартість CocaCola " + COCACOLAValue + " Грн");
                    summ += COCACOLAValue;
                    item++;
                }


                case END -> {
                    System.out.println("Замовленно " + item + " напої");
                    System.out.println("Загальна вартість " + summ + " Грн");
                    isRunning = false;
                }
            }
        }
    }
}
