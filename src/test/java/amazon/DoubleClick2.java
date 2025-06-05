package amazon;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v136.page.model.Screenshot;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		
		driver.get("https://grotechminds.com/registration/");
		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		driver.manage().window().maximize();
		Thread.sleep(10000);
		
try {
			
			WebElement closePopup = driver.findElement(By.xpath("//div[@id='chat-bot-message-close']"));
	    closePopup.click();
	} catch (Exception e)
		{
		
	    System.out.println("Popup not found or already closed.");
	}
		WebElement name=	driver.findElement(By.xpath("//input[@id='fname']"));
		name.sendKeys("ganesh");
		Actions action=new Actions(driver);
		Thread.sleep(5000);
		action.doubleClick(name).perform();

	
		
	}

}
