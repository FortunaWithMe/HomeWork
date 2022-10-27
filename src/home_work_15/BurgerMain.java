package home_work_15;

public class BurgerMain {
    public static void main(String[] args) {

        Burger burger1 = new StandartBurger("Булочка", "Мʼясо",
                "Сир", "Зелень", "Майонез");
        Burger burger2 = new DietBurger("Булочка", "Мʼясо",
                "Сир", "Зелень");
        Burger burger3 = new DoubleMeetBurger("Булочка", "Мʼясо",
                "Мʼясо", "Сир", "Зелень", "Майонез");

        System.out.println(burger1);
        System.out.println(" ");
        System.out.println(burger2);
        System.out.println(" ");
        System.out.println(burger3);
        System.out.println(" ");

    }
}
