package testNgTests;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClass.BaseTest;
import pageobject.LinkedListpage;
import webdrivermanager.DriverFactory;

public class LinkedList extends BaseTest{
	
	LinkedListpage linked ;
	
	@BeforeMethod
	public void login() {
		
		LoginwithValid();
	    linked = new LinkedListpage(DriverFactory.getDriver()); 
		linked.clickLinkedListGetStarted();

	}
	
		
    @Test
	public void clickIntroduction() {
        linked.clickIntroduction();
        Assert.assertEquals(linked.getIntroductiontitle(), "Introduction");
    }
    @Test
    public void  clickIntroductionTryHere() {
    	linked.clickIntroduction();
    	common.clickTryHere();
    	common.clickRunButton();
    	Assert.assertEquals(login.isAlertPresent(), true);
      
    }

    @Test(dataProvider ="TryeditorProvider")
    public void testPythonCodeforIntroduction(Map<String, String> data) {
    	linked.clickIntroduction();
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


    @Test
    public void clickCreatingLinkedList() {
        linked.clickcreatinglinkedlist();
        Assert.assertEquals(linked.getcreatinglinkedlisttitle(), "Creating Linked LIst");
    }
    
    @Test
    public void clickCreatingLinkedListTryHere() {
    	  
    	  linked.clickcreatinglinkedlist();
    	  common.clickTryHere();
    		common.clickRunButton();
    		Assert.assertEquals(login.isAlertPresent(), true);
    	  
    }

    @Test(dataProvider ="TryeditorProvider")
    public void testPythonCodeforCreatingLinkedList(Map<String, String> data) {
         linked.clickcreatinglinkedlist();
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


    @Test
    public void clickTypesOfLinkedList() {
        linked.clickTypesofLinkedList();
        Assert.assertEquals(linked.gettypesofLinkedListtitle(), "Types of Linked List");
    }
    
    @Test
    public void clickTypesOfLinkedListTryHere() {
    	  
    	  linked.clickTypesofLinkedList();
    	  common.clickTryHere();
    		common.clickRunButton();
    		Assert.assertEquals(login.isAlertPresent(), true);
    	  
    }
    
    @Test(dataProvider ="TryeditorProvider")
    public void testPythonCodeforTypesOfLinkedList(Map<String, String> data) {
         linked.clickTypesofLinkedList();
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


  @Test
    public void clickImplementLinkedList() {
        linked.clickImplementLinkedList();
        Assert.assertEquals(linked.getImplementLinkedListTitle(), "Implement Linked List in Python");
    }
    
    @Test
    public void clickImplementLinkedListTryHere() {
    	  linked.clickImplementLinkedList();
    	  common.clickTryHere();
    		common.clickRunButton();
    		Assert.assertEquals(login.isAlertPresent(), true);
    	  
    }
    
    @Test(dataProvider ="TryeditorProvider")
    public void testPythonCodeforImplementLinkedList(Map<String, String> data) {
         linked.clickImplementLinkedList();
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


   

   @Test
    public void clickTraversal() {
        linked.clickTraversal();
        Assert.assertEquals(linked.getTraversalTitle(), "Traversal");
    }
   
   @Test
   public void clickTraversalTryHere() {
   	  linked.clickTraversal();
   	  common.clickTryHere();
   		common.clickRunButton();
   		Assert.assertEquals(login.isAlertPresent(), true);
   	  
   }
   
   @Test(dataProvider ="TryeditorProvider")
   public void testPythonCodeforTraversal(Map<String, String> data) {
        linked.clickTraversal();
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


  @Test
    public void Insertion() {
        linked.clickInsertion();
        Assert.assertEquals(linked.getInsertionTitle(), "Insertion");
    }
    
    @Test
    public void clickInsertionTryHere() {
    	  linked.clickInsertion();
    	  common.clickTryHere();
    		common.clickRunButton();
    		Assert.assertEquals(login.isAlertPresent(), true);
    	  
    }
    
    @Test(dataProvider ="TryeditorProvider")
    public void testPythonCodeforInsertion(Map<String, String> data) {
         linked.clickInsertion();
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


   @Test
    public void DeletionNavigation() {
        linked.clickDeletion();
        Assert.assertEquals(linked.getDeletionTitle(), "Deletion");
    }
   
   /*@Test
	public void clickDeletionTryHere() {
		linked.clickDeletion();
		linked.clickTryHereInlinkedlist();
		Assert.assertEquals(linked.getPageTitle(),"Assessment");
		
	}*/
    
    @Test
    public void clickDeletionTryHere() {
    	  linked.clickDeletion();
    	  common.clickTryHere();
    		common.clickRunButton();
    		Assert.assertEquals(login.isAlertPresent(), true);
    	  
    }
    
    @Test(dataProvider ="TryeditorProvider")
    public void testPythonCodeforDeletion(Map<String, String> data) {
         linked.clickDeletion();
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

    @Test
    public void PracticeQuestions() {
    	linked.clickDeletion();
        linked.clickPracticeQuestions();
        Assert.assertEquals(linked.getPracticeQuestionsPageTitle(), "Practice Questions");
        
    }
   





}
