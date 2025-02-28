package pageobject;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DataStructurespage {

    private WebDriver driver;

    public DataStructurespage(WebDriver driver) {
        this.driver = driver;
    }
    

    private By dsGetStarted = By.xpath("//a[@href ='data-structures-introduction']");
    private By timeComplexity = By.xpath("//a[normalize-space()='Time Complexity']");
    private By tryHereButton = By.xpath("//a[normalize-space()='Try here>>>']");
    private By runButton = By.xpath("//button[text()='Run']");
    private By tryEditor = By.className("CodeMirror");
    private By practiceButton = By.xpath("//a[text()='Practice Questions']");
    private By output = By.id("output");

    // Methods

    // Home Page
    public String getHomePageTitle() {
        return driver.getTitle();
    }

    public void clickDSGetStarted() {
        WebElement dsIntroduction = driver.findElement(dsGetStarted);
        dsIntroduction.click();
    }

    // Data Structures - Introduction Page
    public String getDSIntroPageTitle() {
        return driver.getTitle();
    }

    public void clickTimeComplexity() 
    {
    	
        driver.findElement(timeComplexity).click();
    }

    public String getTimeComplexityTitle() {
    	
        return driver.getTitle();
    }

    // Try Here Page
    public void clickTryHere() {
        scrollToElement(tryHereButton);
        driver.findElement(tryHereButton).click();
    }

    public String getTryHerePageTitle() {
        return driver.getTitle();
    }

    public void enterPythonCode(String pythonCode) {
        //driver.findElement(tryEditor).sendKeys(pythonCode);
    	 
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement codeMirror = wait.until(ExpectedConditions.visibilityOfElementLocated(tryEditor));

        // Simulate typing in the editor
        try {
        	
        Actions actions = new Actions(driver);
        actions.moveToElement(codeMirror).click().sendKeys(pythonCode).perform();
        boolean alertHandled = false;
		if (!alertHandled) {
			  Alert alert = driver.switchTo().alert();         
            alert.accept();
           System.out.println(alert.getText());
        }
        } catch (NoAlertPresentException e) {
            System.out.println("No alert was triggered.");
        }

    }

   	public void clickRun() {
        driver.findElement(runButton).click();
    }

    public String getResult() {
    	
        return driver.findElement(output).getText();
        
    }
    
    // Practice Questions Page
    public void clickPracticeQuestions() {
        
        driver.findElement(practiceButton).click();
    }

    public String getPracticeQuestionsPageTitle() {
        return driver.getTitle();
    }

    // Utility Methods
    private void scrollToElement(By locator) {
        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(locator);
        actions.moveToElement(element).sendKeys(Keys.PAGE_DOWN).build().perform();
    }

    public void pageUp() {
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_UP).build().perform();
    }

    public void navigateBack() {
        driver.navigate().back();
    }
}
