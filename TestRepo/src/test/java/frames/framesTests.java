package frames;

import org.testng.annotations.Test;

import base.baseTests;

public class framesTests extends baseTests{
	@Test
	public void testWysiwyg() {
		var editorPage=homepage.ClickWysiwygEditor();
		editorPage.clearTextArea();
		
		String text1="Hello";
		String text2="test";
		
		editorPage.setTextArea(text1);
		editorPage.clearTextArea();
		editorPage.setTextArea(text2);
		aasertEqulas(editorPage.getTextFromEditor(),text1+text2,"incorrect text");
		
		
	}

	private void aasertEqulas(String textFromEditor, String string, String string2) {
		// TODO Auto-generated method stub
		
	}
	

}
