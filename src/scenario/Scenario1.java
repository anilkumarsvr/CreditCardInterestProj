package scenario;

import static org.junit.Assert.*;

import org.junit.Test;

import card.CreditCard;
import card.Discover;
import card.MasterCard;
import card.Visa;
import person.Person;
import wallet.Wallet;

public class Scenario1 {
	
	private CreditCard[] cards = {new Visa(100), new MasterCard(100), new Discover(100)};
	private Wallet[] wallet = {new Wallet(cards)};
	private Person person = new Person(wallet);

	
	@Test
	public void personInterest() {
		assertEquals(16.0, person.getInterest(), 0);
	}
	
	@Test
	public void visaInterest() {
		assertEquals(10.0, cards[0].getInterest(), 0);
	}
	
	@Test
	public void mastercardInterest() {
		assertEquals(5.0, cards[1].getInterest(), 0);
	}
	
	@Test
	public void discoverInterest() {
		assertEquals(1.0, cards[2].getInterest(), 0);
	}

}
