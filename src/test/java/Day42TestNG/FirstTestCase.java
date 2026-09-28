package Day42TestNG;

import org.testng.annotations.Test;

/*
 * 1)open application
 * 2)login
 * 3)logout
 */
public class FirstTestCase 
{
	@Test(priority=1)
void openapp()
{
		System.out.println("opening application....");	
}
	@Test(priority=2)
void login()
{
System.out.println("login to application....");	
}
	@Test(priority=3)
void logout()
{
System.out.println("logout from application....");	
}
}
