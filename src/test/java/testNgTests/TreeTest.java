package testNgTests;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClass.BaseTest;
import pageobject.Commonpage;
import pageobject.Treepage;

import utilities.configFileReader;
import webdrivermanager.DriverFactory;

public class TreeTest extends BaseTest {
	
	 
	private static String title;
	protected Treepage tree;
	
	@BeforeMethod
	public void Navigation_to_TreePage() {
		
			    tree = new Treepage(DriverFactory.getDriver()); 
			    LoginwithValid();
			    tree.treeGetStartedBtnClick();

	}
//Overview of Tree scenarios	
	
	@Test(priority = 1)
	public void TC_01_OverviewOfTrees() {
		tree.overviewOfTreesClick();
		Assert.assertEquals(tree.getPageTitle(),"Overview of Trees");
		
	}

	@Test(priority = 2)
	public void TC_02_OverviewOfTreesTryHere() {
		tree.overviewOfTreesClick();
		tree.clickTryHereInTree();
		Assert.assertEquals(tree.getPageTitle(),"Assessment");
		
	}
	
	@Test(priority = 3)
	public void TC_03_clickTryHereForEmptyvalue() {
		tree.overviewOfTreesClick();
		common.clickTryHere();
		common.clickRunButton();
		Assert.assertEquals(login.isAlertPresent(), true);
	}
	
	@Test(dataProvider ="TryeditorProvider",priority = 4)
	public void testPythoncodeForOverviewOfTreePage(Map<String, String> data) {
		
		tree.overviewOfTreesClick();
		common.clickTryHere();
		String Pythocode = data.get("Pythoncode");
		common.ValidInvalidtextEditorOperations(Pythocode);
		common.clickRunButton();
		String expectedalert = data.get("ExpectedAlert");
		String expectedResult = data.get("ExpectedResult");
		if(login.isAlertPresent()== true)
		{
		
		String alertmsg =	login.handleAlert();
		Assert.assertEquals(alertmsg ,expectedalert,expectedResult);
		}
		else 
		{
			
			String output = common.getOutput();
			Assert.assertEquals(output ,expectedResult,expectedalert);
			
		} 
		
		
	}
	
	//Terminologies
	
	@Test(priority = 5)
	public void TC_01_Terminologies() {
		tree.TerminologiesClick();
		Assert.assertEquals(tree.getPageTitle(),"Terminologies");
		
	}

	@Test(priority = 6)
	public void TC_02_TerminologiesTryHere() {
		tree.TerminologiesClick();
		tree.clickTryHereInTree();
		Assert.assertEquals(tree.getPageTitle(),"Assessment");
		
	}
	
	
	@Test(dataProvider ="TryeditorProvider",priority = 7)
	public void testPythoncodeForTerminologies(Map<String, String> data) {
		
		tree.TerminologiesClick();
		common.clickTryHere();
		String Pythocode = data.get("Pythoncode");
		common.ValidInvalidtextEditorOperations(Pythocode);
		common.clickRunButton();
		String expectedalert = data.get("ExpectedAlert");
		String expectedResult = data.get("ExpectedResult");
		if(login.isAlertPresent()== true)
		{
		
		String alertmsg =	login.handleAlert();
		Assert.assertEquals(alertmsg ,expectedalert,expectedResult);
		}
		else 
		{
			
			String output = common.getOutput();
			Assert.assertEquals(output ,expectedResult,expectedalert);
			
		} 
		
		
	}
	
	//Types of Trees
	
	@Test(priority = 8)
	public void TC_01_TypesofTreesPage() {
		tree.TypesOfTreesClick();
		Assert.assertEquals(tree.getPageTitle(),"Types of Trees");
		
	}

	@Test(priority = 9)
	public void TC_02_TypesofTreesPagesTryHere() {
		tree.TypesOfTreesClick();
		tree.clickTryHereInTree();
		Assert.assertEquals(tree.getPageTitle(),"Assessment");
		
	}
	
	
	@Test(dataProvider ="TryeditorProvider",priority = 10)
	public void testPythoncodeForTypesofTreesPage(Map<String, String> data) {
		
		tree.TypesOfTreesClick();
		common.clickTryHere();
		String Pythocode = data.get("Pythoncode");
		common.ValidInvalidtextEditorOperations(Pythocode);
		common.clickRunButton();
		String expectedalert = data.get("ExpectedAlert");
		String expectedResult = data.get("ExpectedResult");
		if(login.isAlertPresent()== true)
		{
		
		String alertmsg =	login.handleAlert();
		Assert.assertEquals(alertmsg ,expectedalert,expectedResult);
		}
		else 
		{
			
			String output = common.getOutput();
			Assert.assertEquals(output ,expectedResult,expectedalert);
			
		} 
  }
	
