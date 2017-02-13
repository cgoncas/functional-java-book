package chapter1;

/**
 * @author Cristina González
 */
public class DonutShop {

	public static Donut buyDonut(CreditCard creditCard) {
		Donut donut = new Donut();
		creditCard.charge(donut.price);
		return donut;
	}
}
