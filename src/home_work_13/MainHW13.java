package home_work_13;

import java.util.Scanner;

public class MainHW13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Вкажіть розмір по осі M");
        int n = scanner.nextInt();

        System.out.println("Вкажіть розмір по осі N");
        int m = scanner.nextInt();

        int[][] matrixN = new int[n][];
        int[][] matrixM = new int[m][];
        int counter = 1;


        System.out.println("Задана матриця");

        for (int a = 0; a < matrixM.length; a++) {
            matrixM[a] = new int[n];
        }

        for (int a = 0; a < matrixN.length; a++) {
            matrixN[a] = new int[m];
            for (int b = 0; b < matrixN[a].length; b++) {
                matrixN[a][b] = counter++;
                System.out.print(matrixN[a][b] + " ");
            }
            System.out.println();
        }

        System.out.println("Транспонована матриця");

        for (int a = 0; a < matrixN.length; a++) {
            for (int b = 0; b < matrixN[a].length; b++) {
                matrixM[b][a] = matrixN[a][b];
            }
        }

        for (int a = 0; a < matrixM.length; a++) {
            for (int b = 0; b < matrixM[a].length; b++) {
                System.out.print(matrixM[a][b] + " ");
            }
            System.out.println();
        }

    }
}