package testNgTests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import BaseClass.BaseTest;
import pageobject.Registrationpage;

public class Registration extends BaseTest{
	
public Registrationpage Register;
	
	@BeforeMethod
	public void clickGetstarted() {
		
		login.clickGetStartedbutton();
	Register= new Registrationpage(DriverFactory.getDriver());
	} 
	
	
@Test
	public void navigatetiRegistration() {
		Home.clickRegisterButton();
		Assert.assertEquals(Home.getregistrationpagetitle(), "Registration");
	}

    @Test
    public void testEmptyFieldRegistration() {
    	Home.clickRegisterButton();
        Register.clickregisteremptyfields();
        Assert.assertTrue(Register.getalertmessage(), "Please fill out this field");
    }

    @Test
    public void testMismatchedPassword() {
    	Home.clickRegisterButton();
        Register.mismatchpassword();
        String errorMsg = Register.mismatchpassworderror();
        //Assert.assertEquals(errorMsg,"Your password can’t be entirely numeric.");
       Assert.assertEquals(errorMsg, "Passwords do not match", "Please fill out this field");
    }

   @Test
    public void testExistingUser() {
	   Home.clickRegisterButton();
       Register.existinguser();
        String errorMsg = Register.existingusererror();
       Assert.assertEquals(errorMsg, "existing user");
        //Assert.assertEquals(errorMsg,"password_mismatch:The two password fields didn’t match.");
    }
   
   @Test
   public void testRedirectToLoginPage() {
       Register.clickSignInButton();
       String signInPageTitle = Register.getsignpagetitle();
       Assert.assertEquals(signInPageTitle, "Login");
   }

    @Test
    public void testValidRegistration() {
    	Home.clickRegisterButton();
        Register.validregister();
        String successMsg = Register.successregistrationmsg();
        String userid = Register.userid();
		Assert.assertEquals(successMsg, ("New Account Created. You are logged in as "+ userid.toLowerCase()));
    }

    @Test
    public void testUserIdDisplay() {
        Home.clickRegisterButton();
        String userId = Register.userid();
        Assert.assertNotNull(userId, "User ID not displayed after successful registration");
    }

}
