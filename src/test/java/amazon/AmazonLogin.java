package amazon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AmazonLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		String title=driver.getTitle();
		System.out.println(title);
		
		WebElement searchBox=driver.findElement(By.id("twotabsearchtextbox")	);
		
		searchBox.sendKeys("Realme phone");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//div[@class='s-suggestion s-suggestion-ellipsis-direction']")).click();
		
		
		
		
		
		

	}

}
