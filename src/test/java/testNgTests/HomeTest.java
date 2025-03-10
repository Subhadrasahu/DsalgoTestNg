package testNgTests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClass.BaseTest;
import utilities.LoggerLoad;
import webdrivermanager.DriverFactory;

public class HomeTest extends BaseTest{
	
	@BeforeMethod
	public void clickGetstarted() {
		
		login.clickGetStartedbutton();
	}
	
	@Test
	public void DS_Introduction() {
		
		//login.clickGetStartedbutton();
		Home.clickDSintrogetstarted();
		Assert.assertEquals(Home.getErrorMessage(), "You are not logged in");
		LoggerLoad.info("user should see alert message when user not logged in to application");
	}
	
	@Test
	public void Array() {
		
		//login.clickGetStartedbutton();
		Home.clickarraygetstarted();
		Assert.assertEquals(Home.getErrorMessage(), "You are not logged in");
		LoggerLoad.info("user should see alert message when user not logged in to application");
	}
    @Test
	public void Linked_List() {
		
		Home.clicklinkedlistgetstarted();
		Assert.assertEquals(Home.getErrorMessage(), "You are not logged in");
		LoggerLoad.info("user should see alert message when user not logged in to application");
	}
	
    @Test
	public void Stack() {
		
		Home.clickstackgetstarted();
		Assert.assertEquals(Home.getErrorMessage(), "You are not logged in");
		LoggerLoad.info("user should see alert message when user not logged in to application");
	}
    @Test
	public void Queue() {
		
		Home.clickqueuegetstarted();
		Assert.assertEquals(Home.getErrorMessage(), "You are not logged in");
		LoggerLoad.info("user should see alert message when user not logged in to application");
	}
    @Test
	public void Tree() {
		
		Home.clicktreegetstarted();
		Assert.assertEquals(Home.getErrorMessage(), "You are not logged in");
		LoggerLoad.info("user should see alert message when user not logged in to application");
	}
    @Test
	public void graph() {
		Home.clickgraphgetstarted();
		Assert.assertEquals(Home.getErrorMessage(), "You are not logged in");
		LoggerLoad.info("user should see alert message when user not logged in to application");
	}
    @Test
	public void register() {
		
		Home.clickRegisterButton();
		Assert.assertEquals(DriverFactory.getDriver().getTitle(), "Registration");
		LoggerLoad.info("user should land on registration page");
	}
    @Test
	public void signIn() {
		
		Home.clickSignInButton();
		Assert.assertEquals(DriverFactory.getDriver().getTitle(), "Login");
		LoggerLoad.info("user should land on login page");

	}
    
    @Test
    public void DataStructure_DropDown() {
    	
    	Home.clickDSdropdown();
    	int count = Home.getDropdownItemCount();
    	Assert.assertEquals(count , 7);
    	LoggerLoad.info("user should able to see all 7 module options in DropDown");
    	
    	
    }
}
