package Day43;

import org.testng.annotations.*;

public class AllAnnotation {
@BeforeSuite
void bs()
{
	System.out.println("this is beforeSuite...");
}
@AfterSuite
void as()
{
	System.out.println("This is AfterSuite...");
}
@BeforeTest
void bt()
{
	System.out.println("This is BeforeTest method");
}
@AfterTest
void at()
{
	System.out.println("This is AfterTest method");
}
@BeforeClass
void bc()
{
	System.out.println("This is BeforeClass method");
}
@AfterClass
void ac()
{
	System.out.println("This is AfterClass method");
}
@BeforeMethod
void bm()
{
	System.out.println("This is BeforeMethod");
}
@AfterMethod
void am()
{
	System.out.println("This is AfterMethod");
}

@Test(priority=1)
void t1()
{
System.out.println("This is Test Method 1");
}
@Test(priority=2)
void t2()
{
	System.out.println("This is Test Method 2");
}

}
