package Day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		
		//isDisplayed()
		 WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		System.out.println("display stattus of logo:"+logo.isDisplayed()); //display stattus of logo:true
		
		
		
		// isEnabled()
		boolean status=driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
		System.out.println("enable status:"+status); //enable status:true
		
		//isSelected
		WebElement male_rd=driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement female_rd=driver.findElement(By.xpath("//input[@id='gender-female']"));
		System.out.println("before selection.....");
		System.out.println(male_rd.isSelected());//false
		System.out.println(female_rd.isSelected());//false
		
		System.out.println("after selecting male.....");
		male_rd.click();// select male radio button
		System.out.println(male_rd.isSelected());// true 
		System.out.println(female_rd.isSelected());// false
		
		System.out.println("after selecting female.....");
		female_rd.click();
		System.out.println(male_rd.isSelected());// false
		System.out.println(female_rd.isSelected());//true
		
		
		boolean newslatterstatus=driver.findElement(By.xpath("//label[normalize-space()='Newsletter']")).isSelected();
       	System.out.println("News letters checkbox status:"+newslatterstatus);//false
	}

}
