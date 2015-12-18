package scenario;

import static org.junit.Assert.*;

import org.junit.Test;

import card.CreditCard;
import card.MasterCard;
import card.Visa;
import person.Person;
import wallet.Wallet;

public class Scenario3 {
	
	private CreditCard[] cardsP1 = {new MasterCard(100), new Visa(100)};
	private CreditCard[] cardsP2 = {new Visa(100), new MasterCard(100)};
	private Wallet[] p1wallet = {new Wallet(cardsP1)};
	private Wallet[] p2wallet = {new Wallet(cardsP2)};
	private Person person1 = new Person(p1wallet);
	private Person person2 = new Person(p2wallet);
	
	
	@Test
	public void person1Interest() {
		assertEquals(15.0, person1.getInterest(), 0);
	}
	
	@Test
	public void person2Interest() {
		assertEquals(15.0, person2.getInterest(), 0);
	}
	
	@Test
	public void person1WalletInterest() {
		assertEquals(15.0, p1wallet[0].getInterest(), 0);
	}
	
	@Test
	public void person2WalletInterest() {
		assertEquals(15.0, p2wallet[0].getInterest(), 0);
	}

}
