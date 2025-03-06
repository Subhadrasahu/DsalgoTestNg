package testNgTests;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClass.BaseTest;
import pageobject.Queuepage;
import pageobject.Queuepage;
import webdrivermanager.DriverFactory;

public class QueueTest extends BaseTest{
protected Queuepage queue;
	
	@BeforeMethod
	public void Navigation_to_queuePage() {
		
			    queue = new Queuepage(DriverFactory.getDriver()); 
			    LoginwithValid();
			    queue.clickQueueGetStartedbutton();
			    }
//Implementation of Queue in Python	
	@Test(priority = 1)
	public void TC_01_ImplementationofQueueinPython() {
		queue.clickImplementationofQueueinPython();
		Assert.assertEquals(queue.getQueuePageTitle(),"Implementation of Queue in Python");
		
	}

	@Test(priority = 2)
	public void TC_02_ImplementationOfBSTPageTryHere() {
		queue.clickImplementationofQueueinPython();
		common.clickTryHere();
		Assert.assertEquals(queue.getQueuePageTitle(),"Assessment");
		
	}
	
	
	@Test(dataProvider ="TryeditorProvider",priority = 3)
	public void testPythoncodeForImplementationOfBSTPage(Map<String, String> data) {
		
		queue.clickImplementationofQueueinPython();
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
	
// Practice Questions 
	
	@Test(priority = 14)
	public void TC_01_PracticeQuestions () {
		queue.clickImplementationofQueueinPython();
		queue.clickPracticeQuestions();
		Assert.assertEquals(queue.getQueuePageTitle(),"Practice Questions");
		
	}
//Implementation using collections.deque
	@Test(priority = 5)
	public void TC_01_Implementationusingcollectionsdeque() {
		queue.clickImplementationusingcollectionsdeque();
		Assert.assertEquals(queue.getQueuePageTitle(),"Implementation using collections.deque");
		
	}

	@Test(priority = 6)
	public void TC_02_ImplementationusingcollectionsdequeTryHere() {
		queue.clickImplementationusingcollectionsdeque();
		common.clickTryHere();
		Assert.assertEquals(queue.getQueuePageTitle(),"Assessment");
		
	}
	
	
	@Test(dataProvider ="TryeditorProvider",priority = 7)
	public void testPythoncodeForImplementationusingcollectionsdequePage(Map<String, String> data) {
		
		queue.clickImplementationusingcollectionsdeque();
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
	//Implementation using array
	
	@Test(priority = 8)
	public void TC_01_Implementationusingarray() {
		queue.clickImplementationusingarray();
		Assert.assertEquals(queue.getQueuePageTitle(),"Implementation using array");
		
	}

	@Test(priority = 9)
	public void TC_02_ImplementationusingarrayTryHere() {
		queue.clickImplementationusingarray();
		common.clickTryHere();
		Assert.assertEquals(queue.getQueuePageTitle(),"Assessment");
		
	}
	
	
	@Test(dataProvider ="TryeditorProvider",priority = 10)
	public void testPythoncodeForImplementationusingarrayPage(Map<String, String> data) {
		
		queue.clickImplementationusingarray();
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
	//Queue Operations
	@Test(priority = 11)
	public void TC_01_QueueOperations() {
		queue.clickQueueOperations();
		Assert.assertEquals(queue.getQueuePageTitle(),"Queue Operations");
		
	}

	@Test(priority = 12)
	public void TC_02_QueueOperationsTryHere() {
		queue.clickQueueOperations();
		common.clickTryHere();
		Assert.assertEquals(queue.getQueuePageTitle(),"Assessment");
		
	}
	
	
	
	@Test(dataProvider ="TryeditorProvider",priority = 13)
	public void testPythoncodeForQueueOperationsPage(Map<String, String> data) {
		
		queue.clickQueueOperations();
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
