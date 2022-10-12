package home_work_15;

public class StandartBurger extends Burger{

    public StandartBurger(String ingridientA, String ingridientB, String ingridientC,
                          String ingridientD, String ingridientE) {
        super(ingridientA, ingridientB, ingridientC, ingridientD, ingridientE);

    }


    @Override
    public String toString() {
        return "StandartBurger{" +
                "ingridientA='" + ingridientA + '\'' +
                ", ingridientB='" + ingridientB + '\'' +
                ", ingridientC='" + ingridientC + '\'' +
                ", ingridientD='" + ingridientD + '\'' +
                ", ingridientE='" + ingridientE + '\'' +
                '}';
    }
}
