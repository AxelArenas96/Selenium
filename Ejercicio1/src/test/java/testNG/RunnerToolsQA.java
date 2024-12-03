package testNG;


import org.testng.annotations.*;

import toolsqa.BaseActions;
import toolsqa.DemoSite;
import toolsqa.Elementos;
import toolsqa.Home;
import toolsqa.Tables;

public class RunnerToolsQA extends BaseActions {
	//clase varibale = nuevo objeto Constructor
	Home home = new Home();
	DemoSite demoSite = new DemoSite();
	Elementos elemento = new Elementos();
	Tables table = new Tables();
	
	
  @BeforeClass //Se ejecuta antes que cualquier cosa
  public void setUpDriver() {
	  setUp();	  
  }
  
  @Test (priority = 1)
  public void navegacion() {
	  System.out.println("Ejecución del primer caso");
	  home.navigateToMainPage();
	  home.clickTutorials();
	  //home.mouseOver();
	  //home.clickJavaButton();
	  home.navigateToKatalonStudio();
	  home.clickKatalonButton();
	  home.clickAndSwitchDemoSite();
	  
  }
  
  @Test (priority = 2, dependsOnMethods = "navegacion", enabled = true)
  public void elemntsCardButton() {
	  System.out.println("Ejecución del segundo caso");
	  demoSite.clickElementsCard();
  }
  
  @Test (priority = 3, dependsOnMethods = "elemntsCardButton", enabled = false)
  public void elements() {
	  System.out.println("Ejecución del tercer caso");
	  elemento.clickTextBox();
	  elemento.userNameText();
	  elemento.userEmailText();
	  elemento.currentAddressText();
	  elemento.permanentAddressText();
	  elemento.submitButton();
  }
  
  @Test (priority = 4, enabled = true)
  public void tables() {
	  table.clickWebTablesButton();
	  table.clickAddUser();
	  table.firstNameSetText();
	  table.lastNameSetText();
	  table.emailSetText();
	  table.ageSetText();
	  table.salarySetText();
	  table.departmentSetText();
	  table.clickSubmitButton();
  }
  
  @AfterClass(alwaysRun = true)
  public void tearDown() {
	  forceDelay(3000);
	  stopDriver();
	  
  }
  
}
