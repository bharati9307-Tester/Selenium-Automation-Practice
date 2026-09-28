package Day43;


	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
    import org.testng.annotations.Test;

	/*
	 * 1)login-@Beforeclass
	 * 2)search-@Test
	* 3)Adv Search-@Test
	 * 4)logout-@Afterclass
	 */
	public class AnnotationDemo2 {
		@BeforeClass
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
	    @AfterClass
	    void logout()
	    {
	    	System.out.println("this is logout");
	    }

}
