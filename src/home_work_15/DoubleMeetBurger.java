package home_work_15;

public class DoubleMeetBurger extends Burger{
    public DoubleMeetBurger(String ingridientA, String ingridientB, String ingridientC,
                            String ingridientD, String ingridientE, String ingridientF) {
        super(ingridientA, ingridientB, ingridientC, ingridientD, ingridientE, ingridientF);

    }

    @Override
    public String toString() {
        return "DoubleMeetBurger{" +
                "ingridientA='" + ingridientA + '\'' +
                ", ingridientB='" + ingridientB + '\'' +
                ", ingridientC='" + ingridientC + '\'' +
                ", ingridientD='" + ingridientD + '\'' +
                ", ingridientE='" + ingridientE + '\'' +
                ", ingridientF='" + ingridientF + '\'' +
                '}';
    }

}
