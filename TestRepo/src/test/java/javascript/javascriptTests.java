package javascript;

import org.testng.annotations.Test;

import base.baseTests;

public class javascriptTests extends baseTests {
@Test
public void testScrollToTable() {
	homepage.ClickLoadAndDeepDOM().scrollToTable();
}
@Test
public void testScrollToFifthParagraph() {
	homepage.ClickInfinteScroll().scrollToParagraph(5);
}
}
