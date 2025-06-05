package amazon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RedBusBooking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		
		WebElement From=driver.findElement(By.xpath("(//*[@id=\"root\"]/div[3]/div/div[2]/div/div/div[1]/div[1]/div/div]"));
		//From.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		From.sendKeys("sion");
		From.sendKeys(Keys.TAB);
		
		driver.findElement(By.tagName("//div[.='To']")).sendKeys("mumbai");
		driver.findElement(By.cssSelector("button[class^='primaryButton']")).click();

	}

}
