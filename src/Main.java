public class Main {
    public static void main(String[] args) {
        int initialAmount = 500;
        int refillAmount = 1500;
        int resultingAmount;
        int bonus;

        if (refillAmount < 1000) {
            bonus = 0;
        } else {
            bonus = refillAmount / 100;
        }

        resultingAmount = initialAmount + refillAmount + bonus;

        System.out.println("Итоговая сумма: " + resultingAmount);
        System.out.println("Бонус: " + bonus);
    }
}