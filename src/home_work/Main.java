package home_work;
public class Main {


    public static void main(String[] args) {
        boolean isRunnig = true;
        int counter =1;
        int i = 0;

        while (isRunnig) {

            String shuttleNr = Integer.toString(i);
            i++;
            if (shuttleNr.contains("4") || shuttleNr.contains("9")) {
                continue;
            }
            counter ++;
            System.out.println(shuttleNr);
            if (counter == 100) {
                isRunnig = false;

            }
        }

    }
}
