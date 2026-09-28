package Day29;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAuthenticatedpopup {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.hackerearth.com/basic_auth");
		driver.get("https://admin:admin@the-internet.hackerearth.com/basic_auth");
	}

}
