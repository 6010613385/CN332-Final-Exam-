package hotel;

import java.util.Scanner;

public abstract class PayWithDetail implements PayStrategy {
	protected Scanner in = new Scanner(System.in);
    protected PaymentVendor payment;

    @Override
    public void pay(double amount) {
        getPaymentDetail();
        payment.setAmount(amount);
        if (payment.validate()) {
            System.out.println("Paid with " + payment);
        } else {
            System.out.println("Payment failed");
        }
    }

    abstract void getPaymentDetail();
}
