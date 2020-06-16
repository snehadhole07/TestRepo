package login;

import static org.testng.Assert.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.baseTests;
import pages.LoginPage;
import pages.SecureAreaPage;

public class LoginTests extends baseTests{
	@Test
	public void testSuccessfulLogin() {
		LoginPage loginpage=homepage.ClickFormAuthentication();
		loginpage.setUsername("tomsmith");
		loginpage.setPassword("SuperSecretPassword!");
		
		SecureAreaPage secureAreapage=loginpage.ClickLoginButton();
		//System.out.println(secureAreapage.getAlertText());
		//Assert.assertEquals(secureAreapage.getAlertText(),"You logged into a secure area!");
	Assert.assertTrue(secureAreapage.getAlertText().contains("You logged into a secure area!"), "alert is incorrect");
		
	}
	

}
