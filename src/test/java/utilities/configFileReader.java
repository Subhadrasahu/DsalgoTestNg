package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class configFileReader {
	
	public static Properties prop;
	private static String browserType;
	
	public Properties init_prop() {
		prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream("src\\test\\resources\\Confg\\confg.properties");
				prop.load(ip);
			}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop;
		
		
	}

  public String getBrowser() {
	 browserType = prop.getProperty("browser");
	return browserType;
	  
  }
  
  public static void setBrowserType(String browser) {
	   
	  try {
		browser =browserType;
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
  }

}
