package toolsqa;

import org.openqa.selenium.By;

public class Tables extends BaseActions{
	private By webTablesText = By.xpath("//span[text()=\"Web Tables\"]");
	private By addUserButton = By.id("addNewRecordButton");
	private By firstNameText = By.id("firstName");
	private By lastNameText = By.id("lastName");
	private By emailText = By.id("userEmail");
	private By ageText = By.id("age");
	private By salaryText = By.id("salary");
	private By departmentText = By.id("department");
	private By submitButton = By.id("submit");
	
	
	//Methods
	public void clickWebTablesButton() {
		clickButton(webTablesText);
	}
	
	public void clickAddUser() {
		scrollJs(addUserButton);
		forceDelay(1000);
		clickButton(addUserButton);
	}
	
	public void firstNameSetText() {
		sendText(firstNameText, "Axel Jacobo");
	}
	
	public void lastNameSetText() {
		sendText(lastNameText, "Arenas Caldera");
	}
	
	public void emailSetText() {
		sendText(emailText, "aaa@gmail.com");
	}
	
	public void ageSetText() {
		sendText(ageText, "27");
	}
	
	public void salarySetText() {
		sendText(salaryText, "1500");
	}
	
	public void departmentSetText() {
		sendText(departmentText, "QA Tester Automation");
	}
	
	public void clickSubmitButton(){
		clickButton(submitButton);
	}
}
