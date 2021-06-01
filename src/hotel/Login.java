package hotel;
import java.util.Scanner;

public class Login {
	public void login() {
	    Scanner keyboard = new Scanner (System.in);
	    String user = "admin";
	    String pass = "pass"; 
	    
	    System.out.print("Enter Username: ");
	    String inpUser = keyboard.nextLine();
	    System.out.print("Enter Password: ");
	    String inpPass = keyboard.nextLine(); 

	    if (inpUser.equals(user) && inpPass.equals(pass)) {
	        System.out.println("Login Successful");
	    } else {
	        System.out.println("Username or Password is invalid");
	        System.exit(0);
	    }
	}
}
