package home_work_17;

public class Androids implements Smartphones, LinuxOS{

    @Override
    public void call() {
        System.out.println("Calling form Android");
    }

    @Override
    public void sms() {
        System.out.println("Sending SMS from Android");
    }

    @Override
    public void internet() {
        System.out.println("Internet hotpoint using Android");
    }

    @Override
    public void Linux() {
        System.out.println("Device working on LinuxOS");
    }
}
