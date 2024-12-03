package toolsqa;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Pause;

public class Home extends BaseActions{
	String urlHome = "https://www.toolsqa.com/";
	private By tutorialsButton = By.xpath("//*[text() = \"Tutorials\"][contains(@class, \"navbar\")]");
	private By progrLanguageLabel = By.xpath(" //*[text() = \"Programming Language\"]");
	private By javaButton = By.xpath("(//*[@title = \"Java\"])[2]");
	private By frontEndButton = By.xpath("//span[contains(text(), \"Front-End\")]");
	private By katalonButton = By.xpath("(//*[@title = \"Katalon Studio\"])[2]");
	private By demoSiteButton = By.xpath("(//*[text() = \"Demo Site\"][@rel = \"noopener\"])[1]");
	
	
	
	
	//METODOS////////////
	
	
	public void navigateToMainPage() {
		forceDelay(1500);
		goToPage(urlHome);
		
	}
	
	public void clickTutorials() {
		clickButton(tutorialsButton);
	}
	
	public void navigateToKatalonStudio() {
		Actions action = new Actions(driver);
		action.moveToElement(convertBytoWebElement(frontEndButton)).perform();
		action.moveToElement(convertBytoWebElement(katalonButton)).perform();
	}
	public void clickKatalonButton() {
		clickButton(katalonButton);
	}
	
	public void clickAndSwitchDemoSite() {
		clickButton(demoSiteButton);
		Set<String> cantidadDeTabs = driver.getWindowHandles();
		System.out.println("Cantidad de Tabs: " + cantidadDeTabs.size());
		String idTabs = cantidadDeTabs.toString();
		idTabs = idTabs.replace("[", "");
		idTabs = idTabs.replace("]", "");
		idTabs = idTabs.replace(" ", "");
		String idTabsSplit[] = idTabs.split(",");
		for(int i = 0; i < idTabsSplit.length; i++) {
			System.out.println("Mi identificador esta en la posicion: " + i + " y el idTab es: " + idTabsSplit[i]);
			driver.switchTo().window(idTabsSplit[i]); //cambiar de Pestaña o tab
			System.out.println("Nombre de la pagina actual: " + driver.getTitle());
		}
		
		
//		for(int i = 0; i < cantidadDeTabs.size(); i++) {
//			System.out.println("la cantidad de string es: " + cantidadDeTabs);
//		}
	}
	/*
	 * public void mouseOver() { Actions action = new Actions(driver);
	 * 
	 * action.moveToElement(convertBytoWebElement(progrLanguageLabel)).perform();
	 * action.moveToElement(convertBytoWebElement(javaButton)).perform(); }
	 */
	
	public void clickJavaButton() {
		clickButton(javaButton);
	}
	

	

}
