package Day47;

  import java.util.List;

  //import org.openqa.selenium.By;
  import org.openqa.selenium.WebDriver;
  import org.openqa.selenium.WebElement;
  import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 
{
	WebDriver driver;
	//constructor
	LoginPage2(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements( driver,this);//mandatory for using page object model
	}
	//Locators
	
	//@FindBy(xpath="//input[@placeholder='Username']") WebElement txt_user;
	//or use
	@FindBy(how=How.XPATH,using="//input[@placeholder='Username']")WebElement txt_user;
	@FindBy(xpath="//input[@placeholder='Password']") WebElement txt_pwd;
	@FindBy(xpath="//button[normalize-space()='Login']") WebElement btn_login;
	//capture all the link
	@FindBy(tagName="a")
	List<WebElement> links;
	
	
	//Action methods
	public void setUserName(String user)
	{
		txt_user.sendKeys(user);
	}
	
	public void setPassword(String pwd)
	{
		txt_pwd.sendKeys(pwd);
	}
	public void clicklogin()
	{
		btn_login.click();
	}
	

}
