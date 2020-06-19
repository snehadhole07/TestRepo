package keys;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import base.baseTests;

public class keysTests extends baseTests {
	@Test
	public void testBackSpace() {
		var Keypage = homepage.ClickKeyPresses();
		Keypage.enterText("A" + Keys.BACK_SPACE);
		assertEquals(Keypage.getResult(), "You entered: BACK_SPACE");

	}
}
