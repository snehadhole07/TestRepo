package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;

public class WindowManager {
	private WebDriver driver;
	private WebDriver.Navigation navigate;

	public WindowManager(WebDriver driver) {
		this.driver = driver;
		navigate = driver.navigate();
	}

	public void goBack() {
		// driver.navigate().back();
		navigate.back();
	}

	public void goForward() {
		// driver.navigate().forward();
		navigate.forward();
	}

	public void refreshPage() {
		navigate.refresh();
	}

	public void goTo(String url) {
		navigate.to(url);
	}
	public void switchToTab(String tabTitles) {
		var windows=driver.getWindowHandles();
		System.out.println("Number of tabs:"+windows.size());
		System.out.println("Windows handles:");
		windows.forEach(System.out::println);
		 
		for(String window:windows) {
			System.out.println("Switching to window"+ windows);	
			driver.switchTo().window(window);
			System.out.println("current window title"+ driver.getTitle());
			
			if(tabTitles.equals(driver.getTitle())) {
				break;
			}
		}
		
		
	}
	
}
