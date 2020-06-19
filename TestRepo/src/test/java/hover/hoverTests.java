package hover;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import base.baseTests;

@Test
public class hoverTests extends baseTests {
	public void testHoveruser1() {
		var HoverPage = homepage.ClickHovers();
		var caption = HoverPage.hoverOverFigure(1);
		assertTrue(caption.isCaptionDisplayed(), "caption not displayed");
		assertEquals(caption.geTitle(), "name: user1", "caption title incorrect");
		assertEquals(caption.getlink(), "View profile", "incorrect link");
		assertTrue(caption.getlink().endsWith("/users/1"), "incorrect link");

	}

}
