package extent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class extentreport {
	WebDriver driver = null;
  @Test
  public void login() throws InterruptedException {
	  String chromePath = "C:\\Users\\kaavya.ravichandran\\selenium\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",chromePath);
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'SignIn')]")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.name("userName")).sendKeys("lalitha");
		  Thread.sleep(2000);
		 driver.findElement(By.name("password")).sendKeys("password123");
		  driver.findElement(By.name("Login")).click();
		  Thread.sleep(2000);
		  driver.close();
		  ExtentHtmlReporter report = new ExtentHtmlReporter("C:\\NexGen Testing Stream NEW\\selenium jars.html");
		  ExtentReports extent= new ExtentReports();
		  extent.attachReporter(report);
		  ExtentTest logger=extent.createTest("Login");
		  logger.log(Status.INFO, "login into application");
		  logger.log(Status.PASS, "login successfull");
		  extent.flush();
}
	   
	
	  
  }

