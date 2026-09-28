package Day29;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
driver.get("https://the-internet.hackerearth.com/javascript_alerts");
driver.manage().window().maximize();


/*1)//normal alert with ok button
driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
Thread.sleep(5000);
Alert myalert=driver.switchTo().alert();//.switchTo()-return alert window // and .accept()- close alert window
System.out.println(myalert.getText());
myalert.accept();*/

/*2)confirmation alert-ok&cancle
driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
Thread.sleep(5000);
driver.switchTo().alert().accept();//close alert using ok button
//driver.switchTo().alert().dismiss();//close alert using cancel buttton*/


//3) js prompt alert-input box
driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
Thread.sleep(5000);
Alert myPrompAlert=driver.switchTo().alert();
myPrompAlert.sendKeys("welcome");
myPrompAlert.accept();
	
	}

}
