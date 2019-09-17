package com.model;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
//@Listeners(com.model.SuiteListenerTest.class)
//@Listeners(com.model.TestCaseListener.class)
public class MercuryTsTest 
{
	public WebDriver driver;
	
  @Test(priority=1,description="Verify that valid user1 "
  		+ "able to login into Mercury Tours Application by using valid username and password")
  public void loginWithValidds1()
  {
	  system.out.println("added in github code");
	  System.out.println("update in github");
	  System.out.println("loginwithValidds1 method under Test");
	  driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("aarti3");       //aarti4 
	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("p@ss3");   //p@ss4
	  driver.findElement(By.xpath("//input[@name='login']")).click();
	  System.out.println("User1 has login into Mercury tours application successfully");
	  boolean flag=driver.findElement(By.xpath("//img[@src='/images/masts/mast_flightfinder.gif']")).isDisplayed();
	  System.out.println("Flight Finder image is displayed, user1 has login successsfully"+flag);
	  driver.findElement(By.linkText("SIGN-OFF")).click();
	}
  
  @Test(priority=2,description="Verify that valid user2 able to login"
	  		+ " into Mercury Tours Application by using valid username and password")
  public void loginWithValidds2()
  {
	  System.out.println("loginwithValidds2 method under Test");
	  driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("aarti4");       //aarti4 
	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("p@ss4");   //p@ss4
	  driver.findElement(By.xpath("//input[@name='login']")).click();
	  System.out.println("User2 has login into Mercury tours application successfully");
	  boolean flag1=driver.findElement(By.xpath("//img[@src='/images/masts/mast_flightfinder.gif']")).isDisplayed();
	  System.out.println("Flight Finder image is displayed, user1 has login successsfully"+flag1);
	  driver.findElement(By.linkText("SIGN-OFF")).click();  
  }
  
  @Test(priority=3,description="Verify that valid user2 able to login"
	  		+ " into Mercury Tours Application by using valid username and password")
public void loginWithValidds3()
{
	  System.out.println("loginwithValidds3 method under Test");
	  driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("aarti5");       //aarti4 
	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("p@ss5");   //p@ss4
	  driver.findElement(By.xpath("//input[@name='login']")).click();
	  System.out.println("User3 has login into Mercury tours application successfully");
	  boolean flag3=driver.findElement(By.xpath("//img[@src='/images/masts/mast_flightfinder.gif']")).isDisplayed();
	  System.out.println("Flight Finder image is displayed, user1 has login successsfully"+flag3);
	  driver.findElement(By.linkText("SIGN-OFF")).click();  
 }
  
  @Test(priority=4,description="Verify that valid user4 able "
  		+ "to login into Mercury Tours Application by using invalid username and password")
  public void loginWithInvalidds()
  {
	  System.out.println("loginwithValidds4 method under Test");
	  driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("aartip");       //aarti4 
	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("p@ss9");   //p@ss4
	  driver.findElement(By.xpath("//input[@name='login']")).click();
	  System.out.println("User4 has login into Mercury tours application successfully");
	  boolean flag4=driver.findElement(By.xpath("//img[@src='/images/masts/mast_flightfinder.gif']")).isDisplayed();
	  System.out.println("Flight Finder image is displayed, user1 has login successsfully"+flag4);
	  driver.findElement(By.linkText("SIGN-OFF")).click();  
  }
  @BeforeMethod
  public void getAllCookies()
  {
	  System.out.println("in before method under getAllCookies");
	  Set<Cookie> cookies=driver.manage().getCookies();
	  for(Cookie cookie:cookies)
	  {
		  System.out.println(cookie.getName());
	  }

  }

  @AfterMethod
  public void CaptureScreenshot() throws IOException
  {
	  File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyToDirectory(src,new File("F:\\ workspace\\TestngListener\\ListenrFailureScreenShot\\"));
  }

  @BeforeClass
  public void maximizeBrowser() 
  {
	  System.out.println("In maximizeBrowser method under BeforeClass");
	  driver.manage().window().maximize();
	  
  }

  @AfterClass
  public void deleteAllCookies()
  {
	  System.out.println("In deleteAllCookies method under AfterClass");
	  driver.manage().deleteAllCookies();
  }

