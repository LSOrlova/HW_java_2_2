public class Main {
    public static void main(String[] args) {
        int balance = 200;
        int amount = 1_000;
        int limit = 100;
        int bonus;
        if (amount > limit) {
            balance = balance + amount + amount / limit;
        } else {
            balance = balance + amount;
        }

        System.out.println("Your balance is " + balance + " rubles");
    }
}