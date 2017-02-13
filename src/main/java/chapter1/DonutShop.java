package chapter1;

/**
 * @author Cristina González
 */
public class DonutShop {

	public static Tuple<Donut,Payment> buyDonut(CreditCard creditCard) {
		Donut donut = new Donut();
		Payment payment = new Payment(creditCard, donut.price);
		return new Tuple<Donut, Payment>(donut, payment);
	}
}
