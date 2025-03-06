package testNgTests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClass.BaseTest;
import utilities.configFileReader;
import webdrivermanager.DriverFactory;

public class Login extends BaseTest {
		
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
  public void GetStarted_DS() {
	  
	  Home.clickDSintrogetstarted();
	  Assert.assertEquals(DriverFactory.getDriver().getTitle(), "Data Structures-Introduction");
  }
  
  @Test
  public void getStarted_Array() {
	  
	  Home.clickarraygetstarted();
	  Assert.assertEquals(DriverFactory.getDriver().getTitle(), "Array");
	  
  }
  
  @Test
  public void getStarted_Stack() {
	  
	  Home.clickstackgetstarted();
	  Assert.assertEquals(DriverFactory.getDriver().getTitle(), "Stack");

  }
  
  @Test
  public void getStarted_Linkedlist() {
	  
	  Home.clicklinkedlistgetstarted();
	  Assert.assertEquals(DriverFactory.getDriver().getTitle(), "Linked List");
  }
  
  @Test
  public void getStarted_Queue() {
	  
	  Home.clickqueuegetstarted();
	  Assert.assertEquals(DriverFactory.getDriver().getTitle(), "Queue");
  }
  
  @Test
  public void getStarted_Tree() {
	  
	  Home.clicktreegetstarted();
	  Assert.assertEquals(DriverFactory.getDriver().getTitle(), "Tree");
  }
  
  @Test
  public void getStarted_Graph() {
	  
	  Home.clickgraphgetstarted();
	  Assert.assertEquals(DriverFactory.getDriver().getTitle(), "Graph");
  }
	
}
