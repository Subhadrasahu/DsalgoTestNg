package testNgTests;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClass.BaseTest;
import pageobject.Graphpage;
import webdrivermanager.DriverFactory;

public class Graph extends BaseTest {
	
	Graphpage graph;

	
@BeforeMethod
public void login() {
	LoginwithValid();
     graph = new Graphpage(DriverFactory.getDriver()); 
	graph.clickGraphGetStartedbutton();
}


@Test
public void GraphGetStartedButton() {
    graph.clickGraphGetStartedbutton();
	Assert.assertEquals(graph.getGraphPageTitle(), "Graph");
	//String title = Graph.getGraphPageTitle();
	 //Assert.assertEquals(title, "Graph", "Graph Page Title");
  
}

@Test
public void clickGraph() {
   graph.clickGraph();
   //String title = graph.getGraphTitle();
    Assert.assertEquals(graph.getGraphTitle(), "Graph");
	
}

@Test
public void  clickGraphTryHere() {
	graph.clickGraph();
	common.clickTryHere();
	common.clickRunButton();
	Assert.assertEquals(login.isAlertPresent(), true);
  
}

@Test(dataProvider ="TryeditorProvider")
public void testPythoncode(Map<String, String> data) {
	graph.clickGraph();
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
public void clickGraphRepresentations() {
    graph.clickGraphRepresentations();
    Assert.assertEquals(graph.getGraphRepresentations(), "Graph Representations");
}

@Test
public void clickGraphRepresentationsTryHere() {
	  
	  graph.clickGraphRepresentations();
	  common.clickTryHere();
		common.clickRunButton();
		Assert.assertEquals(login.isAlertPresent(), true);
	  
}

@Test(dataProvider ="TryeditorProvider")
public void Invalid_pythonCode(Map<String, String> data) {
	graph.clickGraphRepresentations();
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
	graph.clickGraphRepresentations();
    graph.clickPracticeQuestions();
    Assert.assertEquals(graph.getPracticeQuestionsPageTitle(), "Practice Questions");
    
}


@Test
public void testSignOut() {
    graph.clickSignout();
    String title = graph.getHomePageTitle();
    Assert.assertEquals(title, "NumpyNinja");//"Signout Failed, User is not redirected to Home Page");
   
	
}



}
