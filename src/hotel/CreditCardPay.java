package hotel;

import java.util.Scanner;

public class CreditCardPay extends PayWithDetail {
    private Scanner in = new Scanner(System.in);
    private CreditCard card;

    @Override
    public void pay(double amount) {
        getPaymentDetail();
        card.setAmount(amount);
        if (card.validate()) {
            System.out.println("Paid with " + card);
        } else {
            System.out.println("Payment Credit Card failed");
        }
    }

    public void getPaymentDetail() {
        System.out.println("Enter Card number: ");
        String number = in.nextLine();
        System.out.println("Enter expiration date mm/yy: ");
        String date = in.nextLine();
        System.out.println("Enter CVV code: ");
        String cvv = in.nextLine();

        card = new CreditCard(number, date, cvv);
    }
}