package pageobject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {

	private WebDriver driver;
 private By home_getstarted =By.xpath("//button[@class='btn']");
 private By Numpyninja = By.xpath("//a[text()='NumpyNinja']");
 private By DS_dropdown = By.xpath("//a[text()='Data Structures']");	
 private By Register_Button = By.xpath("//a[@href='/register']");
 private By Login_Button = By.xpath("//a[@href='/login']"); 
 private By Error_msg = By.xpath("//div[@class='alert alert-primary']");
 private By Dropdownitems = By.xpath("//a[@class='dropdown-item']");
 private By DS_getstarted = By.xpath("//a[@href ='data-structures-introduction']");
 private By Array_getstarted = By.xpath("//a[@href ='array']");
 private By LinkedList_getstarted = By.xpath("//a[@href ='linked-list']");
 private By Stack_getstarted = By.xpath("//a[@href ='stack']");
 private By Queue_getstarted = By.xpath("//a[@href ='queue']");
 private By Tree_getstarted = By.xpath("//a[@href ='tree']");
 private By Graph_getstarted = By.xpath("//a[@href ='graph']");
 
 public Homepage(WebDriver Driver) {
		
		this.driver = Driver;
	}
 
 
 public String getlandingpagetitle() {
	 
	return driver.getTitle();
 }
 
 public void navigateToHomePage() {
	 
     WebElement homepage = driver.findElement(home_getstarted);
     homepage.click();
 }
 public Boolean[] isdisplayedonhome() {
	 
	Boolean[] buttons =  {driver.findElement(Login_Button).isDisplayed(), 
	                      driver.findElement(Register_Button).isDisplayed(), 
	                      driver.findElement(Numpyninja).isDisplayed()};
	return buttons ;
 }
 
 public String gethomepagetitle() {
	 
  WebElement hometitle = driver.findElement(home_getstarted);
  hometitle.click();
  return driver.getTitle();
	 
 }
 
 public void clickDSdropdown() {
	 
	 driver.findElement(DS_dropdown).click();
 }

 public int getDropdownItemCount() {
     driver.findElement(DS_dropdown).click();
     List<WebElement> items = driver.findElements(Dropdownitems);
     return items.size();
 }

 public String getErrorMessage() {
     return driver.findElement(Error_msg).getText();
 }

 public void clickRegisterButton() {
     driver.findElement(Register_Button).click();
 }

 public void clickSignInButton() {
     driver.findElement(Login_Button).click();
 }

 public void clickDropdownOption(String optionText) {
     driver.findElement(DS_dropdown).click();
     List<WebElement> items = driver.findElements(Dropdownitems);
     for (WebElement item : items) {
         if (item.getText().equalsIgnoreCase(optionText)) {
             item.click();
             break;
         }
     }
 }
 
 public String getregistrationpagetitle() {
	 
	driver.findElement(Register_Button).click();
	String registrationpagetitle = driver.getTitle();
	return registrationpagetitle;
	 
 }
 
 public void clickDSintrogetstarted() {
	 
	 driver.findElement(DS_getstarted).click();
 }
 
 public void clickarraygetstarted() {
	 driver.findElement(Array_getstarted).click();
 }
 public void clicklinkedlistgetstarted() {
	 driver.findElement(LinkedList_getstarted).click();
 }
 public void clickstackgetstarted() {
	 driver.findElement(Stack_getstarted).click();
 }
 
 public void clickqueuegetstarted() {
	 driver.findElement(Queue_getstarted).click();
 }
 public void clicktreegetstarted() {
	 driver.findElement(Tree_getstarted).click();
 }
 public void clickgraphgetstarted() {
	 driver.findElement(Graph_getstarted).click();
 }
 }
