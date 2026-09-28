package Day43;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*
 * 1)login-@BeforeMethod
 * 2)search-@test
 * 3)logout-@AterMethod
 * 4)login
 * 5)Adv Search-@Test
 * 6)logout
 */
public class AnnotationDemo1 {
	@BeforeMethod
	void login()
	{
		System.out.println("this is login");
	}
	@Test(priority=1)
	void search()
	{
		System.out.println("this is search....");
	}
	@Test(priority=2)
    void advsearch()
    {
    System.out.println("this is advance search...");
    }
    @AfterMethod
    void logout()
    {
    	System.out.println("this is logout");
    }
    
    
    
}
