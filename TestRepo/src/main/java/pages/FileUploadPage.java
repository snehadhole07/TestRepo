package pages;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {
	public WebDriver driver;
	public By Inputfield = By.id("file-upload");
	public By UploadButton = By.id("file-submit");
	public By UploadedFiles=By.id("uploaded-files");

	public FileUploadPage(WebDriver driver) {
		this.driver = driver;
	}

	public void ClickUploadButton() {
		driver.findElement(UploadButton).click();
	}

	public void uploadFile(String absolutePathOfFile) {
		driver.findElement(Inputfield).sendKeys(absolutePathOfFile);
		ClickUploadButton();
	}
	public String getUploadFiles() {
		return driver.findElement(UploadedFiles).getText();
	}
	

	  
	
}
