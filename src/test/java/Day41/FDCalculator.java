package Day41;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FDCalculator {

	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
		driver.manage().window().maximize();
		String filepath=System.getProperty("user.dir")+"\\test data\\Simple_Interest_Table.xlsx";
		 int rows=ExcelUtils.getRowCount(filepath, "Simple Interest");
		 for(int i=1;i<=rows;i++)//i=represent the row
		 {
			 //read data from excel
			String prin=ExcelUtils.getCellData(filepath,"Simple Interest",i,0);
			String rateofintrest=ExcelUtils.getCellData(filepath,"Simple Interest",i,1);
			String per1=ExcelUtils.getCellData(filepath,"Simple Interest",i,2);
			String per2=ExcelUtils.getCellData(filepath,"Simple Interest",i,3);
			String fer=ExcelUtils.getCellData(filepath,"Simple Interest",i,4);
			String exp_mvalue=ExcelUtils.getCellData(filepath,"Simple Interest",i,5);
			
			//pass above data into application
			driver.findElement(By.xpath("//input[@id='principal']")).sendKeys(prin);
			driver.findElement(By.xpath("//input[@id='interest']")).sendKeys(rateofintrest);
			driver.findElement(By.xpath("//input[@id='tenure']")).sendKeys(per1);
			Select perdrp=new Select (driver.findElement(By.xpath("//select[@id='tenurePeriod']")));
			perdrp.selectByVisibleText(per2);
			Select ferdrp=new Select(driver.findElement(By.xpath("//select[@id='frequency']")));
			ferdrp.selectByVisibleText(fer);
			
			WebElement element=driver.findElement(By.xpath("//div[@class='cal_div']//a[1]"));
			((JavascriptExecutor)driver).executeScript("arguments[0].click();",element);
			
			//validation
			String act_mvalue=driver.findElement(By.xpath("//span[@id='resp_matval']//strong")).getText();
			if(Double.parseDouble(exp_mvalue)==Double.parseDouble(act_mvalue))
			{
				System.out.println("test is passed...");
                ExcelUtils.setCellData(filepath,"Simple Interest",i,7,"passed");
                ExcelUtils.fillGreenColor(filepath,"Simple Interest",i,7);
                
			}
			else
			{
				System.out.println("test is failed...");
                ExcelUtils.setCellData(filepath,"Simple Interest",i,7,"Failed");
                ExcelUtils.fillRedColor(filepath,"Simple Interest",i,7);	
			}
			Thread.sleep(3000);
		  WebElement element1=driver.findElement(By.xpath("(//img[@class='PL5'])[1]"));//click on the clear button
		  ((JavascriptExecutor)driver).executeScript("arguments[0].click();",element1);
		 }
		 driver.quit();
	}

}
