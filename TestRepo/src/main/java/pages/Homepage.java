package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {
	// private By FormAuthenticationLink=By.linkText("Form Authentication");
	// //removed after implementing generic method linkText
	private WebDriver driver;

	public Homepage(WebDriver driver) {
		this.driver = driver;
	}

	public LoginPage ClickFormAuthentication() {
		// driver.findElement(FormAuthenticationLink).click();
		clickLink("Form Authentication");

		return new LoginPage(driver);

	}

	private void clickLink(String linkText) {
		driver.findElement(By.linkText(linkText)).click();
	}

	public DropdownPage ClickDropdown() {
		clickLink("Dropdown");
		return new DropdownPage(driver);
	}

	public HoverPage ClickHovers() {
		clickLink("Hovers");
		return new HoverPage(driver);
	}

	public KeyPressesPage ClickKeyPresses() {
		clickLink("Key Presses");
		return new KeyPressesPage(driver);
	}

	public AlertPage ClickJavascriptAlerts() {
		clickLink("JavaScript Alerts");
		return new AlertPage(driver);
	}

	public FileUploadPage ClickFileupload() {
		clickLink("File Upload");
		return new FileUploadPage(driver);
	}

	public WysiwygEditorPage ClickWysiwygEditor() {
		clickLink("WYSIWYG Editor");
		return new WysiwygEditorPage(driver);
	}
}
