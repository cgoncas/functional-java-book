package chapter1.test;

import chapter1.CreditCard;
import chapter1.Donut;
import chapter1.DonutShop;
import chapter1.Payment;
import chapter1.Tuple;
import java.util.List;
import org.junit.Test;
import org.junit.Assert;

/**
 * @author Cristina González
 */
public class TestDonutShop {

	@Test
	public void tesBuyDonuts() {
		CreditCard creditCard = new CreditCard();
		Tuple<List<Donut>, Payment> purchase = DonutShop.buyDonuts(5, creditCard);

		Assert.assertEquals(Donut.price * 5, purchase._2.amount);
		Assert.assertEquals(creditCard, purchase._2.creditCard);
	}
}
