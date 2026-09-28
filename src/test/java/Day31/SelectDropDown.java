package Day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement dropcountryele=driver.findElement(By.xpath("//select[@id='country']"));
		Select dropcountry=new Select (dropcountryele);
		
		
		//select option from the dropdown
		// 3 methods are available
		dropcountry.selectByVisibleText("France");
		//2)dropcountry.selectByValue("japan");
		//3)dropcountry.selectByIndex(6);
		
		//capture the options from the dropdown
		//List<WebElement>options=dropcountry.getOptions();
		//System.out.println("number of options in a dropdown:"+options.size());// output=number of options in a dropdown:10
	    
		
		/*printing the options
		for(int i=0;i<options.size();i++)
		{
			System.out.println(options.get(i).getText());
			output=United States
			Canada
			United Kingdom
			Germany
			France
			Australia
			Japan
			China
			Brazil
			India
	        }*/
		
		//enhanced for loop
		//for(WebElement op:options)
		//{
			//System.out.println(op.getText());
			/*output=United States
					Canada
					United Kingdom
					Germany
					France
					Australia
					Japan
					China
					Brazil
					India*/
		}

		}
	
	
//	}


