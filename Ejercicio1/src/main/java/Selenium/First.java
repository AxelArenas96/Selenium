package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class First {

	public static void main(String[] args) {
		//commit 2
		String pathDriver = "src/main/resources/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", pathDriver);
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//driver.findElement(By.id("APjFqb")).sendKeys("Curso de Selenium");
		driver.findElement(By.xpath("//*[@title=\"Buscar\"]")).sendKeys("Curso de Selenium");
	
		//driver.findElement(By.name("btnK")).click();
		//driver.findElement(By.xpath("(//input[@value=\"Buscar con Google\"][@name=\"btnK\"])[2]"));
		driver.findElement(By.xpath("(//input[@name=\"btnK\"])[1]")).click();
		//driver.findElement(By.xpath("//div[ text()=\"Imágenes\"]")).click();
		driver.findElement(By.xpath("//*[text()=\"Imágenes\"]")).click();
		
		
		
		
		/*
		 * List<WebElement> elements = driver.findElements(By.name("btnK"));
		 * 
		 * if(elements.isEmpty()) { System.out.println("El elemento no existe"); } else
		 * { System.out.println("El elemento existe");
		 * driver.findElement(By.name("btnK")).click(); } pausa(2000);
		 */
		pausa(2500);
		driver.quit();		
	}
	
	
	
	//Métodos
	public static void pausa(int tiempo) {
		try {
			Thread.sleep(tiempo);
		} catch (InterruptedException e) {
		}
	}
	
	

}
