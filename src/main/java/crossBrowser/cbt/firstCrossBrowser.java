package crossBrowser.cbt;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class firstCrossBrowser 
{
@Test
 public void HomePageCheck() throws IOException, URISyntaxException{
	 
	 DesiredCapabilities cap = new DesiredCapabilities();
	 cap.setCapability(CapabilityType.BROWSER_NAME, "MicrosoftEdge");
	 
	 WebDriver driver = new RemoteWebDriver(new URI("http://192.168.1.27:4444/").toURL(), cap);
	 driver.get("https://www.google.co.in/");
	 driver.findElement(By.name("q")).sendKeys("Donald Trumph");
	 Actions ac = new Actions(driver);                    // http://192.168.150.188:4444
	 ac.sendKeys(Keys.ENTER).build().perform();
	 
	 TakesScreenshot ss = (TakesScreenshot) driver;
	 File source  = ss.getScreenshotAs(OutputType.FILE);
	 FileUtils.copyFile(source, new File("SeleniumScreenshots/Screen.png"));
	 driver.quit();
	 
	 try {
			 int i = Integer.parseInt("1");
	 }
	 catch(Exception e){
		 System.out.println("Any Exception");
	 }
	 
 }
    {
    }
    //Making Change for git 
}
