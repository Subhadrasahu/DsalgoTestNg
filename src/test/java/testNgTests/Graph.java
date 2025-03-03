package testNgTests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageobject.Graphpage;
import utilities.configFileReader;
import webdrivermanager.DriverFactory;

public class Graph extends BaseTest {
	
	private Graphpage Graph;
	//private tryEditor editor;

	
@BeforeMethod
public void LoginwithValid() {

	login.clickGetStartedbutton();
	login.SignInBtn();
	String username = configFileReader.getProperty("username");
	login.setUsername(username);
	String password = configFileReader.getProperty("password");
	login.setPassword(password);
	login.clickLoginButton();
}


@Test
public void GraphGetStartedButton() {
    //Graph graph = new Graph();
	Graph.clickGraphGetStartedbutton();
	Assert.assertEquals(Graph.getGraphPageTitle(), "Expected Graph Page Title");
	//String title = Graph.getGraphPageTitle();
	 //Assert.assertEquals(title, "Graph", "Graph Page Title");
  
}

@Test
public void clickGraph() {
   Graph.clickGraph();
   String title = Graph.getGraphTitle();
    Assert.assertEquals(Graph.getGraphTitle(), "Expected Graph Title");
	
}

@Test
public void GraphRepresentations() {
    Graph.clickGraphRepresentations();
    Assert.assertEquals(Graph.getGraphRepresentations(), "Expected Graph Representations Title");
}

@Test(priority = 5)
public void TryEditor() {
    Graph.clickGraph();
    //editor.clickTryHere();
    //Assert.assertEquals(Graph.getTryHerePageTitle(),"Expected Try Editor Page Title");
   //String title = editor.getTryHerePageTitle();
   //Assert.assertEquals(title, "Assessment", "Try Editor Page Title");
}

@Test
public void PracticeQuestions() {
	Graph.clickGraphRepresentations();
    Graph.clickPracticeQuestions();
    Assert.assertEquals(Graph.getPracticeQuestionsPageTitle(), "Expected Practice Questions Title");
    //String title = Graph.getPracticeQuestionsPageTitle();
    //Assert.assertEquals(title, "Practice Questions", "Practice Questions Page Title Mismatch");
}


@Test
public void testSignOut() {
    Graph.clickSignout();
    String title = Home.gethomepagetitle();
    Assert.assertEquals(title, "NumpyNinja");//"Signout Failed, User is not redirected to Home Page");
   
	
}



}
