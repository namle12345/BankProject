package bankExample;

public class ISA extends PersonalSaverAcc {
	//private static double interestRate = 14.5;
	
	
	/*public void updateInterest(double tmpInterest) {
		interestRate = tmpInterest;
		System.out.println("Updated interest rate: " + interestRate);
	} 
	
	public void updateBalance() {
		double tmpBalance = getBalance() + (getBalance() * (interestRate / 100));
		setBalance(tmpBalance);
		System.out.println("Your updated balance is: " + getBalance());
	}*/
	
	public void depositFunds(double dropAmount) {
		double subTotal = getBalance() + dropAmount;
		setBalance(subTotal);
		System.out.println("The amount deposited was: " + dropAmount);
		System.out.println("The total balance is: " + getBalance());
	}
	
	public void withdrawFunds(double drawAmount) {
		if(getBalance() < drawAmount)
		{
			System.out.println("Account cannot withdraw more than current balance");
		} else {
			double subTotal = getBalance() - drawAmount;
			setBalance(subTotal);
			System.out.println("The amount withdrawn was: " + drawAmount);
			System.out.println("The total balance is: " + getBalance());
		}
	}	
	
	// Verification of account info
		/*public void verifyDetails(){
			System.out.println(getID());
			System.out.println(getSortCode());
			System.out.println(getAccNum());
		}*/
}
