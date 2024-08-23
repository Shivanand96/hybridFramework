package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class LoginPagePOM extends BaseClass 
{
	public LoginPagePOM()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//p[text()='Username : Admin']")
	private WebElement usernameText;


	@FindBy(xpath = "//p[text()='Password : admin123']")
	private WebElement passwordText;


	@FindBy(xpath = "//input[@name='username']")
	private WebElement usernameTextBox;


	@FindBy(xpath = "//input[@name='password']")
	private WebElement passwordTextBox;


	@FindBy(xpath = "//button[text()=' Login ']")
	private WebElement loginButton;


	@FindBy(xpath = "//p[text()='Forgot your password? ']")
	private WebElement forgotPasswordLink;

	public String getUserName()
	{
		String text=usernameText.getText();
		return text.substring(text.indexOf("A"));
	}
	
	public String getPassword()
	{
		String text=passwordText.getText();
		return text.substring(text.lastIndexOf('a'));
	}
	
	public void setUsername(String usernameText)
	{
		usernameTextBox.sendKeys(usernameText);
	}
	
	public void setPassword(String passwordText)
	{
		passwordTextBox.sendKeys(passwordText);
	}
	
	public void loginClick()
	{
		loginButton.click();
	}
	
	public void forgotPassword()
	{
		forgotPasswordLink.click();
	}
	}



