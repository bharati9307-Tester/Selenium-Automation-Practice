package Day43;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDemo {
	
	@Test
	void TestTitle()
	{
		String act_title="Opencart";
		String exp_title="Openshot";
		
	//Assert.assertEquals(act_title,exp_title);
		//or alternative for assert class
		if(act_title.equals(exp_title))
		{
			System.out.println("test passed");
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("test is failed");
			Assert.assertTrue(false);
		}
	}

}
