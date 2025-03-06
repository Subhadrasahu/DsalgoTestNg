package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;




public class Commonpage {

	private WebDriver driver;
	//String[][] userDetails;
	public Commonpage(WebDriver driver) {
		this.driver = driver;
	}

	private By landingGetStartedbtn = By.xpath("//button[@class=\"btn\"]");
	private By signIn = By.xpath("//a[@href=\"/login\"]");

	private By username = By.xpath("//input[@name=\"username\"]");
	private By password = By.xpath("//input[@name=\"password\"]");
	private By submitForLogin = By.xpath("//input[@type=\"submit\"]");
	
	
	private	By tryHere = By.linkText("Try here>>>");
	private	By texteditor = By.xpath("//div[contains(@class,'CodeMirror')]/div/textarea");
	private By runbutton = By.xpath("//button[text()='Run']");
	private By output = By.id("output");

	public void landingGetStartedbtnClick() {
		driver.findElement(landingGetStartedbtn).click();
	}

	public void SignInBtn() {
		driver.findElement(signIn).click();
	}

	  public void enterCredentials(String usrname, String passwrd) {
	        driver.findElement(username).sendKeys(usrname);
	        driver.findElement(password).sendKeys(passwrd);
	    }
	  
	  public void submitForLoginClick() {
			driver.findElement(submitForLogin).click();
		}

	  
	  public void clickTryHere() {
			driver.findElement(tryHere).click();
		}
		public void textEditorOperations () {
			driver.findElement(texteditor).sendKeys("print(\"Hello World\")");
		}
		
		   public String getOutput() {
				return driver.findElement(output).getText();
			}
		
		public void ValidInvalidtextEditorOperations (String pythonCode) {
			driver.findElement(texteditor).sendKeys( pythonCode);
		}
		
		public void clickRunButton () {
			driver.findElement(runbutton).click();
		}
		
		public void textEditorInvalidOperations () {
			driver.findElement(texteditor).sendKeys("Hello");
		}
		
		public void clearTextEditor() {
			WebElement element =driver.findElement(texteditor);
			Actions actions = new Actions(driver);
			actions.moveToElement(element).click().keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.DELETE).perform();
		}
		
		
}