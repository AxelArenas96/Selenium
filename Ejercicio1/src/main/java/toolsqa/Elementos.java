package toolsqa;

import org.openqa.selenium.By;

public class Elementos extends BaseActions{
	//Elementos
	private By textBoxButton = By.xpath("//*[@class = \"text\"][text()=\"Text Box\"]");
	private By userNameText = By.xpath("//input[@id = \"userName\"]");
	private By userEmailText = By.xpath("//input[@id = \"userEmail\"]");
	private By currentAddressText = By.xpath("//textarea[@id = \"currentAddress\"]");
	private By permanentAdressText = By.xpath("//textarea[@id = \"permanentAddress\"]");
	private By submitButton = By.xpath("//button[@id = \"submit\"]");
	
	//VARIABLES
	String user = "Axel Jacobo Arenas Caldera";
	String email = "a@gmail.com";
	String address = "Priv Aldebran 34. Real del sol. Ojo de agua, Tecámac";
	String permanentAddress = "Tecamac";
	
	
	
	
	
	//METODOS
	
	public void clickTextBox() {
		clickButton(textBoxButton);
	}
	
	public void userNameText() {
		scrollJs(userNameText);
		forceDelay(1000);
		sendText(userNameText, user);
		forceDelay(2000);
	}
	public void userEmailText() {
		sendText(userEmailText, email);
	}
	
	public void currentAddressText() {
		sendText(currentAddressText, address);
	}
	
	public void permanentAddressText() {
		sendText(permanentAdressText, permanentAddress);
	}
	
	public void submitButton() {
		clickButton(submitButton);
		forceDelay(1500);
	}
}
