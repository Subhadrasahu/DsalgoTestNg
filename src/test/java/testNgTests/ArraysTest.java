package testNgTests;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClass.BaseTest;
import pageobject.Arrayspage;
import utilities.DataProviders;
import utilities.LoggerLoad;
import webdrivermanager.DriverFactory;

public class ArraysTest extends BaseTest {
	
	Arrayspage array;
	
	@BeforeMethod(groups= "regression")
	public void Array_Module() {
		
		LoginwithValid();
	    array = new Arrayspage(DriverFactory.getDriver());
		array.clickArraysGetStartedbutton();
	}
	
	@Test
	public void clickArray_Dropdown() {
		
		Home.clickDropdownOption("Arrays");
		Assert.assertEquals(array.getArraysPageTitle(), "Array");
		LoggerLoad.info("user is on Arrays page");
	}
	
	@Test
	public void clickArraysinPython() {
		
		array.clickArraysinPython();
		Assert.assertEquals(array.getArraysPageTitle(), "Arrays in Python");
		LoggerLoad.info("user is on Arrays in Python");
	}
	
	@Test
	public void  clickTryHere() {
		array.clickArraysinPython();
		common.clickTryHere();
		common.clickRunButton();
		Assert.assertEquals(login.isAlertPresent(), true);
		LoggerLoad.info("user is can see alert when there is no code in editor");
	}
	
