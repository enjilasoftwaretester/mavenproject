package FunctionalTest;

import org.testng.annotations.Test;

public class Payment 
{

	@Test
	public void verifyElectronicItemsPayment()
	{
		System.out.println("Check all electronic Payment ");
	}
	@Test
	public void verifyUPIPayment()
	{
		System.out.println("Check all upi payment");
	}
	@Test
	public void verifyDebitcardPayment ()
	{
		System.out.println("Check all Debit card Payment  ");
	}

	@Test
	public void verifyCreditcardPayment ()
	{
		System.out.println("Check all Credit card Payment  ");
	}
	
	@Test
	public void verifyNetBanking ()
	{
		System.out.println("Check all Net banking payment  ");
	}

}