 @BeforeTest
 public void enterApplicationURL() 
 {
	  System.out.println("enterApplicationURL method under BeforeTest");
	  driver.get("http://www.newtours.demoaut.com/mercurywelcome.php");
	  System.out.println("Application URL is entered successfully");
 }

  @AfterTest
  public void dbConnectionClosed()
  {
	  System.out.println("dbConnectionClosed method under AfterTest");
  }


  @BeforeSuite

  public void openBrowser()
  {
	  System.out.println("openBrowser method under BeforeSuite");
	  System.setProperty("webdriver.chrome.driver","F:\\seleniumSetup\\chromedriver_win32\\chromedriver.exe");
	  driver= new ChromeDriver();
	  System.out.println("Chrome browser is opened successfully");
  }

  @AfterSuite
  public void closeBrowser()
  {
	  System.out.println("In closeBrowser method under AfterSuite");
	  driver.close();
  }
}
/*************************
 
onfinish method under suiteListenerTest

===============================================
Suite
Total tests run: 4, Failures: 1, Skips: 0
===============================================

this is for testcaseListener

openBrowser method under BeforeSuite
Chrome browser is opened successfully

in onstart method under TestCaseListener 
enterApplicationURL method under BeforeTest
Application URL is entered successfully
In maximizeBrowser method under BeforeClass
in before method under getAllCookies
osCsid

in onteststart under TestCaseListener 
on test start name: loginWithValidds1
loginwithValidds1 method under Test
User1 has login into Mercury tours application successfully
Flight Finder image is displayed, user1 has login successsfullytrue
Ontestpass under testcaselistener
on test success loginWithValidds1

in before method under getAllCookies
osCsid
@test
in onteststart under TestCaseListener 
on test start name: loginWithValidds2
loginwithValidds2 method under Test
User2 has login into Mercury tours application successfully
Flight Finder image is displayed, user1 has login successsfullytrue
OntestSuccess under testcaselistener
on test success loginWithValidds2

in before method under getAllCookies
osCsid

case3
in onteststart under TestCaseListener 
on test start name: loginWithValidds3
loginwithValidds3 method under Test
User3 has login into Mercury tours application successfully
Flight Finder image is displayed, user1 has login successsfullytrue
OntestSuccess under testcaselistener
on test success loginWithValidds3

in before method under getAllCookies
osCsid
case4
in onteststart under TestCaseListener 
on test start name: loginWithInvalidds
loginwithValidds4 method under Test
User4 has login into Mercury tours application successfully

in ontestfailure under testcaselistner 
fail test name :loginWithInvalidds

In deleteAllCookies method under AfterClass
dbConnectionClosed method under AfterTest

onfinish under TestCaseListener

PASSED: loginWithValidds1
        Verify that valid user1 able to login into Mercury Tours Application
PASSED: loginWithValidds2
        Verify that valid user2 able to login into Mercury Tours Application by using valid username and password
PASSED: loginWithValidds3
fAILED: loginWithInvalidds
        Verify that valid user4 able to login into Mercury Tours Application 
---------------------------------------------------------------------------------------

using both listener

onStart method  under SuiteListenertest
openBrowser method under BeforeSuite
Chrome browser is opened successfully

in onstart method under TestCaseListener 
enterApplicationURL method under BeforeTest
Application URL is entered successfully

In maximizeBrowser method under BeforeClass
in before method under getAllCookies
osCsid
case1
in onteststart under TestCaseListener 
on test start name: loginWithValidds1
loginwithValidds1 method under Test
User1 has login into Mercury tours application successfully
Flight Finder image is displayed, user1 has login successsfullytrue
OntestSuccess under testcaselistener
on test success means PASS loginWithValidds1

in before method under getAllCookies
osCsid

in onteststart under TestCaseListener 
on test start name: loginWithInvalidds
case4
loginwithinValidds4 method under Test
User4 has login into Mercury tours application successfully
in ontestfailure under testcaselistner 

fail test name :loginWithInvalidds

In deleteAllCookies method under AfterClass
dbConnectionClosed method under AfterTest
onfinish under TestCaseListener

In closeBrowser method under AfterSuite
onfinish method under suiteListenerTest

===============================================
Suite
Total tests run: 4, Failures: 1, Skips: 0
**************************/
