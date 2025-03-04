package testNgTests;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClass.BaseTest;
import pageobject.Stackpage;
import webdrivermanager.DriverFactory;

public class StackTest extends BaseTest{
	
	Stackpage stack ;
	
	@BeforeMethod
	public void login() {
		
		LoginwithValid();
	    stack = new Stackpage(DriverFactory.getDriver()); 
		stack.clickGetStarted();

	}
	
	
	
	@Test
	public void clickStackfromDropDown() {
		
		Home.clickDropdownOption("Stack");
		Assert.assertEquals(stack.getStacktitle(), "Stack");
		
	}
	
	@Test
	public void OperationsIN_Stack() {
		//stack.clickGetStarted();
		stack.clickOperationsInStack();
		Assert.assertEquals(stack.getStacktitle(), "Operations in Stack");
	}
	
	@Test
	public void  clickTryHere() {
		//stack.clickGetStarted();
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

}
