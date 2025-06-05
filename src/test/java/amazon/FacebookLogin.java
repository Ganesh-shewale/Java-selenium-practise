package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement username=driver.findElement(By.xpath("//input[@id=\"email\"]"));
		username.sendKeys("shewalegn@gmail.com");
		WebElement pass=driver.findElement(By.xpath("//input[@id=\"pass\"]"));
		pass.sendKeys("Ganesh@123");
		System.out.println(driver.getTitle());
		WebElement login=driver.findElement(By.xpath("//button[@name=\"login\"]"));
		
		login.click();
		
		
		
		
		

	}

}
