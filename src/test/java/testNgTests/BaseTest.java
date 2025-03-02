package testNgTests;

import java.util.Properties;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import pageobject.Homepage;
import pageobject.LoginPage;
import utilities.configFileReader;
import webdrivermanager.DriverFactory;

public class BaseTest {
	
	
	private DriverFactory driverFactory = new DriverFactory();
	private configFileReader configReader=new configFileReader();
	Properties prop;
	LoginPage login;
	Homepage Home;
	
	
	
	public void beforeScenario(String browsername) {
	 prop =configReader.init_prop();
	//String browsername=prop.getProperty("browser");
	 //String Browsername =configReader.getBrowser();
	 //configReader.setBrowserType(browsername);
	String urlname=prop.getProperty("url");
	driverFactory = new DriverFactory();
    driverFactory.init_driver(browsername);
	DriverFactory.getDriver().get(urlname);
	 //LoggerLoad.info("===== Starting Scenario: " + scenario.getName() + " =====");
	
}	
	
	@BeforeMethod
	@Parameters("browser")
	public void setup(String browsername) {
		 prop =configFileReader.init_prop();
		String urlname=prop.getProperty("url");
		driverFactory.init_driver(browsername);
		driverFactory.getDriver().get(urlname);
	    login = new LoginPage(driverFactory.getDriver());
	    //login.clickGetStartedbutton();
	    Home = new Homepage(driverFactory.getDriver());
		
	}
	
	@AfterMethod
    public void tearDown() {
		
		driverFactory .quitDriver();
    }

}
