package chapter1;

/**
 * @author Cristina González
 */
public class Purchase {

	public Donut donut;
	public Payment payment;

	public Purchase(Donut donut, Payment payment) {
		this.donut = donut;
		this.payment = payment;
	}
}
