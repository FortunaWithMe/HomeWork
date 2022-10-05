package home_work_12
        ;
// Текст завдання в README.md
import java.util.Arrays;
import java.util.Random;

public class MainHW12 {
    public static void main(String[] args) {

        int [] loteryData = new int[7];
        int [] playerData = new int[7];
        int match = 0;


        Random random = new Random();

        for (int i = 0; i < loteryData.length; i++) {
            loteryData[i] = random.nextInt(9);
        }
        System.out.println(" ");

        for (int i = 0; i < playerData.length; i++) {
            playerData[i] = random.nextInt(9);
        }

        Arrays.sort(loteryData);
        System.out.println("Випало в лотереї " + Arrays.toString(loteryData));

        Arrays.sort(playerData);
        System.out.println("Гравець загадав  " + Arrays.toString(playerData));

        for (int i = 0; i < loteryData.length; i++) {
            if (loteryData[i] == playerData[i]) {
                match++;
            }
        }
        System.out.println("Кількість збігів " + match);





    }
}
