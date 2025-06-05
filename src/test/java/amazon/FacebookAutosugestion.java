package amazon;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookAutosugestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		

	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	
	try {
	    WebElement closePopup = driver.findElement(By.xpath("//button[contains(text(),'✕')]"));
	    closePopup.click();
	} catch (Exception e) {
	    System.out.println("Popup not found or already closed.");
	}
	//wait for each element
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	
	//wait and enter search text
	WebElement searchbox=wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
	searchbox.sendKeys("realme");
	
	List<WebElement>suggestions=wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy
			       (By.xpath("//ul[contains(@class, '1sFryS')]//li")));
	
	int count=suggestions.size();
	System.out.println("Total suggestion="+count);
	for(WebElement suggestion:suggestions) {
		System.out.println(suggestion.getAttribute("textContent"));
	}
	if(count>1) {
		suggestions.get(1).click();
	}else
	{
		System.out.println("Not enough suggestion to click on");
	}
	

}}
