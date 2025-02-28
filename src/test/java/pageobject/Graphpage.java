package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Graphpage {
	
	public WebDriver driver;
	
	// By home_getstarted = By.xpath("//button[@class='btn']");
	By Graphgetstarted = By.xpath("//a[@href='graph']");
	By Graph = By.xpath("//a[@href='graph']");
	By graph = By.xpath("//a//a[text()='Graph']");
	By tryhere = By.xpath("//a[text()='Try here>>>']");
	By tryeditor=By.className("'CodeMirror']");
	By run = By.xpath("//button[@text='Run']");
	By GraphRepresentations =By.xpath("//a[text()='Graph Representations']");
	//By TryHere = By.xpath("//a[text()='Try here>>>']");
	//By TryEditor=By.className("'CodeMirror']");
    By practicequestions=By.xpath("//a[text()='Practice Questions']");
	By Signout = By.xpath("//a[text()='Sign out']");
   
   public Graphpage(WebDriver driver) {
		this.driver=driver;
	}
   
   // Home Page//
   public String getHomePageTitle() {
       return driver.getTitle();
   }
   
   public  void clickGraphGetStartedbutton() {
			driver.findElement(Graphgetstarted).click();
          }
   
   public String getGraphPageTitle() {
       return driver.getTitle();
   }
   
   public void clickGraph() {
	   driver.findElement(Graph).click();
   }
   public String getGraphTitle() {
       return driver.getTitle();
   }

   
   public void clickGraphRepresentations() {
	   driver.findElement(GraphRepresentations).click();
   }
	   
	public String getGraphRepresentations()  {
		return driver.getTitle();
	   
   }
	public void clickPracticeQuestions() {
		driver.findElement(practicequestions).click();
	}

	public String getPracticeQuestionsPageTitle() {
		return driver.getTitle();
	}

	public void clickSignout() {
		driver.findElement(Signout).click();
		
	}
	}
   


