package testNgTests;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClass.BaseTest;
import pageobject.DataStructurespage;
import webdrivermanager.DriverFactory;

public class DataStructures extends BaseTest{
	
	DataStructurespage datapage ;
	
	@BeforeMethod
	public void login() {
		
		LoginwithValid();
	    datapage = new DataStructurespage(DriverFactory.getDriver()); 
		datapage.clickDSGetStarted();

	}
	
    
    /*@Test
    public void navigateToDSIntroGetStarted() {
        datapage.clickDSGetStarted();
        String title = datapage.getDSIntroPageTitle();
        Assert.assertTrue(title.contains("Data Structures-Introduction"), "Data Structures-Introduction");
        //Assert.assertEquals(datapage.getDSIntroPageTitle(),"Data Structures-Introduction");
    }*/
	

	@Test
	public void clickDSIntrofromDropDown() {
		
		Home.clickDropdownOption("Data Structures-Introduction");
		Assert.assertEquals(datapage.getDSIntroPageTitle(), "Data Structures-Introduction");
		
	}
    
    @Test
    public void navigateToTimeComplexity() {
        datapage.clickTimeComplexity();
        String title = datapage.getTimeComplexityTitle();
        Assert.assertEquals(title, "Time Complexity", "Navigation to Time Complexity failed");
    }
    
    @Test
    public void clickTimeComplexityTryHere() {
    	datapage.clickTimeComplexity();
    	common.clickTryHere();
    	common.clickRunButton();
    	Assert.assertEquals(login.isAlertPresent(),true);
      
 }
    @Test(dataProvider ="TryeditorProvider")
    public void testPythoncode(Map<String, String> data) {
    	datapage.clickTimeComplexity();
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
    public void navigateToPracticeQuestions() {
    	datapage.clickTimeComplexity();
        datapage.clickPracticeQuestions();
        //String title = datapage.getPracticeQuestionsPageTitle();
        //Assert.assertEquals(title, "Practice Questions", "Navigation to Practice Questions failed");
        Assert.assertEquals(datapage.getPracticeQuestionsPageTitle(),"Practice Questions");
    }
    
    
}


