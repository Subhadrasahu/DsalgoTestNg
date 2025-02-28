package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Stackpage {
	
	private WebDriver driver;
	
	public Stackpage(WebDriver Driver) {
		
		this.driver = Driver;
	} 
	
	By stackGetStarted = By.xpath("//a[@href='stack']");
	By OperationsInStack = By.xpath("//a[@href='operations-in-stack' and text() = 'Operations in Stack']");
	By implementation = By.xpath("//a[@href='implementation' and text() = 'Implementation']");
	By applications = By.xpath("//a[text() = 'Applications']");
	
	public void clickGetStarted() {
		
		driver.findElement(stackGetStarted).click();
	}
	
    public String getStacktitle() {
		return driver.getTitle();
		
    }
    
    public void clickOperationsInStack() {
    	driver.findElement(OperationsInStack).click();
    }
    
    public void clickImplementation() {
    	
    	driver.findElement(implementation).click();
    }
    
    public void clickApplications() {
    	driver.findElement(applications).click();
    }
    
}
