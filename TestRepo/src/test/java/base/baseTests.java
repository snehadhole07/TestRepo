package base;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseTests {
	private WebDriver driver;

	public void setUp() {
		// Set the chromediver
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
		driver = new ChromeDriver();
		// launch the application in browser
		driver.get("https://the-internet.herokuapp.com/");
		// print the tiltle of the application
		System.out.println(driver.getTitle());
		// maximize the browser
		driver.manage().window().maximize();
		// Fullscreen the application
		driver.manage().window().fullscreen();
		// print the current browser size
		System.out.println(driver.manage().window().getSize());
		// set the new dimesion or size to the browser
		Dimension d = new Dimension(516, 600);
		driver.manage().window().setSize(d);
		// print the size and verify the size
		System.out.println(driver.manage().window().getSize());
		// close the webdriver instance
		driver.quit();

	}

	public static void main(String args[]) {
		baseTests test = new baseTests();
		test.setUp();

	}
}
