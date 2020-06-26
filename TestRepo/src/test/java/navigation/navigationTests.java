package navigation;

import org.testng.annotations.Test;

import base.baseTests;

public class navigationTests extends baseTests{
@Test
public void testNavigator() {
	homepage.ClickDynamicLoading().clickExample1();
	getWindowManager().goBack();
	getWindowManager().goForward();
	getWindowManager().refreshPage();
	getWindowManager().goTo("https://google.com");
}
@Test
public void testSwitchTab() {
	homepage.ClickMultipleWindows().ClickHere();
	getWindowManager().switchToTab("New Window");
}
}
