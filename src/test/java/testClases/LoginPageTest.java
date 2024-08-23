package testClases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseClass;
import pom.LoginPagePOM;

public class LoginPageTest extends BaseClass
{
	@BeforeClass
	public void setUp()
	{
		launchWeb();
	}

	@AfterClass
	public void tearDown()
	{
		driver.close();
	}

	@Test
	public void checkTitle()
	{
		String pagetitle = driver.getTitle();
		if (pagetitle.equalsIgnoreCase("OrangeHRM")) 
		{
			System.out.println("Title is verified");
		}
	}

	@Test
	public void loginWithValidCredentials()
	{
		LoginPagePOM loginpagepom = new LoginPagePOM();
		String username= loginpagepom.getUserName();
		String password= loginpagepom.getPassword();

		loginpagepom.setUsername(username);
		loginpagepom.setPassword(password);

		loginpagepom.loginClick();
	}

}
