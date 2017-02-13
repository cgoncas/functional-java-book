package chapter1;

/**
 * @author Cristina González
 */
public class Payment {
	public final CreditCard creditCard;
	public final int amount;

	public Payment(CreditCard creditCard, int amount) {
		this.creditCard = creditCard;
		this.amount = amount;
	}
}
