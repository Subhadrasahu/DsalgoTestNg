package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Treepage {

	private WebDriver driver;
	
//2. constructure of the page class
	public Treepage(WebDriver driver ) {
		this.driver = driver;
		}
//1.By locators
	private By landingGetStartedbtn=By.xpath("//button[@class=\"btn\"]");
	private By signIn=By.xpath("//a[@href=\"/login\"]");

	private By username=By.xpath("//input[@name=\"username\"]");
	private By password = By.xpath("//input[@name=\"password\"]"); 
	
	private	By treeGetStartedBtn = By.xpath("//a[@href='tree']");
	private	By tryHere = By.linkText("Try here>>>");
	private	By texteditor = By.xpath("//div[contains(@class,'CodeMirror')]/div/textarea");
	private By runbutton = By.xpath("//button[text()='Run']");
	private By output = By.id("output");
	private By overviewOfTrees =By.xpath("//a[@href=\"overview-of-trees\"]");
	private By Terminologies = By.xpath("//a[@href=\"terminologies\"]");
	private By TypesOfTrees = By.xpath("//a[@href=\"types-of-trees\"]");
	private By TreeTraversals = By.xpath("//a[@href=\"tree-traversals\"]");
	private By Traversalillustartion = By.xpath("//a[@href=\"traversals-illustration\"]");
	private By BinaryTrees = By.xpath("//a[@href=\"binary-trees\"]");
	private By TypesOfBinaryTrees = By.xpath("//a[@href=\"types-of-binary-trees\"]");
	private By ImplementationInPython = By.xpath("//a[@href=\"implementation-in-python\"]");
	private By BinaryTreeTraversals = By.xpath("//a[@href=\"binary-tree-traversals\"]");
	private By implementationOfBinaryTrees = By.xpath("//a[@href=\"implementation-of-binary-trees\"]");
	private By applicationOfBinaryTrees = By.xpath("//a[@href=\"applications-of-binary-trees\"]");
	private By BinarySearchTrees = By.xpath("//a[@href=\"binary-search-trees\"]");
	private By implementationOfBst = By.xpath("//a[@href=\"implementation-of-bst\"]");
	private By practiceQuestions = By.xpath("//a[@href=\"/tree/practice\"]");
	
//3.page actions
	
	public String getPageTitle() {
		return driver.getTitle();
		
	}
	
	public void landingGetStartedbtnClick() {
		driver.findElement(landingGetStartedbtn).click();
	}
	
	public void SignInBtn() {
		driver.findElement(signIn).click();
	}
	
	public void enterUsername(String userName) {
		driver.findElement(username).sendKeys(userName);
	}
	
	public void treeGetStartedBtnClick() {
		driver.findElement(treeGetStartedBtn).click();
	}
	
	public void overviewOfTreesClick() {
		driver.findElement(overviewOfTrees).click();
	}
	
	public void TerminologiesClick() {
		driver.findElement(Terminologies).click();
	}
	
	public void TypesOfTreesClick() {
		driver.findElement(TypesOfTrees).click();
	}
	
	public void TreeTraversalsClick() {
		driver.findElement(TreeTraversals).click();
	}
	
	public void TraversalillustartionClick() {
		driver.findElement(Traversalillustartion).click();
	}

	public void BinaryTreesClick() {
		driver.findElement(BinaryTrees).click();
	}
	
	public void TypesOfBinaryTreesClick() {
		driver.findElement(TypesOfBinaryTrees).click();
	}
	
	public void ImplementationInPythonClick() {
		driver.findElement(ImplementationInPython).click();
	}
	
	public void BinaryTreeTraversalsClick() {
		driver.findElement(BinaryTreeTraversals).click();
	}
	
	public void implementationOfBinaryTreesClick() {
		driver.findElement(implementationOfBinaryTrees).click();
	}

	public void applicationOfBinaryTreesClick() {
		driver.findElement(applicationOfBinaryTrees).click();
	}
	
	public void BinarySearchTreesClick() {
		driver.findElement(BinarySearchTrees).click();
	}
	
	public void implementationOfBstClick() {
		driver.findElement(implementationOfBst).click();
	}


	public void clickTryHereInTree () {
		driver.findElement(tryHere).click();
	}
	public void textEditorOperations () {
		driver.findElement(texteditor).sendKeys("print(\"Hello World\")");
	}
	
	public void clickRunButton () {
		driver.findElement(runbutton).click();
	}
	
	public void textEditorInvalidOperations () {
		driver.findElement(texteditor).sendKeys("Hello");
	}
	
	public void ValidInvalidtextEditorOperations (String pythonCode) {
		driver.findElement(texteditor).sendKeys( pythonCode);
	}
	public void practiceQuestionsClick() {
		driver.findElement(practiceQuestions).click();
	}
	
}
