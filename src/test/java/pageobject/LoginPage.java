package pageobject;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import webdrivermanager.DriverFactory;


public class LoginPage {

	public WebDriver driver ; 
	

	By GetStartedbutton = By.xpath("//a[@href='/home']");
	//button[@class='btn']"//
	 By SignIn = By.xpath("//a[@href='/login']");
	 By Register_onlogin = By.xpath("//a[@href='/register']");
	By Username_field = By.xpath("//input[@name='username']");
    By Password_field = By.xpath("//input[@name='password']");
	By Login_submit = By.xpath("//input[@value='Login']");
	By errorMessage=By.xpath("//div[@class='alert alert-primary']");
	By Youareloggedin = By.xpath("//div[@class='alert alert-primary']");
	//By Register_onlogin = By.xpath("//a[@href='/register']");
	
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	 public void clickGetStartedbutton() {
			driver.findElement(GetStartedbutton).click();
            }
	 
	 public String gethomepagetitle() {
		 driver.findElement(GetStartedbutton);
		 String gethomepagetitle = driver.getTitle();
		 return gethomepagetitle;
	 }
	 
	 public void SignInBtn() {
			driver.findElement(SignIn).click();
		}
	 
	 public void navigatetoLoginpage() {
	 //try {
		driver.findElement(SignIn);
	//} catch (Exception e) {
		//System.out.println("Error occurred: " + e.getMessage());
		//e.printStackTrace();
	}
			
		
		public String getLoginpageTitle() {
			driver.findElement(Login_submit);
			String getLoginpageTitle = driver.getTitle();
			return getLoginpageTitle;
		}
		
	
        public void setUsername(String username) {
		     
				driver.findElement(Username_field).sendKeys(username);
		    }

		    public void setPassword(String password) {
		        driver.findElement(getPassword_field()).sendKeys(password);
		    }
		    
		    public String getErrorMessage() { //error message display
		        return driver.findElement(errorMessage).getText();
		    }
		    
		    public boolean getalertforemptyusernamefield() {
		    	WebElement usermsg = driver.findElement(Username_field);
				boolean isrequired = usermsg.getDomAttribute("required") != null;
				return isrequired;
		    }
		    public boolean getalertforemptypasswordfield() {
		    	WebElement usermsg = driver.findElement(Password_field);
				boolean isrequired = usermsg.getDomAttribute("required") != null;
				return isrequired;
		    }

		    public void clickLoginButton() { //complete login page action and return homepage
		        driver.findElement(Login_submit).click();
		    }

		    
		    
		    public void Registeronlogin() {
		    	driver.findElement(Register_onlogin).click();
		    }
		    public String getregisterpagetitle() {
		   	 
		    	driver.findElement(Register_onlogin).click();
		    	String registerpagetitle = driver.getTitle();
		    	return registerpagetitle;
		    	 
		     }
		    public void navigatetoRegisterpage() {
		    	driver.findElement(SignIn);
		    }
		    
		    public boolean isOnLoginPage() {
		       return driver.findElement(Login_submit).isDisplayed();
			}
		 
		    public Homepage login(String username, String password) {
		        setUsername(username);
		        setPassword(password);
		        clickLoginButton();
		     

		        return new Homepage(driver);  // Assuming successful login navigates to HomePage
		    }

		    public void loginfunction(String username, String password) {
		    	
		    	driver.findElement(Username_field).sendKeys(username);
		    	driver.findElement(Password_field).sendKeys(password);
		    	
		    }
			public By getPassword_field() {
				return Password_field;
			}

			public void setPassword_field(By password_field) {
				Password_field = password_field;
			}

			public  String getYouareloggedin() {
			return	driver.findElement(Youareloggedin).getText();
	
			}
	
				public String handleAlert() {
					
				Alert alert = driver.switchTo().alert();
				String alertMessage = alert.getText();
				alert.accept();
				return alertMessage;
				}
				
				public boolean isAlertPresent() {
					
			        try {
			            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Wait up to 2 seconds
			            wait.until(ExpectedConditions.alertIsPresent());
			            return true;
			        } catch (Exception e) {
			            return false;
			        }
			    }
			}

			
			

		
		   
	


