package CommonUtilities_;

import java.io.File;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

	
public class WebDriver_Utility {
	
	public WebDriver driver;
	
	public void maximizeWindow(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	
	
	public void waitElementsToLoad(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	public void windowSwitching(WebDriver driver, String partial_Title)
	{
		Set<String> allWins = driver.getWindowHandles();
		Iterator<String> it = allWins.iterator();

		while (it.hasNext()) {
			String win = it.next();
			driver.switchTo().window(win);
			String title = driver.getTitle();
			if (title.contains(partial_Title)) {
				break;
			}
		}
	}
	
	public void dropDown(WebElement ele,String value)
	{
		Select select = new Select(ele);
		select.selectByValue(value);
	}
	
	public void mouseHoverToEle(WebDriver driver , WebElement value) {
		
		Actions act = new Actions(driver);
		act.moveToElement(value).perform();
	}
	
	public void alertAccept(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	
	public  String takeScreenShotEx(WebDriver driver ,String screenShotName) throws Throwable
	{
		TakesScreenshot takeScreenShot = (TakesScreenshot)driver;
		File src = takeScreenShot.getScreenshotAs(OutputType.FILE);
		File dest = new File("./ScreenShots/"+screenShotName+".png");
		FileUtils.copyFile(src, dest);
		return dest.getAbsolutePath();
		
	}
	
	public void waitForElementVisible(WebElement element, int timeoutInSeconds) {
	    WebDriverWait wait = new WebDriverWait(BaseClass.sdriver, Duration.ofSeconds(timeoutInSeconds));
	    wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void waitForElementClickable(WebElement element, int timeoutInSeconds) {
	    WebDriverWait wait = new WebDriverWait(BaseClass.sdriver, Duration.ofSeconds(timeoutInSeconds));
	    wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	


}
