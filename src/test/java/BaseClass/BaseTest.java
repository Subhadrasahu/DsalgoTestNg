package BaseClass;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import pageobject.Commonpage;
import pageobject.Homepage;
import pageobject.LoginPage;
import utilities.ExcelfileReader;
import utilities.LoggerLoad;
import utilities.configFileReader;
import webdrivermanager.DriverFactory;

public class BaseTest {

	private DriverFactory driverFactory = new DriverFactory();
	private configFileReader configReader = new configFileReader();
	Properties prop;
	protected LoginPage login;
	protected Homepage Home;
	public Logger logger;
	protected Commonpage common;
	protected static WebDriver driver;

	@BeforeMethod//(alwaysRun = true)
	//@Parameters("browser")
	public void setup(@Optional String browserName) {
		prop = configReader.init_prop();
		String urlName = prop.getProperty("url");
        browserName = prop.getProperty("browser");
		driver = driverFactory.init_driver(browserName); // Initialize WebDriver here
		driver.get(urlName);

		login = new LoginPage(driver);
		login.clickGetStartedbutton();
		Home = new Homepage(driver);
		common = new Commonpage(driver);

		LoggerLoad.info("User landed on DS Algo portal");
	}

	@AfterMethod//(alwaysRun = true)
	public void tearDown() {
		driverFactory.quitDriver();
	}

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
		return data;
	}

	@DataProvider(name = "TryeditorProvider")
	public Object[][] getPythonData() throws InvalidFormatException, IOException {
		ExcelfileReader reader = new ExcelfileReader();
		String filePath = configReader.getProperty("FilePath");
		String sheetName = configReader.getProperty("tryeditorSheet");
		List<Map<String, String>> excelData = reader.getData(filePath, sheetName);
		return convertListTo2DArray(excelData);
	}

	// Capture screenshot method
//	public static String getScreenShot(String testName) {
//		// Ensure the driver is a WebDriver instance
//		if (driver instanceof TakesScreenshot) {
//			TakesScreenshot ts = (TakesScreenshot) driver;
//			File src = ts.getScreenshotAs(OutputType.FILE);
//
//			// Define the directory and timestamp
//			String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
//			String screenshotPath = System.getProperty("user.dir") + "/test-output/screenshots/" + testName + "_"
//					+ timestamp + ".png";
//
//			// Ensure the directory exists
//			File directory = new File(System.getProperty("user.dir") + "/test-output/screenshots/");
//			if (!directory.exists()) {
//				directory.mkdirs(); // Create the directory if it doesn't exist
//			}
//
//			try {
//				FileUtils.copyFile(src, new File(screenshotPath));
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//			return screenshotPath;
//		}
//		return null;
//	}
	

}
