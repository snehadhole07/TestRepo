package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class InfinteScrollPage {

	private WebDriver driver;
	private By textBlocks = By.className("jscroll-added");

	public InfinteScrollPage(WebDriver driver) {
		this.driver = driver;
	}

	/*
	 * scroll until paragraph with index specified is in view
	 * 
	 * @param index is 1-based
	 */
	public void scrollToParagraph(int index) {
		String script = "window.scrollTo(0,document.body.scrollHieght)";
		var jsExecutor = (JavascriptExecutor) driver;

		while (getNumberOfParagraphsPresent() < index) {
			jsExecutor.executeScript(script);
		}
		}

	private int getNumberOfParagraphsPresent() {
		return driver.findElements(textBlocks).size();

	}

}