	//Tree Traversals
	@Test(priority = 11)
	public void TC_01_TreeTraversalsPage() {
		tree.TreeTraversalsClick();
		Assert.assertEquals(tree.getPageTitle(),"Tree Traversals");
		
	}

	@Test(priority = 12)
	public void TC_02_TreeTraversalsPageTryHere() {
		tree.TreeTraversalsClick();
		tree.clickTryHereInTree();
		Assert.assertEquals(tree.getPageTitle(),"Assessment");
		
	}
	
	
	@Test(dataProvider ="TryeditorProvider",priority = 13)
	public void testPythoncodeForTreeTraversalsPage(Map<String, String> data) {
		
		tree.TreeTraversalsClick();
		common.clickTryHere();
		String Pythocode = data.get("Pythoncode");
		common.ValidInvalidtextEditorOperations(Pythocode);
		common.clickRunButton();
		String expectedalert = data.get("ExpectedAlert");
		String expectedResult = data.get("ExpectedResult");
		if(login.isAlertPresent()== true)
		{
		
		String alertmsg =	login.handleAlert();
		Assert.assertEquals(alertmsg ,expectedalert,expectedResult);
		}
		else 
		{
			
			String output = common.getOutput();
			Assert.assertEquals(output ,expectedResult,expectedalert);
			
		} 
  }
	
	//Traversals-Illustrations
	
	@Test(priority = 14)
	public void TC_01_TraversalsIllustrationsPage() {
		tree.TraversalillustartionClick();
		Assert.assertEquals(tree.getPageTitle(),"Traversals-Illustration");
		
	}

	@Test(priority = 15)
	public void TC_02_TraversalsIllustrationsPageTryHere() {
		tree.TraversalillustartionClick();
		tree.clickTryHereInTree();
		Assert.assertEquals(tree.getPageTitle(),"Assessment");
		
	}
	
	
	@Test(dataProvider ="TryeditorProvider",priority = 16)
	public void testPythoncodeForTraversalsIllustrationsPage(Map<String, String> data) {
		
		tree.TraversalillustartionClick();
		common.clickTryHere();
		String Pythocode = data.get("Pythoncode");
		common.ValidInvalidtextEditorOperations(Pythocode);
		common.clickRunButton();
		String expectedalert = data.get("ExpectedAlert");
		String expectedResult = data.get("ExpectedResult");
		if(login.isAlertPresent()== true)
		{
		
		String alertmsg =	login.handleAlert();
		Assert.assertEquals(alertmsg ,expectedalert,expectedResult);
		}
		else 
		{
			
			String output = common.getOutput();
			Assert.assertEquals(output ,expectedResult,expectedalert);
			
		} 
  }
	
	//Binary Trees
	
	@Test(priority = 17)
	public void TC_01_BinaryTreesPage() {
		tree.BinaryTreesClick();
		Assert.assertEquals(tree.getPageTitle(),"Binary Trees");
		
	}

	@Test(priority = 18)
	public void TC_02_BinaryTreesPageTryHere() {
		tree.BinaryTreesClick();
		tree.clickTryHereInTree();
		Assert.assertEquals(tree.getPageTitle(),"Assessment");
		
	}
	
	
	@Test(dataProvider ="TryeditorProvider",priority = 19)
	public void testPythoncodeForBinaryTreesPage(Map<String, String> data) {
		
		tree.BinaryTreesClick();
		common.clickTryHere();
		String Pythocode = data.get("Pythoncode");
		common.ValidInvalidtextEditorOperations(Pythocode);
		common.clickRunButton();
		String expectedalert = data.get("ExpectedAlert");
		String expectedResult = data.get("ExpectedResult");
		if(login.isAlertPresent()== true)
		{
		
		String alertmsg =	login.handleAlert();
		Assert.assertEquals(alertmsg ,expectedalert,expectedResult);
		}
		else 
		{
			
			String output = common.getOutput();
			Assert.assertEquals(output ,expectedResult,expectedalert);
			
		} 
  }
	
	//Types of Binary Trees
	
		@Test(priority = 20)
		public void TC_01_TypesOfBinaryTrees() {
			tree.TypesOfBinaryTreesClick();
			Assert.assertEquals(tree.getPageTitle(),"Types of Binary Trees");
			
		}

