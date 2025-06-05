package pages;

import java.io.IOException;

import org.openqa.selenium.*;

import utils.LocatorReader;


public class Mahasscboard {
	WebDriver driver;
	LocatorReader reader;
	
	public Mahasscboard(WebDriver driver)
	{
		this.driver=driver;
		try {
				reader=new LocatorReader("src/test/resources/locators/Or.properties");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//reader = new LocatorReader("src/test/resources/locators/mahasscboard.properties");
	}
	public WebElement getBoardTextElement() {
		String locator = reader.getLocator("boardText");
		if (locator == null) {
		    throw new RuntimeException("Locator 'boardText' not found in properties file.");
		}
        return driver.findElement(By.xpath(reader.getLocator("boardText")));
    }

    public WebElement getHomeRibbonElement() {
        return driver.findElement(By.xpath(reader.getLocator("homeRibbon")));
    }

    public String getBoardText() {
        return getBoardTextElement().getDomAttribute("textContent");
    }

    public void highlightElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.border='2px solid red'; arguments[0].style.backgroundColor='yellow';", element);
    }
    public void highlightBoardText() {
        WebElement text = getBoardTextElement();
        ((JavascriptExecutor) driver).executeScript("arguments[0].style.display='block';", text);
        highlightElement(text);
    }

    public void highlightHomeRibbon() {
        WebElement home = getHomeRibbonElement();
        highlightElement(home);
    }
	

}
