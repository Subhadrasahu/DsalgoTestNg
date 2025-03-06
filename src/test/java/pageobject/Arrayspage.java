package pageobject;



   import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

	public class Arrayspage {
		
		private WebDriver driver ;
		

		 //locators
	     By ArraysGetStarted =By.xpath("//a[@href='array']");
	     By ArraysinPython =By.xpath("//a[text()='Arrays in Python']");
	     By ArraysUsingList=By.xpath("//a[text()='Arrays Using List']");
	     By BasicOperationsinLists=By.xpath("//a[text()='Basic Operations in Lists']");
	     By ApplicationsofArray=By.xpath("//a[text()='Applications of Array']");
	     By PracticeQuestions=By.xpath("//a[text()='Practice Questions']");
	     By Searchthearray=By.xpath("//a[text()='Search the array']");
	     By Tryeditor=By.xpath("//span[@class='cm-variable']");
	     By run=By.xpath("//button[text()='Run']");
	    By submit=By.xpath("//input[@class='button' and @value='Submit']");
	    ////input[@class='button']
	    By submitmsg = By.id("output");
	    By output=By.xpath("//pre[@id='output']");
	     By MaxConsecutiveOnes=By.xpath("//a[text()='Max Consecutive Ones']");
         By FindNumberswithEvenNumberofDigits=By.xpath("//a[text()='Find Numbers with Even Number of Digits']");
	     By SquaresofaSortedArray = By.xpath("//a[text()='Squares of  a Sorted Array']");
	    
	     //By submitbutton=By.xpath("//input[@type='submit' and @value='Submit']");


	     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	     		

		public Arrayspage(WebDriver driver) {
	 		this.driver=driver;
	 	}
	     
	  // Methods
		

	     // Home Page
	     public String getHomePageTitle() {
	         return driver.getTitle();
	     }
	     
	     public  void clickArraysGetStartedbutton() {
				driver.findElement(ArraysGetStarted).click();
	            }
	   
	     public String getArraysPageTitle() {
	         return driver.getTitle();
	     }
	     
	    	 
	     public void clickArraysinPython() {
	         driver.findElement(ArraysinPython).click();
			
	     }
	     
	     public String  getArraysinPythonTittle() {
	    	return  driver.getTitle();
	     }
	    	 

	  
	     /*public void enterPythonCode(String pythonCode) {
	         //driver.findElement(tryEditor).sendKeys(pythonCode);
	     	 
	         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	         WebElement codeMirror = wait.until(ExpectedConditions.visibilityOfElementLocated(tryeditor));

	         // Simulate typing in the editor
	         try {
	         	
	         Actions actions = new Actions(driver);
	         actions.moveToElement(codeMirror).click().sendKeys(pythonCode).perform();
	         boolean alertHandled = false;
	 		if (!alertHandled) {
	 			  Alert alert = driver.switchTo().alert();         
	             alert.accept();
	            System.out.println(alert.getText());
	         }
	         } catch (NoAlertPresentException e) {
	             System.out.println("No alert was triggered.");
	         }

	     }*/
	     private void makeElementVisible(WebElement element) {
	         JavascriptExecutor js = (JavascriptExecutor) driver;
	         js.executeScript("arguments[0].style.display='block';", element);  // Make element visible
	     }
	     
	    
	    public void getarraypracticecode(String pythoncode) {
	    	 WebElement edit = driver.findElement(By.xpath("//div[@class='input']//textarea[@id='editor']"));
	    	 makeElementVisible(edit);

	         // Wait until the textarea is interactable
	         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	         wait.until(ExpectedConditions.elementToBeClickable(edit));

	         // Clear any existing text
	         edit.clear();

	         // Use Actions to send the Python code
	         Actions actions = new Actions(driver);
	         actions.moveToElement(edit).click().sendKeys(pythoncode).perform(); 
	    }

	    public void clickArraysUsingList() {
	        driver.findElement(ArraysUsingList).click();
	    }
	    
	    public String  getArraysUsingListTittle() {
	    	return  driver.getTitle();
	     }


	     public void clickBasicOperationsinLists() {
	         driver.findElement(BasicOperationsinLists).click();
	     }
	     
	     public String  getBasicOperationsinListsTittle() {
		    	return  driver.getTitle();
		     }
	     
	     public void  clickApplicationsofArray() {
	         driver.findElement(ApplicationsofArray).click();
	     }
	     
	     public String  getApplicationsofArrayTitle() {
		    	return  driver.getTitle();
		     }

	     public void clickPracticeQuestions() {
	         driver.findElement(PracticeQuestions).click();
	     }
	    
	      public String getPracticeQuestionspageTitle() {
				return driver.getTitle();
			}
	     
	     public boolean isQuestionspage() {
			 return driver.findElement(PracticeQuestions).isDisplayed();
		}

	     public void clickSearchtheArray() {
	         driver.findElement(Searchthearray).click();
	         
	     }
	     public String getSearchtheArary() {
	    	 return driver.findElement(Searchthearray).getText();
	     }
	     
	      
        /*   public void EnterPythonCode(String pythonCode) {
	    	 WebElement editor = driver.findElement(Tryeditor);
	         editor.clear();
	         editor.sendKeys(pythonCode);
	     }
	    
	     public boolean isRunButton() {
			 return driver.findElement(run).isDisplayed();
		}
	     
	     public boolean isSubmitButton() {
			 return driver.findElement(submit).isDisplayed();
		}
	     
	     public boolean isTryeditor() {
			 return driver.findElement(Tryeditor).isDisplayed();
		}*/
	     
	      public void clickRun() {
	         driver.findElement(run).click();
	     }

	     public void clickSubmit() {
	         driver.findElement(submit).click();
	     }

	     public String getOutputText() {
	         return driver.findElement(output).getText();
	     }
	     
	     public String getSubmissionMessage() {
	    	 
	    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    	    // Wait until the element is visible
	    	    wait.until(ExpectedConditions.visibilityOfElementLocated(submitmsg));
	    	   
	    	 return driver.findElement(submitmsg).getText(); 
	    	 }
	     
	     public String getAlertMessage() {
	         Alert alert = driver.switchTo().alert();
	         String alertText = alert.getText();
	         alert.accept();
	         return alertText;
	   
	     }
	    /* public String getsyntaxAlertMessage() {
	    	 Alert syntaxAlert = driver.switchTo().alert();
             String syntaxText = syntaxAlert.getText();
             syntaxAlert.accept();
             return syntaxText;
	     }*/
	     public void clickMaxConsecutiveOnes() {
	         driver.findElement(MaxConsecutiveOnes).click();
	     }
	     public String getMaxConsecutiveOnes() {
	    	 return driver.findElement(MaxConsecutiveOnes).getText();
	     }
	


          public void clickFindNumbersWithEvenNumberOfDigits() {
	         driver.findElement(FindNumberswithEvenNumberofDigits).click();
	     }
          public String getFindNumbersWithEvenNumberOfDigits() {
 	    	 return driver.findElement(FindNumberswithEvenNumberofDigits).getText();
 	     }
          
	     public void clickSquaresofaSortedArray() {
	    	 driver.findElement(SquaresofaSortedArray).click();
	     
		}
	     public String getSquaresofaSortedArray() {
 	    	 return driver.findElement(SquaresofaSortedArray).getText();
 	     }

	}

		

		

		

		
			
		

		
	 

	   

