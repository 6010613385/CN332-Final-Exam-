package hotel;

public class CashPay implements PayStrategy {
	@Override
    public void pay(double amount) {
        System.out.println("paid with cash " + amount);
    }
}
