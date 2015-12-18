package scenario;

import static org.junit.Assert.*;

import org.junit.Test;

import card.CreditCard;
import card.Discover;
import card.MasterCard;
import card.Visa;
import person.Person;
import wallet.Wallet;

public class Scenario2 {

	private CreditCard[] cardsInWallet1 = {new Visa(100), new Discover(100)};
	private CreditCard[] cardsInWallet2 = {new MasterCard(100)};
	private Wallet[] wallets = {new Wallet(cardsInWallet1), new Wallet(cardsInWallet2)};
	private Person person = new Person(wallets);
	
	
	@Test
	public void personInterest() {
		assertEquals(16.0, person.getInterest(), 0);
	}
	
	@Test
	public void wallet1Interest() {
		assertEquals(11.0, wallets[0].getInterest(), 0);
	}
	
	@Test
	public void wallet2Interest() {
		assertEquals(5.0, wallets[1].getInterest(), 0);
	}
	
}
