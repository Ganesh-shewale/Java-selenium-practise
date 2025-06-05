package amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserSwichcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String browser="edge";
		WebDriver driver =null;
		
		switch(browser.toLowerCase())
		{
		case"chrome":
			driver=new ChromeDriver();
			break;
		
		case"edge":
			driver=new EdgeDriver();
			break;
		case"firefox":
			driver=new FirefoxDriver();
			break;
		default:
			System.out.println("Invalid browser selection");
			System.exit(1);//Exit program
		}
		driver.get("https://www.google.com");
		
		//title
		System.out.println("Page Title :"+driver.getTitle());
		
		driver.quit();
		
		

	}

}
