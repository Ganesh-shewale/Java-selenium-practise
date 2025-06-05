package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropGTM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://grotechminds.com/drag-and-drop/");
		WebElement drag1=driver.findElement(By.id("drag1"));
		WebElement drop=driver.findElement(By.xpath("//div[@id='div2']"));
		//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		
		Actions action=new Actions(driver);
		action.dragAndDrop(drag1, drop).perform();
		System.out.println("pass");
		

	}

}
