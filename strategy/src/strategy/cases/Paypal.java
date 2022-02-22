package strategy.cases;

public class Paypal extends Pay {

	@Override
	public void pay(double price) {
		System.out.println("Pay " + price + "$ by Paypal");
	}

}
