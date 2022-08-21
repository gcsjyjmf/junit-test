
import org.junit.Assert;
import org.junit.Test;

/**
 * 
 * this class is to test if the YourPurchases class can calculate the changes
 * correctly
 *
 */
public class YourPurchasesTest {
	private static final double EPSILON = 1E-12;

	@Test
	/**
	 * test the value of change is same as expected value in the condition of buying
	 * two items
	 */
	public void twoPurchases() {
		YourPurchases register = new YourPurchases();
		register.recordPurchase(0.75);
		register.recordPurchase(1.50);
		register.receivePayment(2, 0, 5, 0, 0);
		double expected = 0.25;
		Assert.assertEquals(expected, register.giveChange(), EPSILON);
	}
	// YOUR TASKS ARE STATED HERE:
	// RUN THE CODE YOU RECEIVED AND DEMO THAT THERE IS NO ERROR
	// WHILE YOU DEMO, MODIFY THIS TEST CASE SUITE TO SHOW AN EXAMPLE OF AN
	// UNSUCCESSFUL EXECUTION
	// IMPROVE THIS CODE BY ADDING JUST ONE MORE TEST CASE (NOT ALREADY STATED IN
	// THIS CODE)
	// RUN AND DEMO YOUR NEW TEST CASE SUITE

	// ADD NEW TEST CASES HERE!!!
	// USE A DIFFERENT ASSERTION (NOT assertEquals) IN AT LEAST ONE OF YOUR TESTS.

	@Test
	/**
	 * test the value of change is same as expected value in the condition of buying
	 * three items
	 */
	public void threePurchases() {
		YourPurchases register = new YourPurchases();
		register.recordPurchase(1.25);
		register.recordPurchase(0.50);
		register.recordPurchase(0.25);
		register.receivePayment(1, 2, 8, 0, 0);
		double expected = 0.30;
		Assert.assertEquals(expected, register.giveChange(), EPSILON);
	}

	@Test
	/**
	 * test the if the two objects have the same memory address
	 */
	public void equalObjects() {
		YourPurchases register1 = new YourPurchases();
		YourPurchases register2 = new YourPurchases();
		Assert.assertFalse(register1 == register2);
	}
}
