package utilities;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;

public class DataProviders {
	
	ExcelfileReader reader;
	
	@DataProvider(name = "loginDataProvider")
    public Object[][] getExcelData() throws InvalidFormatException, IOException {
		Properties prop =configFileReader.init_prop();
	 reader = new ExcelfileReader();
   	 String filepath = configFileReader.getProperty("FilePath");
   	 String sheetname  = configFileReader.getProperty("sheetNames");
   	List<Map<String, String>> excelData = reader.getData(filepath, sheetname);
   	
   	 return	 convertListTo2DArray(excelData);
    }
    
    public Object[][] convertListTo2DArray(List<Map<String, String>> list) {
    	
        Object[][] data = new Object[list.size()][1];
        for (int i = 0; i < list.size(); i++) {
            data[i][0] = list.get(i); // Each row gets one Map
        }
        //System.out.println("data" + data.length);
        return data;
    }
    
    @DataProvider(name= "Array_paracticeQuestions")
    public Object[][]  getarrayQuestionsData() throws InvalidFormatException, IOException {
       Properties prop =configFileReader.init_prop();
    	ExcelfileReader reader = new ExcelfileReader();
   	 String filepath = configFileReader.getProperty("FilePath");
   	 String sheetname  = configFileReader.getProperty("arraysheet");
   	List<Map<String, String>> excelData = reader.getData(filepath, sheetname);
    return	 convertListTo2DArray(excelData);	
    	
    }
    
}
