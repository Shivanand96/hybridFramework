package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminPagePOM 
{
	@FindBy(xpath = "//span[text()='Admin']")
	private WebElement adminButton;

	@FindBy(xpath = "//span[text()='User Management ']")
	private WebElement userManagementDropdown;

	@FindBy(xpath = "//a[text()='Users']")
	private WebElement userOption;

	@FindBy(xpath = "//span[text()='Job ']")
	private WebElement jobDropdown;

	@FindBy(xpath = "//a[text()='Job Titles']")
	private WebElement jobTitles;

	@FindBy(xpath = "//a[text()='Pay Grades']")
	private WebElement payGrades;

	@FindBy(xpath = "//a[text()='Employment Status']")
	private WebElement employmentStatus;

	@FindBy(xpath = "//a[text()='Job Categories']")
	private WebElement jobCategories;

	@FindBy(xpath = "//a[text()='Work Shifts']")
	private WebElement workShifts;

	@FindBy(xpath = "//span[text()='Organization ']")
	private WebElement organizationDropdown;

	@FindBy(xpath = "//a[text()='General Information']")
	private WebElement generalInformation;

	@FindBy(xpath = "//a[text()='Locations']")
	private WebElement locations;

	@FindBy(xpath = "//a[text()='Structure']")
	private WebElement structure;

	@FindBy(xpath = "//span[text()='Qualifications ']")
	private WebElement qualificationDropdown;

	@FindBy(xpath = "//a[text()='Skills']")
	private WebElement skills;

	@FindBy(xpath = "//a[text()='Education']")
	private WebElement education;

	@FindBy(xpath = "//a[text()='Licenses']")
	private WebElement licenses;

	@FindBy(xpath = "//a[text()='Languages']")
	private WebElement languages;

	@FindBy(xpath = "//a[text()='Memberships']")
	private WebElement membership;

	@FindBy(xpath = "//a[text()='Nationalities']")
	private WebElement nationalities;

	@FindBy(xpath = "//a[text()='Corporate Branding']")
	private WebElement corporateBranding;

	@FindBy(xpath = "//span[text()='Configuration ']")
	private WebElement configurationdropdown;

	@FindBy(xpath = "//a[text()='Email Configuration']")
	private WebElement emailConfiguration;

	@FindBy(xpath = "//a[text()='Email Subscriptions']")
	private WebElement emailSubscriptions;

	@FindBy(xpath = "//a[text()='Localization']")
	private WebElement localization;

	@FindBy(xpath = "//a[text()='Language Packages']")
	private WebElement languagePackages;

	@FindBy(xpath = "//a[text()='Modules']")
	private WebElement modules;

	@FindBy(xpath = "//a[text()='Social Media Authentication']")
	private WebElement socialMediaAuthentication;

	@FindBy(xpath = "//a[text()='Register OAuth Client']")
	private WebElement registeroEuthClient;

	@FindBy(xpath = "//a[text()='LDAP Configuration']")
	private WebElement ldapConfiguration;

	@FindBy(xpath = "//i[@class='oxd-icon bi-question-lg']")
	private WebElement questionTag;

	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	private WebElement usernameTextField;

	@FindBy(xpath = "(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]")
	private WebElement userRole;

	@FindBy(xpath = "(//div[@class='oxd-select-text-input'])[1]")
	private WebElement userRoleAdmin;

	@FindBy(xpath = "(//div[@class='oxd-select-text oxd-select-text--active'])[1]")
	private WebElement eSS;

	@FindBy(xpath = "//div[@class='oxd-autocomplete-wrapper']")
	private WebElement employeeName;

	@FindBy(xpath = "(//div[@class='oxd-select-text oxd-select-text--active'])[2]")
	private WebElement status;

	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--ghost']")
	private WebElement resetButton;

	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
	private WebElement searchButton;

	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
	private WebElement addButton;



}
