package bankExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Customer {
	private int id = idGen();
	private String firstName;
	private String surname;
	private List<Account> accountsList = new ArrayList<Account>();
	
	private static int idGen() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i < 100; i++) {
			list.add(new Integer(i));
		}

		Collections.shuffle(list);
		return list.get(0);
	}
	
	public Customer(String inputFirstName, String inputSurname) {
		setFirstName(inputFirstName);
		setSurname(inputSurname);
	}
	
	public Customer(String inputFirstName, String inputSurname, Account inputAccount) {
		setFirstName(inputFirstName);
		setSurname(inputSurname);
		accountsList.add(inputAccount);
	}
	
	public Customer(String inputFirstName, String inputSurname, List<Account> inputAccountsList) {
		setFirstName(inputFirstName);
		setSurname(inputSurname);
		setAccountsList(inputAccountsList);
	}

	public void addAccount(Account account) {
		
		accountsList.add(account);
	
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public List<Account> getAccountsList() {
		return accountsList;
	}

	public void setAccountsList(List<Account> accountsList) {
		this.accountsList = accountsList;
	}

}
