package Day38;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DisableAutomatedMessageOnScreen {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("excludeSwitches",new String[] {"enable-automation"});
		
		WebDriver d=new ChromeDriver(options);
		d.get("https://kite.zerodha.com/");
		d.manage().window().maximize();
		System.out.println("title of the page:"+d.getTitle());
		
		

	}

}
