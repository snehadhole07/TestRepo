package wait;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import base.baseTests;

public class waitTests extends baseTests {
	@Test
	public void testWaitUntilHidden() {
		var loadingpage = homepage.ClickDynamicLoading().clickExample1();
		loadingpage.clickStart();
		assertEquals(loadingpage.getLoadedText(), "Hello World!", "incorrect msg");
	}

}
