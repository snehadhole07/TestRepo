package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {
	private WebDriver driver;
	private String LinkXpath_Format=".//a[contains(text(),'%s')]";
	private By Link_Example1=By.xpath(String.format(LinkXpath_Format,"Example 1"));
		

	public DynamicLoadingPage(WebDriver driver) {
		this.driver=driver;
		}
	public DynamicExamplePage1 clickExample1() {
		driver.findElement(Link_Example1).click();
		return new DynamicExamplePage1(driver);
	}
	

}
