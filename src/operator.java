public class operator {

    public static void main(String[] args) {
        int amount = 1100;
        int bonus = amount / 100;
        int balance = 100 + amount + bonus;
        int x = 100;
        if (amount >= 1100) {
            System.out.println("Ваш баланс " + balance + " рублей," + " бонусных из них " + bonus + " рублей");
        } else {
            System.out.println(x + amount + " рублей на Вашем счету");
        }

    }
}
