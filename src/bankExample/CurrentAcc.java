package bankExample;

public class CurrentAcc extends Account implements EverydayAcc {
	private int overdraft = 0;
	private double odInterest = 0;
	
	public CurrentAcc() {
	}
	
	public CurrentAcc(int tmpOverdraft) {
		overdraft = tmpOverdraft;
	}
	
	public CurrentAcc(double tmpOdInterest) {
		odInterest = tmpOdInterest;
	}
	
	public CurrentAcc(int tmpOverdraft, double tmpOdInterest) {
		overdraft = tmpOverdraft;
		odInterest = tmpOdInterest;
	} 
	
	public void updateBalance() {
		double tmpOdCharge = overdraftUsed() * (odInterest / 100);
		double tmpBalance = getBalance() + tmpOdCharge;
		setBalance(tmpBalance);
		System.out.println("Your updated balance is: " + getBalance());
	}
	
	private double overdraftUsed() {
		double count = 0;
		double tmpBal = getBalance();
		
		while(tmpBal < 0) {
			count = count + 1;
			tmpBal = tmpBal + 1;
		}
		//System.out.println("The overdraft amount used is: " + count);
		return -count;
	}
	
	public void updateOdInterest(double tmpInterest) {
		odInterest = tmpInterest;
	}
	
	/*public void depositFunds(double dropAmount) {
		double subTotal = getBalance() + dropAmount;
		setBalance(subTotal);
		System.out.println("The amount deposited was: " + dropAmount);
		System.out.println("The total balance is: " + getBalance());
	}*/
	
	@Override
	public void withdrawFunds(double drawAmount) {
		if(getBalance() < (0 - overdraft))
		{
			System.out.println("Account cannot withdraw more than current balance, including overdraft");
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
