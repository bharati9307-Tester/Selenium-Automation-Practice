package Day44;

import org.testng.annotations.Test;

public class PaymentTest {
	@Test(priority=1,groups= {"sanity","regression","functional"})
	void paymentinRupees()
	{
		System.out.println("payment in rupees");
	}
	@Test(priority=2,groups= {"sanity","regression","functional"})
	void paymentinDollers()
	{
		System.out.println("payment in Dollers");
	}
	

}
