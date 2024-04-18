package crossBrowser.cbt;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class parallelCBT {
	
	@Test
	public void secondTest() throws MalformedURLException, URISyntaxException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName("chrome");
		 
		 WebDriver driver = new RemoteWebDriver(new URI("http://192.168.1.27:4444/").toURL(), cap);
		 driver.get("https://www.amazon.in/");
		 System.out.println(driver.getTitle());
		 driver.quit();
	}

}
