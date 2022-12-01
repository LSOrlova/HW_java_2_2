public class Main {
    public static void main(String[] args) {
        int balance = 200;
        int amount = 500;
        int limit = 100;
        if (amount > limit) {
            balance = balance + amount + amount / limit;
        } else {
            balance = balance + amount;
        }

        System.out.println("Your balance is " + balance + " rubles");
    }
}