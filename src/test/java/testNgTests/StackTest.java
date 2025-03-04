package testNgTests;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClass.BaseTest;
import pageobject.Stackpage;
import utilities.LoggerLoad;
import webdrivermanager.DriverFactory;

public class StackTest extends BaseTest{
	
	Stackpage stack ;
	
	@BeforeMethod
	public void login() {
		
		LoginwithValid();
	    stack = new Stackpage(DriverFactory.getDriver()); 
		stack.clickGetStarted();

	}
	
	
	
	@Test(priority = 1)
	public void clickStackfromDropDown() {
		
		Home.clickDropdownOption("Stack");
		Assert.assertEquals(stack.getStacktitle(), "Stack");
		
	}
	
	@Test(priority = 2)
	public void OperationsIN_Stack() {
		
		stack.clickOperationsInStack();
		Assert.assertEquals(stack.getStacktitle(), "Operations in Stack");
	}
	
	@Test(priority = 3)
	public void  clickTryHere() {
		
		stack.clickOperationsInStack();
		common.clickTryHere();
		common.clickRunButton();
		Assert.assertEquals(login.isAlertPresent(), true);
	}
	
	@Test(dataProvider ="TryeditorProvider")
	public void testPythoncode(Map<String, String> data) {
		//stack.clickGetStarted();
		stack.clickOperationsInStack();
		common.clickTryHere();
		String Pythocode = data.get("Pythoncode");
		common.ValidInvalidtextEditorOperations(Pythocode);
		common.clickRunButton();
		String expectedalert = data.get("ExpectedAlert");
		String expectedResult = data.get("ExpectedResult");
		if(login.isAlertPresent()== true)
		{
		
		String alertmsg =	login.handleAlert();
		Assert.assertEquals(alertmsg ,expectedalert,expectedResult);
		}
		else 
		{
			
			String output = common.getOutput();
			Assert.assertEquals(output ,expectedResult,expectedalert);
			
		} 
		
	}
  @Test(priority = 5)
  public void ClickImplementation() {
	  
	  stack.clickImplementation();
	  Assert.assertEquals(stack.getStacktitle(), "Implementation");
  }
  
  @Test
  public void Click_TryhereINImplementation() {
	  
	  stack.clickImplementation();
	  common.clickTryHere();
		common.clickRunButton();
		Assert.assertEquals(login.isAlertPresent(), true);
	  
  }
  
  @Test (dataProvider ="TryeditorProvider")
  public void Invalid_pythonCode(Map<String, String> data) {
	  
	  stack.clickImplementation();
	  common.clickTryHere();
	  String Pythocode = data.get("Pythoncode"); 
	  LoggerLoad.info(Pythocode);
	  common.ValidInvalidtextEditorOperations(Pythocode);
	  common.clickRunButton();
	  String expectedalert = data.get("ExpectedAlert");
		String expectedResult = data.get("ExpectedResult");
		if(login.isAlertPresent()== true)
		{
		
		String alertmsg =	login.handleAlert();
		Assert.assertEquals(alertmsg ,expectedalert,expectedResult);
		}
		else 
		{
			String output = common.getOutput();
			Assert.assertEquals(output ,expectedResult,expectedalert);
			
		} 
  }
		
		@Test
		public void clickApplication() {
			
			stack.clickApplications();
			common.clickTryHere();
			common.clickRunButton();
			Assert.assertEquals(login.isAlertPresent(), true);
		}
	  
  

}
