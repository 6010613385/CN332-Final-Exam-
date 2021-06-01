package hotel;

import java.util.Scanner;

public class Payment {
	private PayStrategy type = new CashPay();

    public void setType(PayStrategy type) {
        this.type = type;
    }

    public void pay(double amount) {
        this.type.pay(amount);
    }
}
