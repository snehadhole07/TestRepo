package alerts;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import base.baseTests;

public class alertTests extends baseTests {
	@Test
	public void testalertAccept() {
		var AlertPage = homepage.ClickJavascriptAlerts();
		AlertPage.triggerAlert();
		AlertPage.alert_clickToAccept();
		assertEquals(AlertPage.getResult(), "You successfully clicked an alert");
	}

	/*@Test
	public void testGetTextFromAlert() {
		var AlertPage = homepage.ClickJavascriptAlerts();

		AlertPage.alert_clickToDissmis();
		String text = "I am a JS Confirm";
		assertEquals(AlertPage.alert_getText(),text, "I am a JS Confirm");
	}*/
	@Test
	public void testInputtextInAlert() {
		var AlertPage = homepage.ClickJavascriptAlerts();
		AlertPage.triggerPrompt();
        String text="won";
        AlertPage.alert_SetText(text);
        AlertPage.alert_clickToAccept();
		assertEquals(AlertPage.getResult(),"You entered: "+text);
	}
}
