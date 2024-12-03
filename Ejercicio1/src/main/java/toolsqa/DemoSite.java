package toolsqa;

import java.awt.event.ActionEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoSite extends BaseActions{
	private By elementsCardButton = By.xpath("//h5[text() = \"Elements\"]");
	

	
	
	///////////////// Metodos ///////////////////
	public void clickElementsCard() {
		forceDelay(2000);
		scrollJs(elementsCardButton);
		forceDelay(2000);
		clickButton(elementsCardButton);
	}

}
