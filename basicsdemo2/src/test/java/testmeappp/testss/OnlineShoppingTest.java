package testmeappp.testss;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import testme.utility.Driverex;

public class OnlineShoppingTest {

public String url="http://10.232.237.143:443/TestMeApp/";
public WebDriver d;


  @AfterClass
  public void endreport() {
	  d.close();
	  System.out.println("closing browser");
}
  @AfterMethod
  public void getresult()
  {
  }
  
  @BeforeClass
  public void startreport() {
	  d=Driverex.getDriver("chrome");
	  d.get(url);
	  System.out.println("opening browser");  
  }
  @Test(priority=3)
  
	  public void testCart() throws InterruptedException {
	 d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  Actions action=new Actions(d);
	  action.moveToElement(d.findElement(By.xpath("//ul[@id='menu3']/li[2]/a/span"))).perform();
	  Thread.sleep(3000);
	  action.moveToElement(d.findElement(By.xpath("//span[contains(.,'Electronics')]"))).click().build().perform();
	  Thread.sleep(3000);
	  action.moveToElement(d.findElement(By.xpath("//a[contains(.,'Travel Kit')]"))).click().build().perform();
	  Thread.sleep(3000);
	  d.findElement(By.linkText("Add to cart")).click();
	  Thread.sleep(3000);
	  d.findElement(By.xpath("//a[contains(@href, 'displayCart.htm')]")).click();
	  Thread.sleep(3000);
	  d.findElement(By.linkText("Checkout")).click();  
	  Thread.sleep(3000);
  }
  
  @Test(priority=2)
  public void testLogin() throws InterruptedException
  {

		 d.findElement(By.xpath("//a[contains(text(),'SignIn')]")).click();
		  Thread.sleep(2000);
		  d.findElement(By.name("userName")).sendKeys("kavyapk");
		  Thread.sleep(2000);
		 d.findElement(By.name("password")).sendKeys("123456");
		  d.findElement(By.name("Login")).click();
		  Thread.sleep(2000);
  }


  
  @Test(priority=4)
  
	  public void testPayment() throws InterruptedException
	  {
		  d.findElement(By.xpath("//input[@value='Proceed to Pay']")).click();
		  d.findElement(By.xpath("//div[@id='swit']/div[10]/div/label/i")).click();
		  d.findElement(By.id("btn")).click();
		  d.findElement(By.name("username")).sendKeys("kavyapk");
		  d.findElement(By.name("password")).sendKeys("123456");
		  Thread.sleep(3000);
		  d.findElement(By.xpath("//input[@value='LOGIN']")).click();
  }
  
  
  @Test(priority=1)
 
	  public void testRegistration() throws InterruptedException {

		  d.findElement(By.linkText("SignUp")).click();
		  Thread.sleep(3000);
		  Actions ac=new Actions(d);
		  WebElement u=d.findElement(By.name("userName"));
		  u.sendKeys("joy2");
		  ac.sendKeys(Keys.ENTER).perform();
		  Thread.sleep(3000);
		  String msg=d.findElement(By.cssSelector("#err")).getText();
		  if((msg.equals("Available")))
		  {
		  WebElement er=d.findElement(By.xpath("//span[contains(.,'User Name must be between 6-12 characters')]"));
		  if(er.isDisplayed())
		  {
		  Thread.sleep(3000);
		  d.findElement(By.name("userName")).clear();
		  Thread.sleep(3000);
		  d.findElement(By.name("userName")).sendKeys("kavyapk");
		  d.findElement(By.name("firstName")).sendKeys("kavyaa");
		  d.findElement(By.name("lastName")).sendKeys("ravichandran");
		  d.findElement(By.name("password")).sendKeys("123456");
		  d.findElement(By.name("confirmPassword")).sendKeys("123456");
		  d.findElement(By.xpath("(//input[@id='gender'])[1]")).click();
		  d.findElement(By.name("emailAddress")).sendKeys("K@gmail.com");
		  d.findElement(By.name("mobileNumber")).sendKeys("9897654345");
		  d.findElement(By.name("dob")).sendKeys("11/16/1997");
		  d.findElement(By.name("address")).sendKeys("bagalur road,hosur");
		  WebElement ques=d.findElement(By.name("securityQuestion"));
		  ac.sendKeys(ques,Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		  d.findElement(By.name("answer")).sendKeys("bruno");
		  d.findElement(By.name("Submit")).click();
		  d.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
		  }
		  else
		  {
		  d.findElement(By.name("userName")).clear();
		  Thread.sleep(3000);
		  d.findElement(By.name("userName")).sendKeys("kavyapk");
		  d.findElement(By.name("firstName")).sendKeys("kavyaa");
		  d.findElement(By.name("lastName")).sendKeys("ravichandran");
		  d.findElement(By.name("password")).sendKeys("123456");
		  d.findElement(By.name("confirmPassword")).sendKeys("123456");
		  d.findElement(By.name("emailAddress")).sendKeys("Karthi@gmail.com");
		  d.findElement(By.name("mobileNumber")).sendKeys("9876543210");
		  d.findElement(By.name("address")).sendKeys("Tiruchengode road,sublane 2");
		  WebElement ques=d.findElement(By.name("securityQuestion"));
		  ac.sendKeys(ques,Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		  d.findElement(By.name("answer")).sendKeys("bruno");
		  d.findElement(By.name("Submit")).click();
		  d.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
		  }
		  }
		  }
}
	  

