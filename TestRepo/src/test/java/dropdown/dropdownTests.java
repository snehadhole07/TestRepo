package dropdown;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import base.baseTests;

public class dropdownTests extends baseTests {
	@Test
	public void testSelectOption()
	{
		
		var dropdownPage=homepage.ClickDropdown();
		String option="Option 2";
	dropdownPage.selectFromDropdown(option);
	var selectedOptions=dropdownPage.getSelectedOptions();
	
// assertEquals(selectedOptions.size(), 2);
 
	assertTrue(selectedOptions.contains(option));
	}
	

}
