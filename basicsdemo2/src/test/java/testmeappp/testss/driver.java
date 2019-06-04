package testmeappp.testss;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;



public class driver {
	@Test
	public static WebDriver getDriver(String s)
	{
	if(s.equals("ie"))
	{
		String iePath = "C:\\Users\\kaavya.ravichandran\\selenium\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver", iePath);
		return new InternetExplorerDriver();
	}
	else if(s.equals("chrome"))
			{
				String chromePath = "C:\\Users\\kaavya.ravichandran\\selenium\\chromedriver_win32\\chromedriver.exe";
			     System.setProperty("webdriver.chrome.driver",chromePath);
			     return new ChromeDriver();
			}
			else
				return null;
	}





	
}


