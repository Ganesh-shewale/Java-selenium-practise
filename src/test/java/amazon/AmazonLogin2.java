package amazon;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonLogin2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		String title=driver.getTitle();
		System.out.println(title);
		
				
		WebElement languagedownarrow=driver.findElement(By.xpath("//div[@class=\"nav-div\"]/button"));
		
		Actions action=new Actions(driver);
		
		action.moveToElement(languagedownarrow).build().perform();
		//driver.wait(3000);
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		List<WebElement> hi=driver.findElements(By.xpath("(//div[contains(@class,'itemList')])[3]/ul/li"));
		hi.isEmpty();
	    System.out.println("Enter string");
		String option="हिन्दी";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		for(int i=0;i<hi.size();i++)
		{
			if(hi.get(i).getText().contains(option))
			{
				hi.get(i).click();
				System.out.println("clicked");
				break;
				
			}
		}
		
//		String e2=driver.findElement(By.tagName("//h2[.='रोज़मर्रा की ज़रूरत का सामान']")).getText();
//		System.out.println(e2);
		
		
		

	}

}
