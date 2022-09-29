package home_work;
// Текст завдання в README.md
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int [] teamA = new int[25];
        int [] teamB = new int[25];
        int totalA = 0;
        int totalB = 0;

        Random random = new Random();

        for (int i = 0; i < teamA.length; i++) {
            teamA[i] = random.nextInt(40 - 18 + 1) + 18;
            totalA += teamA[i];
            System.out.print(teamA[i] +" ");
        }

        System.out.println(" ");
        for (int i = 0; i < teamB.length; i++) {
            teamB[i] = random.nextInt(40 - 18 + 1) + 18;
            totalB += teamB[i];
            System.out.print(teamB[i] +" ");
        }
        System.out.println(" ");

        int middleA = totalA/25;
        int middleB = totalB/25;

        System.out.println("Середній вік гравців команди А - " +middleA);
        System.out.println("Середній вік гравців команди B - " +middleB);

    }
}