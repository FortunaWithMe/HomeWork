package home_work_15;

public class DietBurger extends Burger{

    public DietBurger(String ingridientA, String ingridientB, String ingridientC,
                      String ingridientD) {
        super(ingridientA, ingridientB, ingridientC, ingridientD);
    }

    @Override
    public String toString() {
        return "DietBurger{" +
                "ingridientA='" + ingridientA + '\'' +
                ", ingridientB='" + ingridientB + '\'' +
                ", ingridientC='" + ingridientC + '\'' +
                ", ingridientD='" + ingridientD + '\'' +
                '}';
    }
}
