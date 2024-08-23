package com.quantum;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Login {
	private WebDriver driver;
    private String baseUrl = "https://stringgeo.com/";
	
	 @BeforeClass
	  //TEST CASE NO 1
	  		public void setUp() {
			  System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAURABH\\Downloads\\chromedriver-win64 (3)\\chromedriver-win64\\chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.get(baseUrl);
	  			  driver.manage().window().maximize();
		  			 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	 }
		@AfterSuite
		public void teardown() {
			  driver.close();
		}
		 @Test (priority= 2)
		  //TEST CASE NO 21 
		  public void successfulLogin() throws InterruptedException  {
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
		 @Test (priority= 2)
		  //TEST CASE NO 22 
		  public void  EmptyEmailandPassword() throws InterruptedException  {
				WebElement loginBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/nav/div/div/div/button[3]"));
				Thread.sleep(3000);
				loginBtn.click();
				Thread.sleep(3000);
				
				WebElement emaildField=driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div[2]/div/div/div/div/form/div[1]/input"));
				WebElement passwordField=driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div[2]/div/div/div/div/form/div[2]/div/input"));
				WebElement submitBtn=driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div[2]/div/div/div/div/form/div[4]/div/button"));
				
				//Enter Empty Details
				emaildField.sendKeys("");
				passwordField.sendKeys("");
				submitBtn.click();
				
				Thread.sleep(3000);
				
 }

		 @Test (priority= 3)
		  //TEST CASE NO 23 
		  public void  InvalidEmail() throws InterruptedException  {
				WebElement loginBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/nav/div/div/div/button[3]"));
				Thread.sleep(3000);
				loginBtn.click();
				Thread.sleep(3000);
				WebElement emaildField=driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div[2]/div/div/div/div/form/div[1]/input"));
				WebElement passwordField=driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div[2]/div/div/div/div/form/div[2]/div/input"));
				WebElement submitBtn=driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div[2]/div/div/div/div/form/div[4]/div/button"));
				
				//Enter Invalid Email
				emaildField.sendKeys("saaurabh187.quantumitinnovation@gmail.com");
				passwordField.sendKeys("Saurabh@7");
				submitBtn.click();
	
				
				// Check if an error message is displayed
				WebElement errormessage = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]"));
				  if (errormessage.isDisplayed()) {
			            System.out.println("Login failed with invalid credentials. Test passed.");
			        } else {
			            System.out.println("Login did not fail with invalid credentials. Test failed.");
			        }
				
				
				Thread.sleep(3000);
				
}
		 @Test (priority= 4)
		  //TEST CASE NO 24 
		  public void   InvalidPassword() throws InterruptedException  {
				WebElement loginBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/nav/div/div/div/button[3]"));
				Thread.sleep(3000);
				loginBtn.click();
				Thread.sleep(3000);
				
				WebElement emaildField=driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div[2]/div/div/div/div/form/div[1]/input"));
				WebElement passwordField=driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div[2]/div/div/div/div/form/div[2]/div/input"));
				WebElement submitBtn=driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div[2]/div/div/div/div/form/div[4]/div/button"));
				
				//Enter Invalid Email
				emaildField.sendKeys("saurabh187.quantumitinnovation@gmail.com");
				passwordField.sendKeys("Saaurabh@7");
				submitBtn.click();
				
				Thread.sleep(3000);
				
}
		 @Test (priority= 5)
		  //TEST CASE NO 25 
		  public void ForgotPasswordLink() throws InterruptedException  {
				WebElement loginBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/nav/div/div/div/button[3]"));
				Thread.sleep(3000);
				loginBtn.click();
				Thread.sleep(3000);
				
				//Open Forgot Password Page
				WebElement forgotPass=driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div[2]/div/div/div/div/form/div[3]/a"));
				forgotPass.click();
				Thread.sleep(3000);

				
 }
		 @Test (priority= 6)
		  //TEST CASE NO 27 Valid Username, Password with Leading and Trailing Spaces
		  public void TrailingSpaces() throws InterruptedException  {
				WebElement loginBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/nav/div/div/div/button[3]"));
				Thread.sleep(3000);
				loginBtn.click();
				Thread.sleep(3000);
				
				WebElement emaildField=driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div[2]/div/div/div/div/form/div[1]/input"));
				WebElement passwordField=driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div[2]/div/div/div/div/form/div[2]/div/input"));
				WebElement submitBtn=driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div[2]/div/div/div/div/form/div[4]/div/button"));
				
				//Enter Login Details
				emaildField.sendKeys("saurabhkumbhar187@gmail.com ");
				passwordField.sendKeys("Saurabh@7");
				submitBtn.click();
				
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
		  //TEST CASE NO 28 Password Case Sensitivity
		  public void PasswordCaseSensitivity() throws InterruptedException  {
				WebElement loginBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/nav/div/div/div/button[3]"));
				Thread.sleep(3000);
				loginBtn.click();
				Thread.sleep(3000);
				
				WebElement emaildField=driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div[2]/div/div/div/div/form/div[1]/input"));
				WebElement passwordField=driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div[2]/div/div/div/div/form/div[2]/div/input"));
				WebElement submitBtn=driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div[2]/div/div/div/div/form/div[4]/div/button"));
				
				//Enter Login Details
				emaildField.sendKeys("saurabhkumbhar187@gmail.com ");
				passwordField.sendKeys("Saurabh@7 ");
				submitBtn.click();
				
			
}
		 @Test (priority= 8)
		  //TEST CASE NO 32 Social Media Sign-In
		  public void SocialMediaSignIn() throws InterruptedException  {
				WebElement loginBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/nav/div/div/div/button[3]"));
				Thread.sleep(3000);
				loginBtn.click();
				Thread.sleep(3000);
				
				WebElement GoogleBtn=driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div[2]/div/div/div/div/form/div[5]/div/button"));
				GoogleBtn.click();
				Thread.sleep(3000);
				
				Set<String> windows= driver.getWindowHandles();
				Iterator<String> it= windows.iterator();
				String p = it.next();
				String c = it.next();
				driver.switchTo().window(c);
				Thread.sleep(3000);
				
				
				
				driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("saurabhkumbhar187@gmail.com");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
				Thread.sleep(3000);

				
}
		 @Test (priority= 9)
		  //TEST CASE NO 21 
		  public void SuccessfulLogin() throws InterruptedException  {
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
		 
}


