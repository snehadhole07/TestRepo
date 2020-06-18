package pages;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownPage {
	private WebDriver driver;
	private By dropdown=By.id("dropdown");
	public DropdownPage(WebDriver driver) {
		this.driver=driver;
}
	public void selectFromDropdown(String option) {
		//Select dropdownElement=findDropdownElement();
		//dropdownElement.selectByVisibleText(option);//maintained this with findDropdownElement()
		findDropdownElement().selectByVisibleText(option);
		
	}
	public List<String> getSelectedOptions() {
		
		List<WebElement>selectElements= findDropdownElement().getAllSelectedOptions();
		return selectElements.stream().map(e->e.getText()).collect(Collectors.toList());
		
	
	}
	private Select findDropdownElement()
	{
		return new Select(driver.findElement(dropdown));
	}
}
