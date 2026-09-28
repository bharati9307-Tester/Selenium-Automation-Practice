package Day34;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleDatepicker {
	//select month and year
	static void selectFutureDate(WebDriver driver,String month,String year,String date)
	{
			while(true)
			{
				//current year and month give
			String curr_month=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String curr_year=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(curr_month.equals(month) && curr_year.equals(year))
			{
				break;
			}
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();//next button
			//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();//previous buttoon click
			}
			
			// select dates
			
			List<WebElement>alldates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		    for(WebElement dt:alldates)
		    {
		    	if(dt.getText().equals(date))
		    	{
		    		dt.click();
		    		break;
		    	}
		    }
}
	//select month and year
	static void selectpastDate(WebDriver driver,String month,String year,String date)
	{
			while(true)
			{
				//current year and month give
			String curr_month=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String curr_year=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(curr_month.equals(month) && curr_year.equals(year))
			{
				break;
			}
			//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();//next button
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();//previous buttoon click
			}
			
			// select dates
			
			List<WebElement>alldates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		    for(WebElement dt:alldates)
		    {
		    	if(dt.getText().equals(date))
		    	{
		    		dt.click();
		    		break;
		    	}
		    }
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		//switchTo() freame
		driver.switchTo().frame(0);
		//1)method 1:using senkeys method
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("04/05/2024");//mm//dd//yyyy
	 
	//method 2):datepicker method
	//expected data	
	String year="2026";
	String month="May";
	String date="20";
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();//open the date picker
		//selectFutureDate(driver,month,year,date);
		selectpastDate(driver,month,year,date);
	  
	}

}
