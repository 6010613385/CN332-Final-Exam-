package hotel;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		
		//Login Phase
		System.out.println("Hotel Reservation Program");
		Login login = new Login();
		login.login();
		
		//Room Reserve Phase
		
		Scanner keyboard = new Scanner (System.in);
		boolean wifi_status = false;
		
		System.out.println("Our Service");
		System.out.println("1 Bed and 2 Bed in a room");
		System.out.println("We also have wifi service");
		System.out.println("Please Enter Guest number: ");
		int guest = keyboard.nextInt();
		System.out.println("Please Enter Number of Bed: ");
		int bed = keyboard.nextInt();
		System.out.println("Please Enter Number of Night to stay: ");
		int night = keyboard.nextInt();
		System.out.println("Do you want wifi service? (type => 1 for yes / type => 0 for no): ");
		int wifi = keyboard.nextInt();
		if(wifi==1) {
			wifi_status = true;
		}
		else if(wifi==0) {
			wifi_status = false;
		}
		else {
			System.out.println("invalid input");
		}

		Reserve room = new Reserve(guest,bed,night,wifi_status);
		int amount = room.getCost();
		
		//Payment Phase
		System.out.println("Please Select Payment type: ");
		System.out.println("type => 1 for pay with cash");
		System.out.println("type => 2 for pay with credit card");
		System.out.println("type => 3 for pay with Promtpay");
		int pay_type = keyboard.nextInt();
		
		Payment payment = new Payment();
		
		if(pay_type==1) {
			payment.pay(new CashPay());
		}
		else if(wifi==2) {
			payment.pay(new CreditCardPay());
		}
		else if(wifi==3) {
			cart.pay(new PromptPay());
		}
		else {
			System.out.println("invalid input");
		}
	}

}
