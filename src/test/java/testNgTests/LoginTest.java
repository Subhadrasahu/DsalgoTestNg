package testNgTests;

import java.io.IOException;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseClass.BaseTest;
import utilities.DataProviders;
import utilities.LoggerLoad;
import webdrivermanager.DriverFactory;

public class LoginTest extends BaseTest {
		
//	@BeforeMethod
//	public void login() {
//		
//		LoginwithValid();
//	}

 
 @Test(dataProvider = "loginDataProvider", dataProviderClass = DataProviders.class , groups="Dataprovider")
 public void Logintest(Map<String, String> data) throws InvalidFormatException, IOException {
     login.clickGetStartedbutton();
     login.SignInBtn();

     // Retrieve test data from the Map passed as the parameter
     String username = data.get("Username");
     String password = data.get("Password");
     String expectedMsg = data.get("Expected message");

     // Perform login actions
     login.setUsername(username);
     login.setPassword(password);
     login.clickLoginButton();

     // Capture the actual error message or success message
     String actualMsg = login.getErrorMessage();

     Assert.assertEquals(actualMsg, expectedMsg, "Expected message did not match for user: " + username);
     LoggerLoad.info("login with valid and invalid username and password values");
 }

 @Test
 public void checkEmptyUserField() {
	 login.SignInBtn();
	boolean isRequired = login.getalertforemptyusernamefield();
	
	Assert.assertTrue(isRequired,"Username field is required ");
	LoggerLoad.info("username field is required");
 }
 
 @Test
 public void checkEmptyPasswordField() {
	 login.SignInBtn();
	 boolean isRequired = login.getalertforemptypasswordfield();
	 Assert.assertTrue(isRequired,"Password field is required ");
	 LoggerLoad.info("password field is required");
 }

  @Test
  public void GetStarted_DS() {
	  LoginwithValid();
	  Home.clickDSintrogetstarted();
	  Assert.assertEquals(DriverFactory.getDriver().getTitle(), "Data Structures-Introduction");
  }
  
  @Test
  public void getStarted_Array() {
	  LoginwithValid();
	  Home.clickarraygetstarted();
	  Assert.assertEquals(DriverFactory.getDriver().getTitle(), "Array");
	  LoggerLoad.info("user should land on array page");
	  
  }
  
  @Test
  public void getStarted_Stack() {
	  LoginwithValid();
	  Home.clickstackgetstarted();
	  Assert.assertEquals(DriverFactory.getDriver().getTitle(), "Stack");
	  LoggerLoad.info("user should land on stack page");
  }
  
  @Test
  public void getStarted_Linkedlist() {
	  LoginwithValid();
	  Home.clicklinkedlistgetstarted();
	  Assert.assertEquals(DriverFactory.getDriver().getTitle(), "Linked List");
	  LoggerLoad.info("user should land on Linked List page");
  }
  
  @Test
  public void getStarted_Queue() {
	  LoginwithValid();
	  Home.clickqueuegetstarted();
	  Assert.assertEquals(DriverFactory.getDriver().getTitle(), "Queue");
	  LoggerLoad.info("user should land on Queue page");
  }
  
  @Test
  public void getStarted_Tree() {
	  LoginwithValid();
	  Home.clicktreegetstarted();
	  Assert.assertEquals(DriverFactory.getDriver().getTitle(), "Tree");
	  LoggerLoad.info("user should land on Tree page");
  }
  
  @Test
  public void getStarted_Graph() {
	  LoginwithValid();
	  Home.clickgraphgetstarted();
	  Assert.assertEquals(DriverFactory.getDriver().getTitle(), "Graph");
	  LoggerLoad.info("user should land on Graph page");
  }
	
  
}
