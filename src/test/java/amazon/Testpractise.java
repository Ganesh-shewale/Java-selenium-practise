package amazon;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testpractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		System.out.println(driver.getTitle());
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("Password123");
		driver.findElement(By.id("submit")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		String actualtitle="Logged In Successfully";
		driver.findElement(By.xpath("//h1[@class='post-title']"));
		String expectedtitle="Logged In Successfully";
		assertEquals(actualtitle,expectedtitle,"Logged In Successfully");
		System.out.println("Login Successfully");
		

	}

}