	@Test(dataProvider ="TryeditorProvider")
	public void testPythoncode(Map<String, String> data) {
		
		array.clickArraysinPython();
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
	public void clickArraysUsingList() {
		
		array.clickArraysUsingList();
		Assert.assertEquals(array.getArraysPageTitle(), "Arrays Using List");
	}
	
	@Test
	public void  clickTryHere1() {
		array.clickArraysUsingList();
		common.clickTryHere();
		common.clickRunButton();
		Assert.assertEquals(login.isAlertPresent(), true);
		LoggerLoad.warn("user should see some alert");
	}
	
	@Test(dataProvider ="TryeditorProvider")
	public void testPythoncode1(Map<String, String> data) {
		
		array.clickArraysUsingList();
		common.clickTryHere();
		String Pythocode = data.get("Pythoncode");
		common.ValidInvalidtextEditorOperations(Pythocode);
		common.clickRunButton();
		String expectedalert = data.get("ExpectedAlert");
		String expectedResult = data.get("ExpectedResult");
		if(login.isAlertPresent()== true)
		{
		
		String alertmsg =	login.handleAlert();
		LoggerLoad.info("user will get alerttext :" + alertmsg);
		Assert.assertEquals(alertmsg ,expectedalert,expectedResult);
		}
		else 
		{
			
			String output = common.getOutput();
			LoggerLoad.info("user will get output :" + output);
			Assert.assertEquals(output ,expectedResult,expectedalert);
			
			
		} 
		
	}
	
	
	@Test
	public void clickBasicOperationsInLists() {
		
		array.clickBasicOperationsinLists();
		Assert.assertEquals(array.getArraysPageTitle(), "Basic Operations in Lists");
		LoggerLoad.info("user landed on Applications of ArraBasic Operations in Lists page");
		
	}
	
	@Test
	public void clickApplicationsOfArray() {
		
		array.clickApplicationsofArray();
		Assert.assertEquals(array.getArraysPageTitle(), "Applications of Array");
		LoggerLoad.info("user landed on Applications of Array page");
	}
	
	@Test
	public void clickPracticeQuestions() {
		
		array.clickApplicationsofArray();
		array.clickPracticeQuestions();
		Assert.assertEquals(array.getArraysPageTitle(), "Practice Questions");
		LoggerLoad.info("user landed on practice Questions page");
		
	}
	
	@Test
	public void clickSearchTheArray() {
		
		array.clickApplicationsofArray();
		array.clickPracticeQuestions();
		array.clickSearchtheArray();
		Assert.assertEquals(array.getArraysPageTitle(), "Assessment");
		LoggerLoad.info("user landed on practice Questions question1 page");
	}
	
	@Test(dataProvider="Array_paracticeQuestions" , dataProviderClass = DataProviders.class  /*, groups ="regression"*/)
	public void ArrayPracticeQuestion1(Map<String , String> data) {
		
		array.clickApplicationsofArray();
		array.clickPracticeQuestions();
		array.clickSearchtheArray();
		common.clearTextEditor();
		String pythocode = data.get("Pythoncode");
		common.ValidInvalidtextEditorOperations(pythocode);
		common.clickRunButton();
		String Expectedoutput = data.get("output");
		String ExpectedalertMessage = data.get("AlertMessage");
		if(login.isAlertPresent() == true) {
			
			String actualOutput = login.handleAlert();
			Assert.assertEquals(actualOutput, ExpectedalertMessage);
			
		}else
		{
			String actualOutput = common.getOutput();
			Assert.assertEquals(actualOutput, Expectedoutput);
			
			
		}
		
		
	}
	
	@Test(dataProvider="Array_paracticeQuestions" , dataProviderClass = DataProviders.class /*, groups ="regression"*/)
	public void ArraySubmittion(Map<String , String> data) {
		
		array.clickApplicationsofArray();
		array.clickPracticeQuestions();
		array.clickSearchtheArray();
		common.clearTextEditor();
		String pythocode = data.get("Pythoncode");
		common.ValidInvalidtextEditorOperations(pythocode);
		//common.clickRunButton();
		//login.handleAlert();
		String Expectedsubmitmessage = data.get("SubmitionMessage");
		LoggerLoad.info(Expectedsubmitmessage);
		array.clickSubmit();
		LoggerLoad.info("click submit button");
		String submitionmsg = array.getSubmissionMessage();
		LoggerLoad.info("expected submittion msg" + submitionmsg );
		Assert.assertEquals(submitionmsg, Expectedsubmitmessage);
	}
	
	
	@Test
	public void clickMaxConsecutiveones() {
		
		array.clickApplicationsofArray();
		array.clickPracticeQuestions();
		array.clickMaxConsecutiveOnes();
		Assert.assertEquals(array.getArraysPageTitle(), "Assessment");
		LoggerLoad.info("user landed on practice Questions question2 page");
		
	}
	
	@Test(dataProvider="Array_paracticeQuestions" , dataProviderClass = DataProviders.class  , groups ="regression")
	public void ArrayPracticeQuestion2(Map<String , String> data) {
		
		array.clickApplicationsofArray();
		array.clickPracticeQuestions();
		array.clickSearchtheArray();
		common.clearTextEditor();
		String pythocode = data.get("Pythoncode");
		common.ValidInvalidtextEditorOperations(pythocode);
		common.clickRunButton();
		String Expectedoutput = data.get("output");
		String ExpectedalertMessage = data.get("AlertMessage");
		String Expectedsubmitmessage = data.get("SubmitionMessage");
		if(login.isAlertPresent() == true) {
			
			String actualOutput = login.handleAlert();
			Assert.assertEquals(actualOutput, ExpectedalertMessage);
			
		}else
		{
			String actualOutput = common.getOutput();
			Assert.assertEquals(actualOutput, Expectedoutput);
			
			
		}
		
		array.clickSubmit();
		LoggerLoad.info("click submit button");
		String submitionmsg = array.getSubmissionMessage();
		LoggerLoad.info("expected submittion msg" + submitionmsg );
		Assert.assertEquals(submitionmsg, Expectedsubmitmessage);
		
		
	}
	@Test
	public void clickFindNumswithEvenNumberOfDigits() {
		
		array.clickApplicationsofArray();
		array.clickPracticeQuestions();
		array.clickFindNumbersWithEvenNumberOfDigits();
		Assert.assertEquals(array.getArraysPageTitle(), "Assessment");
		LoggerLoad.info("user landed on practice Questions question3 page");
	}
	@Test(dataProvider="Array_paracticeQuestions" , dataProviderClass = DataProviders.class  , groups ="regression")
	public void ArrayPracticeQuestion3(Map<String , String> data) {
		
		array.clickApplicationsofArray();
		array.clickPracticeQuestions();
		array.clickSearchtheArray();
		common.clearTextEditor();
		String pythocode = data.get("Pythoncode");
		common.ValidInvalidtextEditorOperations(pythocode);
		common.clickRunButton();
		String Expectedoutput = data.get("output");
		String ExpectedalertMessage = data.get("AlertMessage");
		String Expectedsubmitmessage = data.get("SubmitionMessage");
		if(login.isAlertPresent() == true) {
			
			String actualOutput = login.handleAlert();
			Assert.assertEquals(actualOutput, ExpectedalertMessage);
			
		}else
		{
			String actualOutput = common.getOutput();
			Assert.assertEquals(actualOutput, Expectedoutput);
			
			
		}
		
		array.clickSubmit();
		LoggerLoad.info("click submit button");
		String submitionmsg = array.getSubmissionMessage();
		LoggerLoad.info("expected submittion msg" + submitionmsg );
		Assert.assertEquals(submitionmsg, Expectedsubmitmessage);
		
		
	}
	@Test
   public void clickSquaresofSortedArray() {
		
		array.clickApplicationsofArray();
		array.clickPracticeQuestions();
		array.clickSquaresofaSortedArray();
		Assert.assertEquals(array.getArraysPageTitle(), "Assessment");
		LoggerLoad.info("user landed on practice Questions question4 page");
	}
	
	@Test(dataProvider="Array_paracticeQuestions" , dataProviderClass = DataProviders.class  , groups ="regression")
	public void ArrayPracticeQuestion4(Map<String , String> data) {
		
		array.clickApplicationsofArray();
		array.clickPracticeQuestions();
		array.clickSearchtheArray();
		common.clearTextEditor();
		String pythocode = data.get("Pythoncode");
		common.ValidInvalidtextEditorOperations(pythocode);
		common.clickRunButton();
		String Expectedoutput = data.get("output");
		String ExpectedalertMessage = data.get("AlertMessage");
		String Expectedsubmitmessage = data.get("SubmitionMessage");
		if(login.isAlertPresent() == true) {
			
			String actualOutput = login.handleAlert();
			Assert.assertEquals(actualOutput, ExpectedalertMessage);
			
		}else
		{
			String actualOutput = common.getOutput();
			Assert.assertEquals(actualOutput, Expectedoutput);
			
			
		}
		
		array.clickSubmit();
		LoggerLoad.info("click submit button");
		String submitionmsg = array.getSubmissionMessage();
		LoggerLoad.info("expected submittion msg" + submitionmsg );
		Assert.assertEquals(submitionmsg, Expectedsubmitmessage);
		
		
	}
	
	
	}
