package cinema.behavioral;

public class EWalletPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Paid with E-Wallet: " + amount);
    }
}
