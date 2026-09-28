package Day43;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion {
	@Test
	void test()
	{
		//Assert.assertEquals("xyz","xyz");//PASSED
		//Assert.assertEquals(123,345);//FAILED
		//Assert.assertEquals("abc",123);//FAILED
		//Assert.assertEquals("123",123);//FAILED
		
		//Assert.assertNotEquals(123,123);//FAILED
		//Assert.assertNotEquals(123,456);//PASSED
		
		//Assert.assertTrue(true);//pass
		//Assert.assertTrue(false);//falied
		
		//Assert.assertTrue(1==2);//FAILED
		//Assert.assertTrue(1==1);//PASSED
		
		//Assert.assertFalse(1==2);//PASSED
		//Assert.assertFalse(1==1);//FAILED
		
		Assert.fail();//FAILED
		
	}

}
