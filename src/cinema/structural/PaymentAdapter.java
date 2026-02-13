package cinema.structural;

public class PaymentAdapter implements Payment {

    private OldPaymentSystem oldPaymentSystem;

    public PaymentAdapter(OldPaymentSystem oldPaymentSystem) {
        this.oldPaymentSystem = oldPaymentSystem;
    }

    @Override
    public void pay(double amount) {
        oldPaymentSystem.makePayment(amount);
    }
}
