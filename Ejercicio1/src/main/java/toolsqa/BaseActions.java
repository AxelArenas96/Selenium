package toolsqa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class BaseActions {
	
	static ChromeDriver driver;
	static WebDriverWait driverWait;

	public static void setUp() {
		String pathDriver = "src/main/resources/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", pathDriver);
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--disable-notifications");
		//Crear el driver
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //tiempo de espera maximo para los elementos
		driverWait = new WebDriverWait(driver, 15); //Pausa especificas que ocurren bajo condiciones esperadas
	}
	
	public static void clickButton(By element) {
		System.out.println("Click al elemento:" +  element);
		driverWait.until(ExpectedConditions.elementToBeClickable(element));//esperar hasta que un elemento sea clicleable
		driver.findElement(element).click();
	}
	
	public static void sendText(By element, String text) {
		System.out.println("Texto enviado: " + text + " a elemento " + element);
		driverWait.until(ExpectedConditions.elementToBeClickable(element));
		driver.findElement(element).sendKeys(text);
		
	}
	
	public static String getText(By element) {
		driverWait.until(ExpectedConditions.elementToBeClickable(element));
		driver.findElement(element).getText(); //obtener texto
		//driver.findElement(element).getAttribute("aria-hiden"); //se obtienen los atributos de un html
		System.out.println("Texto obtenido: " + driver.findElement(element).getText());
		return driver.findElement(element).getText();
	}
	
	public static void goToPage(String url) {
		driver.navigate().to(url);
		
	}
	
	public static void scrollJs(By element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", convertBytoWebElement(element));
	}
	
	public static WebElement convertBytoWebElement(By element) {
		driver.findElement(element);
		return driver.findElement(element);
	}
	
	
	/*public static WebElement convertBytoWebElement(By element) {
		WebElement webElement = driver.findElement(element);
		return webElement;
	}*/
	
	public static void forceDelay(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void stopDriver() { //Cerrar driver
		driver.quit();
	}

}
