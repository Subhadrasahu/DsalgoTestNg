package BaseClass;

import java.io.IOException;
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

import pageobject.Homepage;
import pageobject.LoginPage;
import utilities.ExcelfileReader;
import utilities.configFileReader;
import webdrivermanager.DriverFactory;

public class BaseTest {
	
	
	private DriverFactory driverFactory = new DriverFactory();
	private configFileReader configReader=new configFileReader();
	Properties prop;
	protected LoginPage login;
	protected Homepage Home;
	public Logger logger;
	
	
	public void beforeScenario(String browsername) {
	 prop =configReader.init_prop();
	//String browsername=prop.getProperty("browser");
	 //String Browsername =configReader.getBrowser();
	 //configReader.setBrowserType(browsername);
	String urlname=prop.getProperty("url");
	driverFactory = new DriverFactory();
    driverFactory.init_driver(browsername);
    DriverFactory.getDriver().get(urlname);
	 //Logger.info("===== Starting Scenario: " + scenario.getName() + " =====");
	
}	
	
	@BeforeMethod
	@Parameters("browser")
	public void setup(String browsername) {
		 prop =configFileReader.init_prop();
		String urlname=prop.getProperty("url");
		driverFactory.init_driver(browsername);
		driverFactory.getDriver().get(urlname);
	    login = new LoginPage(DriverFactory.getDriver());
	    //login.clickGetStartedbutton();
	    Home = new Homepage(DriverFactory.getDriver());
		
	}
	
	@AfterMethod
    public void tearDown() {
		
		driverFactory .quitDriver();
    }
    @Test
	public void LoginwithValid() {
		
		login.clickGetStartedbutton();
		login.SignInBtn();
		String username = prop.getProperty("username");
		login.setUsername(username);
		String password = prop.getProperty("password");
		login.setPassword(password);
		login.clickLoginButton();
	}
    
  
    @DataProvider(name = "loginDataProvider")
    public Object[][] getExcelData() throws InvalidFormatException, IOException {
    	//prop =configFileReader.init_prop();
   	 ExcelfileReader reader = new ExcelfileReader();
   	 String filepath = configReader.getProperty("FilePath");
   	 String sheetname = configReader.getProperty("sheetName");
   	 List<Map<String, String>> excelData = reader.getData(filepath, sheetname);
   	 
   	 System.out.println("Exceldata" + excelData.size());
   	 
   	 return	 convertListTo2DArray(excelData);
    }
    
    public Object[][] convertListTo2DArray(List<Map<String, String>> list) {
        Object[][] data = new Object[list.size()][1];
        for (int i = 0; i < list.size(); i++) {
            data[i][0] = list.get(i); // Each row gets one Map
        }
        System.out.println("data" + data.length);
        return data;
    }
    
}
