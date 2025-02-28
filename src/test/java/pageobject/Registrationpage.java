package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Registrationpage {

	private WebDriver driver;
	private By home_getstarted = By.xpath("//button[@class='btn']");
	By Username_field = By.xpath("//input[@name='username']");
	By Password_field = By.xpath("//input[@name='password1']");
	By Confirm_password = By.xpath("//input[@name='password2']");
	By Register_registration = By.xpath("//input[@value='Register']");
	By Login_registration = By.xpath("//a[@href='/login']");
	private By errormsg_register = By.xpath("//div[contains(@class, 'alert') and @role='alert']");
	private By userId = By.xpath(" //*[@id=\"navbarCollapse\"]/div[2]/ul/a[2]");

	public Registrationpage(WebDriver Driver) {

		this.driver = Driver;
	}
	

	public String homepagetitle() {

		driver.findElement(home_getstarted).click();

		return driver.getTitle();

	}

	public void clickregisteremptyfields() {

		driver.findElement(Register_registration).click();
	}

	public boolean getalertmessage() {
		WebElement usermsg = driver.findElement(Username_field);
		boolean isrequired = usermsg.getDomAttribute("required") != null;
		return isrequired;
	}

	public void mismatchpassword() {
		driver.findElement(Password_field).sendKeys("test1234");
		driver.findElement(Confirm_password).sendKeys("test12345");
		driver.findElement(Register_registration).click();
	}

	public String mismatchpassworderror() {
	
		String errortext = driver.findElement(errormsg_register).getText();
		System.out.println(errortext);
		return errortext;

	}
	public void existinguser() {
		driver.findElement(Username_field).sendKeys("Numpysdet192");
		driver.findElement(Password_field).sendKeys("QAteam@192");
		driver.findElement(Confirm_password).sendKeys("QAteam@192");
		driver.findElement(Register_registration).click();
	}
	
	public String existingusererror() {
		
	 String errortext = driver.findElement(errormsg_register).getText();
	 return errortext ;	
	}
	
	public void clickSignInButton() {
		 
	     driver.findElement(Login_registration).click();
	 }
    
	public String getsignpagetitle() {
		
	  driver.findElement(Login_registration).click();
	  String title =  driver.getTitle();
	  return title;
	
		
	}
	
	public void numericdata() {
		driver.findElement(Username_field).sendKeys("Numpy");
		driver.findElement(Password_field).sendKeys("12345678");
		driver.findElement(Confirm_password).sendKeys("12345678");
		
	}
	
	public void passwordlength() {
		
		driver.findElement(Username_field).sendKeys("Numpy");
		driver.findElement(Password_field).sendKeys("test12");
		driver.findElement(Confirm_password).sendKeys("test12");
	}
	
	public void invalidusername(String username) {
		
		driver.findElement(Username_field).sendKeys(username);
		
	}
	public void validregister() {
		
		String username = "numpy" + System.currentTimeMillis();
		driver.findElement(Username_field).sendKeys(username);
		driver.findElement(Password_field).sendKeys("test@12345");
		driver.findElement(Confirm_password).sendKeys("test@12345");
		driver.findElement(Register_registration).click();
		
	}
	
	public String successregistrationmsg() {
		    	
		String successmg = driver.findElement(errormsg_register).getText();
		 
		    	return successmg ;
		
		
	}
	
	public String userid() {
		
		String userid = driver.findElement(userId).getText();
		return userid;
	}
		
	}

