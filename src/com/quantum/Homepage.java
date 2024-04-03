package com.quantum;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Homepage {
		 WebDriver driver = null;
			@BeforeSuite
			 @Test (priority= 1)
			  //TEST CASE NO 1
			  		public void setUp() {
				  System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAURABH\\Desktop\\chromedriver-win64\\chromedriver.exe");
	  			  driver=new ChromeDriver();  
			  			  driver.get("https://www.stringevolve.in/");
			  			  driver.manage().window().maximize();
			  			 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);	  			
			  }
			@AfterSuite
			public void teardown() {
				  driver.close();
			}
			 @Test (priority= 2)
			  //TEST CASE NO 39 Verify Homepage Loads Successfully 
			  public void VerifyHomepageLoadsSuccessfully() throws InterruptedException  {
					WebElement loginBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/nav/div/div/div/button[3]"));
					Thread.sleep(3000);
					loginBtn.click();
					Thread.sleep(3000);
					
					WebElement emaildField=driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div[2]/div/div/div/div/form/div[1]/input"));
					WebElement passwordField=driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div[2]/div/div/div/div/form/div[2]/div/input"));
					WebElement submitBtn=driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div[2]/div/div/div/div/form/div[4]/div/button"));
					
					//Enter Login Details
					emaildField.sendKeys("saurabhkumbhar187@gmail.com");
					passwordField.sendKeys("Saurabh@7");
					submitBtn.click();
					
					WebElement homepage= driver.findElement(By.xpath("//*[@id=\"root\"]/nav/div/span/img"));
					if (homepage.isDisplayed()){
						System.out.println("Test Case Passed : Homepage is displayed successfully");
					}else {
							System.out.println("Test Case Failed : Homepage is not displayed ");

						}
					
					//Logout
					WebElement Myprofile=driver.findElement(By.xpath("//*[@id=\"nav-dropdown-dark-example\"]"));
					Myprofile.click();
					Thread.sleep(3000);
					WebElement MyprofileBtn=driver.findElement(By.xpath("//*[@id=\"root\"]/nav/div/div/div[2]/div/a[3]"));
					MyprofileBtn.click();
					WebElement LogoutBtn=driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div/div/div[1]/div[4]/div/button"));
					Thread.sleep(3000);
					LogoutBtn.click();
					Thread.sleep(3000);
			         
			 }
			 @Test (priority= 3)
			  //TEST CASE NO 40  Check for Page Title
			  public void  CheckforPageTitle() throws InterruptedException  {
					WebElement loginBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/nav/div/div/div/button[3]"));
					Thread.sleep(3000);
					loginBtn.click();
					Thread.sleep(3000);
					
					WebElement emaildField=driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div[2]/div/div/div/div/form/div[1]/input"));
					WebElement passwordField=driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div[2]/div/div/div/div/form/div[2]/div/input"));
					WebElement submitBtn=driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div[2]/div/div/div/div/form/div[4]/div/button"));
					
					//Enter Login Details
					emaildField.sendKeys("saurabhkumbhar187@gmail.com");
					passwordField.sendKeys("Saurabh@7");
					submitBtn.click();
					
					WebElement homepage= driver.findElement(By.xpath("//*[@id=\"root\"]/nav/div/span/img"));
					if (homepage.isDisplayed()){
						System.out.println("Test Case Passed : Title is displayed successfully");
					}else {
							System.out.println("Test Case Failed : Title is not displayed ");

						}
					
					//Logout
					WebElement Myprofile=driver.findElement(By.xpath("//*[@id=\"nav-dropdown-dark-example\"]"));
					Myprofile.click();
					Thread.sleep(3000);
					WebElement MyprofileBtn=driver.findElement(By.xpath("//*[@id=\"root\"]/nav/div/div/div[2]/div/a[3]"));
					MyprofileBtn.click();
					WebElement LogoutBtn=driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div/div/div[1]/div[4]/div/button"));
					Thread.sleep(3000);
					LogoutBtn.click();
					Thread.sleep(3000);
			         
			 }
			 @Test (priority= 4)
			  //TEST CASE NO 41  Verify Logo Presence
			  public void  VerifyLogoPresence() throws InterruptedException  {
					WebElement loginBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/nav/div/div/div/button[3]"));
					Thread.sleep(3000);
					loginBtn.click();
					Thread.sleep(3000);
					
					WebElement emaildField=driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div[2]/div/div/div/div/form/div[1]/input"));
					WebElement passwordField=driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div[2]/div/div/div/div/form/div[2]/div/input"));
					WebElement submitBtn=driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div[2]/div/div/div/div/form/div[4]/div/button"));
					
					//Enter Login Details
					emaildField.sendKeys("saurabhkumbhar187@gmail.com");
					passwordField.sendKeys("Saurabh@7");
					submitBtn.click();
					
					WebElement homepage= driver.findElement(By.xpath("//*[@id=\"root\"]/nav/div/span/img"));
					if (homepage.isDisplayed()){
						System.out.println("Test Case Passed : Logo is displayed successfully");
					}else {
							System.out.println("Test Case Failed : Logo is not displayed ");

						}
					
					//Logout
					WebElement Myprofile=driver.findElement(By.xpath("//*[@id=\"nav-dropdown-dark-example\"]"));
					Myprofile.click();
					Thread.sleep(3000);
					WebElement MyprofileBtn=driver.findElement(By.xpath("//*[@id=\"root\"]/nav/div/div/div[2]/div/a[3]"));
					MyprofileBtn.click();
					WebElement LogoutBtn=driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div/div/div[1]/div[4]/div/button"));
					Thread.sleep(3000);
					LogoutBtn.click();
					Thread.sleep(3000);
			         
			 }
			 @Test (priority= 5)
			  //TEST CASE NO 42  Test Header Navigation Links
			  public void  TestHeaderNavigationLinks() throws InterruptedException  {
					WebElement loginBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/nav/div/div/div/button[3]"));
					Thread.sleep(3000);
					loginBtn.click();
					Thread.sleep(3000);
					
					WebElement emaildField=driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div[2]/div/div/div/div/form/div[1]/input"));
					WebElement passwordField=driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div[2]/div/div/div/div/form/div[2]/div/input"));
					WebElement submitBtn=driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div[2]/div/div/div/div/form/div[4]/div/button"));
					
					//Enter Login Details
					emaildField.sendKeys("saurabhkumbhar187@gmail.com");
					passwordField.sendKeys("Saurabh@7");
					submitBtn.click();
					
					Thread.sleep(3000);
					driver.findElement(By.xpath("//*[@id=\"root\"]/nav/div/div/div[1]/a[1]")).click();
					Thread.sleep(3000);
					driver.findElement(By.xpath("//*[@id=\"root\"]/nav/div/div/div[1]/a[2]")).click();
					Thread.sleep(3000);
					driver.findElement(By.xpath("//*[@id=\"root\"]/nav/div/div/div[1]/a[3]")).click();
					Thread.sleep(3000);
					driver.findElement(By.xpath("//*[@id=\"root\"]/nav/div/div/div[1]/a[4]")).click();
					Thread.sleep(3000);
					driver.findElement(By.xpath("//*[@id=\"root\"]/nav/div/div/div[1]/a[5]")).click();
					Thread.sleep(3000);
					driver.findElement(By.xpath("//*[@id=\"root\"]/nav/div/div/div[1]/a[6]")).click();
					Thread.sleep(3000);
					driver.findElement(By.xpath("//*[@id=\"root\"]/nav/div/div/div[1]/a[7]")).click();
					Thread.sleep(3000);
				
					
					//Logout
					WebElement Myprofile=driver.findElement(By.xpath("//*[@id=\"nav-dropdown-dark-example\"]"));
					Myprofile.click();
					Thread.sleep(3000);
					WebElement MyprofileBtn=driver.findElement(By.xpath("//*[@id=\"root\"]/nav/div/div/div[2]/div/a[3]"));
					MyprofileBtn.click();
					WebElement LogoutBtn=driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div/div/div[1]/div[4]/div/button"));
					Thread.sleep(3000);
					LogoutBtn.click();
					Thread.sleep(3000);
			         
			 }
			 @Test (priority= 6)
			  //TEST CASE NO 43  Test Footer Navigation Links
			  public void  TestFooterNavigationLinks() throws InterruptedException  {
					WebElement loginBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/nav/div/div/div/button[3]"));
					Thread.sleep(3000);
					loginBtn.click();
					Thread.sleep(3000);
					
					WebElement emaildField=driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div[2]/div/div/div/div/form/div[1]/input"));
					WebElement passwordField=driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div[2]/div/div/div/div/form/div[2]/div/input"));
					WebElement submitBtn=driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div[2]/div/div/div/div/form/div[4]/div/button"));
					
					//Enter Login Details
					emaildField.sendKeys("saurabhkumbhar187@gmail.com");
					passwordField.sendKeys("Saurabh@7");
					submitBtn.click();
					
					WebElement MaxLimit= driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div[2]/div/div/div/div/form/div[4]/div/button"));
					Thread.sleep(3000);
					if (MaxLimit.isDisplayed()) {
						driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div[2]/div/div/div/div/form/div[4]/div/button")).click();
					} else {
						submitBtn.click();
					}
					
					Thread.sleep(3000);
					// Create an instance of JavascriptExecutor
			        JavascriptExecutor js = (JavascriptExecutor) driver;

			        // Scroll down by 500 pixels
			        js.executeScript("window.scrollBy(0,3000)");
			        //Open Donate Page
			    	Thread.sleep(3000);
					driver.findElement(By.xpath("//*[@id=\"root\"]/footer/div/div[1]/div[1]/button")).click();
					Thread.sleep(3000);
					// Create an instance of JavascriptExecutor
			        JavascriptExecutor jss = (JavascriptExecutor) driver;

			        // Scroll down by 500 pixels
			        jss.executeScript("window.scrollBy(0,5000)");
			      	Thread.sleep(3000);
			        //Open About Us page
					driver.findElement(By.xpath("//*[@id=\"root\"]/footer/div/div[1]/div[2]/a[1]")).click();
					Thread.sleep(3000);
					
					// Create an instance of JavascriptExecutor
			        JavascriptExecutor jd = (JavascriptExecutor) driver;

			        // Scroll down by 500 pixels
			        jd.executeScript("window.scrollBy(0,5000)");
			      	Thread.sleep(3000);
					
					
			        //Open Legal page
					driver.findElement(By.xpath("//*[@id=\"root\"]/footer/div/div[1]/div[2]/a[2]")).click();
					Thread.sleep(3000);
					
					
					// Create an instance of JavascriptExecutor
			        JavascriptExecutor jr = (JavascriptExecutor) driver;

			        // Scroll down by 500 pixels
			        jr.executeScript("window.scrollBy(0,5000)");
			      	Thread.sleep(3000);
					
					
					//Open Pricing Policy
					
					driver.findElement(By.xpath("//*[@id=\"root\"]/footer/div/div[1]/div[2]/a[3]")).click();
					Thread.sleep(3000);
					
					// Create an instance of JavascriptExecutor
			        JavascriptExecutor jg = (JavascriptExecutor) driver;

			        // Scroll down by 500 pixels
			        jg.executeScript("window.scrollBy(0,5000)");
			      	Thread.sleep(3000);
					
					
					
					
					
					//Open FAQ Page
					
					driver.findElement(By.xpath("//*[@id=\"root\"]/footer/div/div[1]/div[4]/a[1]")).click();
					Thread.sleep(3000);
					
					// Create an instance of JavascriptExecutor
			        JavascriptExecutor jq = (JavascriptExecutor) driver;

			        // Scroll down by 500 pixels
			        jq.executeScript("window.scrollBy(0,5000)");
			      	Thread.sleep(3000);
					
					// Open Contact Us
					driver.findElement(By.xpath("//*[@id=\"root\"]/footer/div/div[1]/div[4]/a[2]")).click();
					Thread.sleep(3000);
					
					// Create an instance of JavascriptExecutor
			        JavascriptExecutor jj = (JavascriptExecutor) driver;

			        // Scroll down by 500 pixels
			        jj.executeScript("window.scrollBy(0,5000)");
			      	Thread.sleep(3000);
					

			    	// Create an instance of JavascriptExecutor
			        JavascriptExecutor jf = (JavascriptExecutor) driver;

			        // Scroll down by 500 pixels
			        jf.executeScript("window.scrollBy(0,-5000)");
			      	Thread.sleep(3000);
					
					//Logout
					WebElement Myprofile=driver.findElement(By.xpath("//*[@id=\"nav-dropdown-dark-example\"]"));
					Myprofile.click();
					Thread.sleep(3000);
					WebElement MyprofileBtn=driver.findElement(By.xpath("//*[@id=\"root\"]/nav/div/div/div[2]/div/a[3]"));
					MyprofileBtn.click();
					WebElement LogoutBtn=driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div/div/div[1]/div[4]/div/button"));
					Thread.sleep(3000);
					LogoutBtn.click();
					Thread.sleep(3000);
			         
			 }
			 @Test (priority= 7)
			  //TEST CASE NO 44  Verify Search Functionality
			  public void  VerifySearchFunctionality() throws InterruptedException  {
					WebElement loginBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/nav/div/div/div/button[3]"));
					Thread.sleep(3000);
					loginBtn.click();
					Thread.sleep(3000);
					
					WebElement emaildField=driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div[2]/div/div/div/div/form/div[1]/input"));
					WebElement passwordField=driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div[2]/div/div/div/div/form/div[2]/div/input"));
					WebElement submitBtn=driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div[2]/div/div/div/div/form/div[4]/div/button"));
					
					//Enter Login Details
					emaildField.sendKeys("saurabhkumbhar187@gmail.com");
					passwordField.sendKeys("Saurabh@7");
					submitBtn.click();
					
					WebElement MaxLimit= driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div[2]/div/div/div/div/form/div[4]/div/button"));
					Thread.sleep(3000);
					if (MaxLimit.isDisplayed()) {
						driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div[2]/div/div/div/div/form/div[4]/div/button")).click();
					} else {
						submitBtn.click();
					}
					Thread.sleep(3000);
					WebElement Search = driver.findElement(By.xpath("//*[@id=\"root\"]/nav/div/div/form/div/input"));
					Search.sendKeys("Modi");
					Search.sendKeys(Keys.ENTER);
					
					Thread.sleep(3000);
					
					
					

			 }	
			 @Test (priority= 8)
			  //TEST CASE NO 45  Check for Social Media Links
			  public void  CheckforSocialMediaLinks() throws InterruptedException  {
					WebElement loginBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/nav/div/div/div/button[3]"));
					Thread.sleep(3000);
					loginBtn.click();
					Thread.sleep(3000);
					
					WebElement emaildField=driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div[2]/div/div/div/div/form/div[1]/input"));
					WebElement passwordField=driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div[2]/div/div/div/div/form/div[2]/div/input"));
					WebElement submitBtn=driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div[2]/div/div/div/div/form/div[4]/div/button"));
					
					//Enter Login Details
					emaildField.sendKeys("saurabhkumbhar187@gmail.com");
					passwordField.sendKeys("Saurabh@7");
					submitBtn.click();
					
					WebElement MaxLimit= driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div[2]/div/div/div/div/form/div[4]/div/button"));
					Thread.sleep(3000);
					if (MaxLimit.isDisplayed()) {
						driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div[2]/div/div/div/div/form/div[4]/div/button")).click();
					} else {
						submitBtn.click();
					}
					
				  	Thread.sleep(3000);
					// Create an instance of JavascriptExecutor
			        JavascriptExecutor jj = (JavascriptExecutor) driver;

			        // Scroll down by 500 pixels
			        jj.executeScript("window.scrollBy(0,5000)");
			      	Thread.sleep(3000);
			      	
			      	driver.findElement(By.xpath("//*[@id=\"root\"]/footer/div/div[1]/div[5]/div[1]/a[1]")).click();
					
			 }
			 @Test (priority= 9)
			  //TEST CASE NO 47  Check for Contact Information
			  public void  CheckforContactInformation() throws InterruptedException  {
					WebElement loginBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/nav/div/div/div/button[3]"));
					Thread.sleep(3000);
					loginBtn.click();
					Thread.sleep(3000);
					
					WebElement emaildField=driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div[2]/div/div/div/div/form/div[1]/input"));
					WebElement passwordField=driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div[2]/div/div/div/div/form/div[2]/div/input"));
					WebElement submitBtn=driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div[2]/div/div/div/div/form/div[4]/div/button"));
					
					//Enter Login Details
					emaildField.sendKeys("saurabhkumbhar187@gmail.com");
					passwordField.sendKeys("Saurabh@7");
					submitBtn.click();
					
		
					Thread.sleep(3000);
					WebElement MaxLimit= driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div[2]/div/div/div/div/form/div[4]/div/button"));
					Thread.sleep(3000);
					if (MaxLimit.isDisplayed()) {
						driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div[2]/div/div/div/div/form/div[4]/div/button")).click();
					} else {
						submitBtn.click();
					}
				  	Thread.sleep(3000);
					// Create an instance of JavascriptExecutor
			        JavascriptExecutor jj = (JavascriptExecutor) driver;

			        // Scroll down by 500 pixels
			        jj.executeScript("window.scrollBy(0,5000)");
			      	Thread.sleep(3000);
			      	
			      	driver.findElement(By.xpath("//*[@id=\"root\"]/footer/div/div[1]/div[4]/a[2]")).click();
			      	Thread.sleep(3000);
			      	
			      	WebElement ContactUsPage=driver.findElement(By.xpath("//*[@id=\"root\"]/section/div[1]/h2"));
			    	Thread.sleep(3000);
			      	if(ContactUsPage.isDisplayed()) {
			      		System.out.println("Test Passed: Contact Us Page is displayed successfully");
			      	}else {
			      		System.out.println("Test Failed : Unable to display contact us image");
			      	}
			    	Thread.sleep(3000);
			 }
}
					
					


