package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {
	private By FormAuthenticationLink=By.linkText("Form Authentication");
	private WebDriver driver;
	public Homepage(WebDriver driver) {
		this.driver=driver;
	}
	public LoginPage ClickFormAuthentication() {
		driver.findElement(FormAuthenticationLink).click();
		return new LoginPage(driver);
		
	}

}
