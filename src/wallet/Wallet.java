package wallet;

import card.CreditCard;

public class Wallet {
	
	private CreditCard[] cards;
	private double interest = 0;
	
	public Wallet() {}
	
	public Wallet(CreditCard[] cards) {
		setCards(cards);
		calcInterest();
	}
	
	public void calcInterest() {
		for(int i = 0; i < cards.length; i++)
			this.interest += cards[i].getInterest();
	}

	public double getInterest() {
		return interest;
	}

	public void setInterest(double interest) {
		this.interest = interest;
	}

	public CreditCard[] getCards() {
		return cards;
	}

	public void setCards(CreditCard[] cards) {
		this.cards = cards;
	}

}
