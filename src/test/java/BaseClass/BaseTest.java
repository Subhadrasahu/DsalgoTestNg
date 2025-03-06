package BaseClass;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.apache.logging.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageobject.Commonpage;
import pageobject.Homepage;
import pageobject.LoginPage;
import utilities.ExcelfileReader;
import utilities.LoggerLoad;
import utilities.configFileReader;
import webdrivermanager.DriverFactory;

public class BaseTest {
	
	
	private DriverFactory driverFactory = new DriverFactory();
	private configFileReader configReader=new configFileReader();
	Properties prop;
	protected LoginPage login;
	protected Homepage Home;
	public Logger logger;
	protected Commonpage common;
	
	
	
	@BeforeMethod(alwaysRun = true)
	@Parameters("browser")
	public void setup(String browsername) {
		 prop =configFileReader.init_prop();
		String urlname=prop.getProperty("url");
		driverFactory.init_driver(browsername);
		driverFactory.getDriver().get(urlname);
	    login = new LoginPage(DriverFactory.getDriver());
	    login.clickGetStartedbutton();
	    Home = new Homepage(DriverFactory.getDriver());
	    common = new Commonpage(DriverFactory.getDriver());
	    LoggerLoad.info("user landed on ds algo portal");
	    
		
	}
	
	@AfterMethod(alwaysRun = true)
    public void tearDown() {
		
		driverFactory .quitDriver();
    }
	
    //@Test
	public void LoginwithValid() {
		
		//login.clickGetStartedbutton();
		login.SignInBtn();
		String username = prop.getProperty("username");
		login.setUsername(username);
		String password = prop.getProperty("password");
		login.setPassword(password);
		login.clickLoginButton();
		LoggerLoad.info("user logged into ds-algo application");
	}
    
    public Object[][] convertListTo2DArray(List<Map<String, String>> list) {
        Object[][] data = new Object[list.size()][1];
        for (int i = 0; i < list.size(); i++) {
            data[i][0] = list.get(i); // Each row gets one Map
        }
        //System.out.println("data" + data.length);
        return data;
    }
    
    @DataProvider(name="TryeditorProvider")
    public Object[][] getPythonData() throws InvalidFormatException, IOException{
    	ExcelfileReader reader = new ExcelfileReader();
    	 String filepath = configReader.getProperty("FilePath");
       	 String sheetname  = configReader.getProperty("tryeditorSheet");
       	List<Map<String, String>> excelData = reader.getData(filepath, sheetname);
       	 return	 convertListTo2DArray(excelData);
    	
    }
    
}
