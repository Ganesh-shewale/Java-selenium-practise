package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver driver;

    public static void initializeDriver() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://mahahsscboard.in/en");
    }

    public static void tearDown() {
        if (driver != null) {
            //driver.quit();
        }
    }

}
