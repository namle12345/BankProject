package bankExample;

import java.util.ArrayList;
import java.util.List;

public class Client {
	public static void main(String[] args) {

		SaverAcc saver = new SaverAcc();
		CurrentAcc current = new CurrentAcc(2000, 2.5);
		ISA isa = new ISA();
		ISA isa2 = new ISA();
		
		saver.depositFunds(600);
		saver.withdrawFunds(500);
		saver.updateBalance();

		current.depositFunds(500);
		current.withdrawFunds(2000);
		current.updateBalance();

		isa.depositFunds(900);
		isa.updateBalance();

		isa2.depositFunds(900);
		//isa2.updateInterest(5.0);
		isa2.updateBalance();
		
		List<Account> testList = new ArrayList<Account>();
		testList.add(isa2);
		testList.add(saver);
		testList.add(current);
		
		Customer customer1 = new Customer("Test", "Tom", testList);
		Customer customer2 = new Customer("Test", "Tom", isa2);
		/*customer1.setFirstName("Test");
		customer1.setSurname("Tom");
		customer1.addAccount(isa2);
		customer1.addAccount(saver);
		customer1.addAccount(current);*/
		
		isa2.setInterestRate(5.0);
		
		List<Account> customerAccounts = customer1.getAccountsList();
		List<Account> customerAccounts2 = customer2.getAccountsList();
		
		for (Account acc : customerAccounts) {
			
			if (acc instanceof PersonalSaverAcc) {
				((PersonalSaverAcc) acc).setInterestRate(50.0);
				((PersonalSaverAcc) acc).updateBalance();
				System.out.println(acc.getBalance());
			}
				
			
		}
		
	}
}
