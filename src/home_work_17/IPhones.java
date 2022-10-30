package home_work_17;

public class IPhones implements Smartphones, iOS{

    @Override
    public void call() {
        System.out.println("Calling form Iphone");
    }

    @Override
    public void sms() {
        System.out.println("Sending SMS form Iphone");
    }

    @Override
    public void internet() {
        System.out.println("Internet hotpoint using Iphone");
    }

    @Override
    public void IOS() {
        System.out.println("Device working on iOS");
    }
}
