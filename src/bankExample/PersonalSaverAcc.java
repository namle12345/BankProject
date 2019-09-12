package bankExample;

public abstract class PersonalSaverAcc extends Account {
	protected static double interestRate = 14.5;

	public static double getInterestRate() {
		return interestRate;
	}

	public static void setInterestRate(double interestRate) {
		PersonalSaverAcc.interestRate = interestRate;
	}

	
	public void updateBalance() {
		double tmpBalance = getBalance() + (getBalance() * (interestRate / 100));
		setBalance(tmpBalance);
		System.out.println("Your updated balance is: " + getBalance());
	}
	
	
	
	// Allows for further expansion of functionality based on this class

}
