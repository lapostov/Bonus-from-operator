public class Main {

    public static void main(String[] args) {
        int amount = 5000;
        int bonus = amount / 100;
        int balance = 100 + amount + bonus;
        int check = 100;
        if (amount >= 1100) {
            System.out.println("Ваш баланс " + balance + " рублей," + " бонусных из них " + bonus + " рублей");
        } else {
            System.out.println(check + amount + " рублей на Вашем счету");
        }

    }
}
