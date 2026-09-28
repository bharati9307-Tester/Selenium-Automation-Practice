package Day37;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFiles {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();
		
		//single file upload
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\Users\\DELL\\Downloads\\text1.txt.txt");
	     if(driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("text1.txt.txt"))
	     {
	    	 System.out.println("file is successfully uploafded");
	     }
	     else
	     {
	    	 System.out.println("upload failed");
	     }
	     
	
	}

}
