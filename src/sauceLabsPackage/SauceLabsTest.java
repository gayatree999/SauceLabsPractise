package sauceLabsPackage;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class SauceLabsTest {
	
	public static final String USERNAME="oauth-gayatree999-bb4ac";
	public static final String ACCESS_KEY="16c8761d-9b53-44f6-8f87-92fd04793c4b";
	public static final String URL= "http://" +USERNAME+ ":" +ACCESS_KEY+ "@ondemand.saucelabs.com:80/wd/hub";

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
				
		// refer below link to copy code for configure platform and browser capabilities
		//https://saucelabs.com/platform/platform-configurator#/
		
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("platform", "Windows 10");
		caps.setCapability("version", "103.0.5060.114");
		
		
		WebDriver driver=new RemoteWebDriver(new URL(URL), caps);
		driver.get("https://.google.com");
		System.out.println(driver.getTitle());

	}

}
