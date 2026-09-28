package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OneByOneSelectCheckbox {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.qa-practice.com/elements/checkbox/mult_checkbox");
		d.manage().window().maximize();
		List<WebElement> list=d.findElements(By.xpath("//input[@class='form-check-input']"));
		for(int i=0;i<list.size();i++)
		{
			Thread.sleep(2000);
			list.get(i).click();
		}
		
	}

}
