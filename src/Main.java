public class Main {
    public static void main(String[] args) {
        int currentBalance = 100;
        int replenishment = 1001;
        int bonus = 0;
        if (replenishment > 1000) {
            bonus = replenishment / 10;
        }
        int finalBalance = currentBalance + replenishment + bonus;
        System.out.println("Бонус:" + bonus);
        System.out.println("Баланс:" + finalBalance);
    }
}
