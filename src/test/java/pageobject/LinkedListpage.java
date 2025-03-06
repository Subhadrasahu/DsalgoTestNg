package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LinkedListpage {
	
	private WebDriver driver;
	
	//private By DSdropdown = By.xpath("//a[@data-toggle='dropdown' and text() = 'Data Structures']");
	//private By linkedlist= By.xpath("//a[@class= 'dropdown-item' and text() ='Linked List']");
	private By Linkedlistgetstarted = By.xpath("//a[@href='linked-list']");
	private By introduction = By.xpath("//a[@class= 'list-group-item' and text() ='Introduction']");
	private By CreatingLinkedLIst = By.xpath("//a[@class= 'list-group-item' and text() ='Creating Linked LIst']");
	private By TypesofLinkedList = By.xpath("//a[@class= 'list-group-item' and text() ='Types of Linked List']");
	private By ImplementLinkedList = By.xpath("//a[@class= 'list-group-item' and text() ='Implement Linked List in Python']");
	private By Traversal = By.xpath("//a[@class= 'list-group-item' and text() ='Traversal']");
	private By Insertion = By.xpath("//a[@class= 'list-group-item' and text() ='Insertion']");
	private By Deletion = By.xpath("//a[@class= 'list-group-item' and text() ='Deletion']");
	private By practicequestions=By.xpath("//a[text()='Practice Questions']");
	
	public LinkedListpage(WebDriver Driver) {
		
		this.driver = Driver;
	}
	
	public void clickLinkedListGetStarted() {
		driver.findElement(Linkedlistgetstarted).click();
		
	}
	public String getLinkedlisttitle() {
		return driver.getTitle();
	}
	
	public void clickIntroduction() {
		driver.findElement(introduction).click();
	}
	public String getIntroduction() {
	    return driver.getTitle();
		
	}
   public String getIntroductiontitle() {
		return driver.getTitle();
	}
   
   
	public void clickcreatinglinkedlist() {
		
		driver.findElement(CreatingLinkedLIst).click();
	}
	public String getcreatinglinkedlisttitle() {
		return driver.getTitle();
		
	}
	public  void clickTypesofLinkedList() {
		driver.findElement(TypesofLinkedList).click();
	}
	
	public String gettypesofLinkedListtitle() {
		return driver.getTitle();
		
	}
	public void clickImplementLinkedList() {
		driver.findElement(ImplementLinkedList).click();
	}
	public String getImplementLinkedListTitle() {
		return driver.getTitle();
	}
	
	public void clickTraversal() {
		driver.findElement(Traversal).click();
	}
	
	public String getTraversalTitle() {
		return driver.getTitle();
	}
	
	public void clickInsertion() {
		driver.findElement(Insertion).click();
	}
	
	public String getInsertionTitle() {
		return driver.getTitle();
	}
	
	public void clickDeletion() {
		driver.findElement(Deletion).click();
	}
	 
	public String getDeletionTitle() {
		return driver.getTitle();
		
	}

	public void clickPracticeQuestions() {
		driver.findElement(practicequestions).click();
	}

	public String getPracticeQuestionsPageTitle() {
		return driver.getTitle();
	}

	
}