		@Test(priority = 21)
		public void TC_02_TypesOfBinaryTreesPageTryHere() {
			tree.TypesOfBinaryTreesClick();
			tree.clickTryHereInTree();
			Assert.assertEquals(tree.getPageTitle(),"Assessment");
			
		}
		
		
		@Test(dataProvider ="TryeditorProvider",priority = 22)
		public void testPythoncodeForTypesOfBinaryTreesPage(Map<String, String> data) {
			
			tree.TypesOfBinaryTreesClick();
			common.clickTryHere();
			String Pythocode = data.get("Pythoncode");
			common.ValidInvalidtextEditorOperations(Pythocode);
			common.clickRunButton();
			String expectedalert = data.get("ExpectedAlert");
			String expectedResult = data.get("ExpectedResult");
			if(login.isAlertPresent()== true)
			{
			
			String alertmsg =	login.handleAlert();
			Assert.assertEquals(alertmsg ,expectedalert,expectedResult);
			}
			else 
			{
				
				String output = common.getOutput();
				Assert.assertEquals(output ,expectedResult,expectedalert);
				
			} 
	  }
		
//Implementation in Python
		@Test(priority = 23)
		public void TC_01_ImplementationinPython() {
			tree.ImplementationInPythonClick();
			Assert.assertEquals(tree.getPageTitle(),"Implementation in Python");
			
		}

		@Test(priority = 24)
		public void TC_02_ImplementationinPythonPageTryHere() {
			tree.ImplementationInPythonClick();
			tree.clickTryHereInTree();
			Assert.assertEquals(tree.getPageTitle(),"Assessment");
			
		}
		
		
		@Test(dataProvider ="TryeditorProvider",priority = 25)
		public void testPythoncodeForImplementationinPythonPage(Map<String, String> data) {
			
			tree.ImplementationInPythonClick();
			common.clickTryHere();
			String Pythocode = data.get("Pythoncode");
			common.ValidInvalidtextEditorOperations(Pythocode);
			common.clickRunButton();
			String expectedalert = data.get("ExpectedAlert");
			String expectedResult = data.get("ExpectedResult");
			if(login.isAlertPresent()== true)
			{
			
			String alertmsg =	login.handleAlert();
			Assert.assertEquals(alertmsg ,expectedalert,expectedResult);
			}
			else 
			{
				
				String output = common.getOutput();
				Assert.assertEquals(output ,expectedResult,expectedalert);
				
			} 
	  }
//Binary Tree Traversals
		
		@Test(priority = 26)
		public void TC_01_BinaryTreeTraversals() {
			tree.BinaryTreeTraversalsClick();
			Assert.assertEquals(tree.getPageTitle(),"Binary Tree Traversals");
			
		}

		@Test(priority = 27)
		public void TC_02_BinaryTreeTraversalsPageTryHere() {
			tree.BinaryTreeTraversalsClick();
			tree.clickTryHereInTree();
			Assert.assertEquals(tree.getPageTitle(),"Assessment");
			
		}
		
		
		@Test(dataProvider ="TryeditorProvider",priority = 28)
		public void testPythoncodeForBinaryTreeTraversalsPage(Map<String, String> data) {
			
			tree.BinaryTreeTraversalsClick();
			common.clickTryHere();
			String Pythocode = data.get("Pythoncode");
			common.ValidInvalidtextEditorOperations(Pythocode);
			common.clickRunButton();
			String expectedalert = data.get("ExpectedAlert");
			String expectedResult = data.get("ExpectedResult");
			if(login.isAlertPresent()== true)
			{
			
			String alertmsg =	login.handleAlert();
			Assert.assertEquals(alertmsg ,expectedalert,expectedResult);
			}
			else 
			{
				
				String output = common.getOutput();
				Assert.assertEquals(output ,expectedResult,expectedalert);
				
			} 
	  }
 //Implementation of Binary Trees
		
		@Test(priority = 29)
		public void TC_01_ImplementationofBinaryTrees() {
			tree.implementationOfBinaryTreesClick();
			Assert.assertEquals(tree.getPageTitle(),"Implementation of Binary Trees");
			
		}

		@Test(priority = 30)
		public void TC_02_ImplementationofBinaryTreesPageTryHere() {
			tree.implementationOfBinaryTreesClick();
			tree.clickTryHereInTree();
			Assert.assertEquals(tree.getPageTitle(),"Assessment");
			
		}
		
		
		@Test(dataProvider ="TryeditorProvider",priority = 31)
		public void testPythoncodeForImplementationofBinaryTreesPage(Map<String, String> data) {
			
			tree.implementationOfBinaryTreesClick();
			common.clickTryHere();
			String Pythocode = data.get("Pythoncode");
			common.ValidInvalidtextEditorOperations(Pythocode);
			common.clickRunButton();
			String expectedalert = data.get("ExpectedAlert");
			String expectedResult = data.get("ExpectedResult");
			if(login.isAlertPresent()== true)
			{
			
			String alertmsg =	login.handleAlert();
			Assert.assertEquals(alertmsg ,expectedalert,expectedResult);
			}
			else 
			{
				
				String output = common.getOutput();
				Assert.assertEquals(output ,expectedResult,expectedalert);
				
			} 
	  }
//Applications of Binary trees
		
