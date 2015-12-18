package person;

import wallet.Wallet;

public class Person {
	
	private Wallet[] wallet;
	private double interest = 0;
	
	public Person() {}
	
	public Person(Wallet[] wallet) {
		setWallet(wallet);
		calcInterest();
	}
	
	public void calcInterest() {
		for(int i = 0; i < wallet.length; i++)
			this.interest += wallet[i].getInterest();
	}

	public Wallet[] getWallet() {
		return wallet;
	}

	public void setWallet(Wallet[] wallet) {
		this.wallet = wallet;
	}

	public double getInterest() {
		return interest;
	}

	public void setInterest(double interest) {
		this.interest = interest;
	}

}
