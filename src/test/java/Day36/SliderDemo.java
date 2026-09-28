package Day36;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/slider/range.html?utm_source=chatgpt.com");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		//current location of object
		WebElement min_slider=driver.findElement(By.xpath("//div[@id='slider-range']//span[1]"));
		System.out.println("location of min-slider before moving:"+min_slider.getLocation());//output=(188, 46)=(x,y)
		//getlocation returns the pointer type of object
	    act.dragAndDropBy(min_slider, 50, 46).perform();
	   System.out.println("location of min-slider after moving:"+min_slider.getLocation());
	
	//max slider-move the forworddirection
	   WebElement max_slider=driver.findElement(By.xpath("//span[2]"));
		System.out.println("location of max-slider before moving:"+max_slider.getLocation());//output=(756, 46)=(x,y)
	     act.dragAndDropBy(max_slider, 50, 46).perform();
	    System.out.println("location of max-slider after moving in forword direction :"+max_slider.getLocation());//output=(807,46)
	
	    //max-slider- move the backword direction
	    WebElement max_slider1=driver.findElement(By.xpath("//span[2]"));
		System.out.println("location of max-slider before moving:"+max_slider1.getLocation());//output=(807, 46)=(x,y)
	     act.dragAndDropBy(max_slider1, -56, 46).perform();
	    System.out.println("location of max-slider after moving in backword direction:"+max_slider1.getLocation());//output=(751,46)
	}

}
