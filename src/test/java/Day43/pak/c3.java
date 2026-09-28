package Day43.pak;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class c3 {
	@Test  
	void pqr()
	{
		System.out.println("this is pqr from c3...");
	}
	@AfterSuite
	void as()
	{
		System.out.println("This is AfterSuite method...");
	}
	@BeforeSuite
	void bs()
	{
	System.out.println("this is beforeSuite method....");	
	}

}
