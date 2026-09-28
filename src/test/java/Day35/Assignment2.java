package Day35;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		WebElement source=driver.findElement(By.xpath("//a[normalize-space()='BANK']"));
		WebElement target=driver.findElement(By.xpath("//ol[@id='bank']//li[@class='placeholder']"));
		Actions act=new Actions(driver);
		act.dragAndDrop(source, target).build().perform();

		
		WebElement source1=driver.findElement(By.xpath("(//a[@class='button button-orange'][normalize-space()='5000'])[2]"));
		WebElement target1=driver.findElement(By.xpath("//ol[@id='amt7']//li[@class='placeholder']"));
		
		act.dragAndDrop(source1, target1).build().perform();
		
		WebElement source2=driver.findElement(By.xpath("//a[normalize-space()='SALES']"));
		WebElement target2=driver.findElement(By.xpath("//ol[@id='loan']//li[@class='placeholder']"));
		
		act.dragAndDrop(source2, target2).build().perform();
		
		WebElement source3=driver.findElement(By.xpath("(//a[@class='button button-orange'][normalize-space()='5000'])[1]"));
		WebElement target3=driver.findElement(By.xpath("//ol[@id='amt8']//li[@class='placeholder']"));
		
		act.dragAndDrop(source3, target3).build().perform();
	}

}