		@Test(priority = 32)
		public void TC_01_ApplicationsofBinarytrees() {
			tree.applicationOfBinaryTreesClick();
			Assert.assertEquals(tree.getPageTitle(),"Applications of Binary trees");
			
		}

		@Test(priority = 33)
		public void TC_02_ApplicationsofBinarytreesPageTryHere() {
			tree.applicationOfBinaryTreesClick();
			tree.clickTryHereInTree();
			Assert.assertEquals(tree.getPageTitle(),"Assessment");
			
		}
		
		
		@Test(dataProvider ="TryeditorProvider",priority = 34)
		public void testPythoncodeForApplicationsofBinarytreesPage(Map<String, String> data) {
			
			tree.applicationOfBinaryTreesClick();
			common.clickTryHere();
			String Pythocode = data.get("Pythoncode");
			common.ValidInvalidtextEditorOperations(Pythocode);
			common.clickRunButton();
			String expectedalert = data.get("ExpectedAlert");
			String expectedResult = data.get("ExpectedResult");
			if(login.isAlertPresent()== true)
			{
			
			String alertmsg =	login.handleAlert();
			Assert.assertEquals(alertmsg ,expectedalert,expectedResult);
			}
			else 
			{
				
				String output = common.getOutput();
				Assert.assertEquals(output ,expectedResult,expectedalert);
				
			} 
	  }
//Binary Search Trees
		@Test(priority = 35)
		public void TC_01_BinarySearchTrees() {
			tree.BinarySearchTreesClick();
			Assert.assertEquals(tree.getPageTitle(),"Binary Search Trees");
			
		}

		@Test(priority = 36)
		public void TC_02_BinarySearchTreesPageTryHere() {
			tree.BinarySearchTreesClick();
			tree.clickTryHereInTree();
			Assert.assertEquals(tree.getPageTitle(),"Assessment");
			
		}
		
		
		@Test(dataProvider ="TryeditorProvider",priority = 37)
		public void testPythoncodeForBinarySearchTreesPage(Map<String, String> data) {
			
			tree.BinarySearchTreesClick();
			common.clickTryHere();
			String Pythocode = data.get("Pythoncode");
			common.ValidInvalidtextEditorOperations(Pythocode);
			common.clickRunButton();
			String expectedalert = data.get("ExpectedAlert");
			String expectedResult = data.get("ExpectedResult");
			if(login.isAlertPresent()== true)
			{
			
			String alertmsg =	login.handleAlert();
			Assert.assertEquals(alertmsg ,expectedalert,expectedResult);
			}
			else 
			{
				
				String output = common.getOutput();
				Assert.assertEquals(output ,expectedResult,expectedalert);
				
			} 
	  }
	//Implementation Of BST
		@Test(priority = 38)
		public void TC_01_ImplementationOfBST() {
			tree.implementationOfBstClick();
			Assert.assertEquals(tree.getPageTitle(),"Implementation Of BST");
			
		}

		@Test(priority = 39)
		public void TC_02_ImplementationOfBSTPageTryHere() {
			tree.implementationOfBstClick();
			tree.clickTryHereInTree();
			Assert.assertEquals(tree.getPageTitle(),"Assessment");
			
		}
		
		
		@Test(dataProvider ="TryeditorProvider",priority = 40)
		public void testPythoncodeForImplementationOfBSTPage(Map<String, String> data) {
			
			tree.implementationOfBstClick();
			common.clickTryHere();
			String Pythocode = data.get("Pythoncode");
			common.ValidInvalidtextEditorOperations(Pythocode);
			common.clickRunButton();
			String expectedalert = data.get("ExpectedAlert");
			String expectedResult = data.get("ExpectedResult");
			if(login.isAlertPresent()== true)
			{
			
			String alertmsg =	login.handleAlert();
			Assert.assertEquals(alertmsg ,expectedalert,expectedResult);
			}
			else 
			{
				
				String output = common.getOutput();
				Assert.assertEquals(output ,expectedResult,expectedalert);
				
			} 
	  }
		
	// Practice Questions 
		
		@Test(priority = 41)
		public void TC_PracticeQuestions () {
			tree.implementationOfBstClick();
			tree.practiceQuestionsClick();
			Assert.assertEquals(tree.getPageTitle(),"Practice Questions");
			
		}
}

