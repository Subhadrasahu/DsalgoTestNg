package pageobject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Queuepage {


	private WebDriver driver ;

	 //locators
	
    By QueueGetStarted =By.xpath("//a[@href='queue']");
    By ImplementationofQueueinPython = By.xpath("//a[text()='Implementation of Queue in Python']");
    By Implementationusingcollectionsqueue = By.xpath("//a[text()='Implementation using collections.deque']");
    By Implementationusingarray = By.xpath("//a[text()='Implementation using array']");
    By QueueOperations = By.xpath("//a[text()='Queue Operations']");
    By TryHere = By.xpath("//a[text()='Try here>>>']");
    By TryEditor = By.xpath("//a[@href='/tryEditor'] and//div[@class='CodeMirror-scroll']");
    By Run = By.xpath("//button[text()='Run']");
    By PracticeQuestionsofQueue = By.xpath("//a[text()='Practice Questions']");
    //By PracticeQuestionsofQueue = By.xpath("//a[text()='Practice Questions']");

    public Queuepage(WebDriver driver) {
 		this.driver=driver;
 	}
    
    // Home Page
    public String getHomePageTitle() {
        return driver.getTitle();
    }
    
    public  void clickQueueGetStartedbutton() {
			driver.findElement(QueueGetStarted).click();
           }
    

    public String getQueuePageTitle() {
        return driver.getTitle();
    }
    
    public void clickImplementationofQueueinPython() {
        driver.findElement(ImplementationofQueueinPython).click();
		
    }
    public String getImplementationofQueueinPython() {
    	return driver.findElement(ImplementationofQueueinPython).getText();
    }
    
    public void clickImplementationusingcollectionsdeque() {
        driver.findElement(Implementationusingcollectionsqueue).click();
    }
    public String getImplementationusingcollectionsdeque() {
    	return driver.findElement(Implementationusingcollectionsqueue).getText();
    }
    
    
      public void clickImplementationusingarray() {
        driver.findElement(Implementationusingarray).click();
		
    }
    public String getImplementationusingarray() {
    	return driver.findElement(Implementationusingarray).getText();
    }
    
    public void clickQueueOperations() {
        driver.findElement(QueueOperations).click();
		
    }
    public String getQueueOperations() {
    	return driver.findElement(QueueOperations).getText();
    }

	public void clickPracticeQuestions() {
		driver.findElement(PracticeQuestionsofQueue).click();
		
	}

	public String getPracticeQuestionsPageTitle() {
	return driver.getTitle();
	}
}  
    
    
    
    
    
    
    
    
    
    
    

