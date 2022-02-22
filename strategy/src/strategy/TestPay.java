package strategy;

import java.util.Scanner;

import strategy.cases.MasterCard;
import strategy.cases.PayManager;
import strategy.cases.Paypal;
import strategy.cases.VisaCard;

public class TestPay {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("You need to pay $25 for mobile phone");
		System.out.println("Please select payment method 1:MasterCard 2:VisaCard 3:Paypal");
		
		int code = in.nextInt();
		PayManager payManager = null;
		
		switch(code) {
			case 1:
				payManager = new PayManager(new MasterCard());
				break;
			case 2:
				payManager = new PayManager(new VisaCard());
				break;
			case 3:
				payManager = new PayManager(new Paypal());
				break;
		}
		
		payManager.doPay(25);
		
		in.close();
	}
}
