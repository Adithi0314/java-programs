
public class ATM {

	public static void main(String[] args) {
		int pin=4321;
		double amt=40000.0;
		double acc_bal=30000.0;
		if(pin==4321) {
			if(amt<=acc_bal) {
				acc_bal=acc_bal-amt;
				System.out.println("Withdraw Successful");
				System.out.println("The account balance is :" +acc_bal);
			}
			else {
				System.out.println("Withdraw failed");
			}
		}
		else {
			System.out.println("Incorrect pin");
		}
	}
	

}
