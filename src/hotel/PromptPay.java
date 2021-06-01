package hotel;

public class PromptPay extends PayWithDetail{
	@Override
    public void getPaymentDetail() {
        String promptPayId;

        System.out.println("Enter PromptPay ID: ");
        promptPayId = in.nextLine();

        payment = new PromptPayVendor(promptPayId);
    }
}
