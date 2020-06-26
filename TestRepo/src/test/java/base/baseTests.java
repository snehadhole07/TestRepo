package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pages.Homepage;
import utils.WindowManager;

public class baseTests {
	private WebDriver driver;
	protected Homepage homepage;
@BeforeClass
	public void setUp() {
		// Set the chromedriver
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
		driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// launch the application in browser
		driver.get("https://the-internet.herokuapp.com/");
		  homepage = new Homepage(driver);
}
		// print the title of the application
		/*
		 * System.out.println(driver.getTitle()); // maximize the browser
		 * driver.manage().window().maximize(); // Fullscreen the application
		 * driver.manage().window().fullscreen(); // print the current browser size
		 * System.out.println(driver.manage().window().getSize()); // set the new
		 * dimension or size to the browser Dimension d = new Dimension(516, 600);
		 * driver.manage().window().setSize(d); // print the size and verify the size
		 * System.out.println(driver.manage().window().getSize()); // close the
		 * Webdriver instance */


		//@AfterClass
		//public void teartown() {
		
		 //driver.quit();
		
		//}

		/*
		 * List<WebElement> allElements = driver.findElements(By.xpath("//*")); //
		 * Identify all the elements on web page
		 * 
		 * int elementsCount = allElements.size(); // Count the total all element on web
		 * page System.out.println("Total Number of All Element on webpage = " +
		 * elementsCount); // Print the total count of all // element on webpage int i =
		 * 0; for (WebElement Element : allElements) { i = i + 1;
		 * System.out.println(Element.getTagName());
		 * System.out.println(Element.getText());
		 * 
		 * }
		 */

		/*
		 * List<WebElement> links=driver.findElements(By.tagName("a"));
		 * System.out.println(links.size());
		 * 
		 * 
		 * 
		 * for(WebElement link:links){ System.out.println(link.getText() + " - " +
		 * link.getAttribute("href")); }
		 */

		/*
		 * List<WebElement> boxes = driver.findElements(By.className("checkbox"));
		 * System.out.println( boxes.size());
		 */

		/*List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@type='Checkbox']"));
		for (int i = 0; i < checkBoxes.size(); i = i + 2) {
			checkBoxes.get(i).click();
		}
		int checkedCount = 0, uncheckedCount = 0;
		for (int i = 0; i < checkBoxes.size(); i++) {
			System.out.println(i + " checkbox is selected " + checkBoxes.get(i).isSelected());
			if (checkBoxes.get(i).isSelected()) {
				checkedCount++;
			} else {
				uncheckedCount++;
			}
		}
		System.out.println("number of selected checkbox: " + checkedCount);
		System.out.println("number of unselected checkbox: " + uncheckedCount);
	}*/
		
		/*List  textboxes=driver.findElements(By.xpath("//input[@type='text'[@class='inputtext']"));
		System.out.println("total textboxes "+textboxes.size());*/
		
		
		/*List  totaliFrames=driver.findElements(By.tagName("iframe"));
		System.out.println("total links "+totaliFrames.size());*/
		
		/*List dropdown=driver.findElements(By.tagName("select"));
		System.out.println("total dropdown lists "+dropdown.size());*/
		
				



	public static void main(String args[]) {
		baseTests test = new baseTests();
		test.setUp();
	}
	public WindowManager getWindowManager() {
		return new WindowManager(driver);
		
	}
	
}
	
	

