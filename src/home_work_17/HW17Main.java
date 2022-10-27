package home_work_17;

public class HW17Main {
    public static void main(String[] args) {
        Androids android = new Androids();
        android.call();
        android.sms();
        android.internet();
        android.Linux();

        System.out.println();

        IPhones iPhone = new IPhones();

        iPhone.call();
        iPhone.sms();
        iPhone.internet();
        iPhone.IOS();


    }
}
