package bankExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Account {
	private int id = idGen();
	private double balance;
	private int sortCode = sortCodeGen();
	private int accountNumber = accountCodeGen();
	
	public abstract void updateBalance();
	public abstract void depositFunds(double dropAmount);
	public abstract void withdrawFunds(double drawAmount);
	
	private static int idGen() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 1; i<100; i++){
			list.add(new Integer(i));
		}
		
		Collections.shuffle(list);
		return list.get(0);
	}
	
	private int sortCodeGen() {
		int randomSortCode = ThreadLocalRandom.current().nextInt(0, 999999 + 1);
		return randomSortCode;
	}
	
	private int accountCodeGen() {
		int randomAccountCode = ThreadLocalRandom.current().nextInt(0, 99999999 + 1);
		return randomAccountCode;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public void setBalance(double tmpbal) {
		this.balance = tmpbal;
	}
	
	// VALIDATE ACCOUNT VARIABLES AND GENERATION
	
	/*public int getID() {
		return this.id;
	}
	
	public int getSortCode() {
		return this.sortCode;
	}
	
	public int getAccNum() {
		return this.accountNumber;
	}*/
	
}
