package fileUpload;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import base.baseTests;

public class fileUploadTests extends baseTests{
	@Test
	public void testFileUpload() {
	 var uploadPage =homepage.ClickFileupload();
	 uploadPage.uploadFile("C:\\Users\\Dell\\git\\TestRepo\\TestRepo\\chromedriver.exe");
	 assertEquals(uploadPage.getUploadFiles(),"chromedriver.exe");
	}
	
	 }
	
	
	


