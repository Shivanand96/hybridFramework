package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BaseClass;

public class LeavePagePOM extends BaseClass {


	@FindBy(xpath="//a[@class='oxd-brand']")
	private WebElement leave;

	@FindBy(xpath="//a[text()='Apply']")
	private WebElement Apply;

	@FindBy(xpath="//a[text()='My Leave']")
	private WebElement Myleave;

	@FindBy(xpath="//li[@class=\"--active oxd-topbar-body-nav-tab --parent\"]")
	private WebElement Entitlements;

	//list of webElemnts //ul[@class='oxd-dropdown-menu']/li

	@FindBy(xpath="//a[text()='Add Entitlements']")
	private WebElement addEntitlements;

	@FindBy(xpath="//a[text()='Employee Entitlements']")
	private WebElement EmployeeEntitlements;

	@FindBy(xpath="//a[text()='My Entitlements']")
	private WebElement MyEntitlements;

	//reports
	@FindBy(xpath="//span[text()='Reports ']")
	private WebElement Reports;

	//ul[@class='oxd-main-menu']//following-sibling::li
	@FindBy(xpath="//a[text()='Leave Entitlements and Usage Report']")
	private WebElement LeaveEntitlements;

	@FindBy(xpath="//a[text()='My Leave Entitlements and Usage Report']")
	private WebElement myLeaveEntitlements;

	//configure
	@FindBy(xpath="//span[text()='Configure ']")
	private WebElement configure;

	//ul[@class='oxd-dropdown-menu']//following-sibling::li
	@FindBy(xpath="//a[text()='Leave Period']")
	private WebElement Leaveperiod;

	@FindBy(xpath="//a[text()='Leave Types']")
	private WebElement LeaveTypes;

	@FindBy(xpath="//a[text()='Work Week']")
	private WebElement workweek;

	//leaveList
	@FindBy(xpath="//a[text()='Leave List']")
	private WebElement leavelist;

	@FindBy(xpath="//a[text()='Assign Leave']")
	private WebElement assignleave;

	@FindBy(xpath="//i[@class='oxd-icon bi-question-lg']")
	private WebElement Help;





	//hide button:(//button[@class='oxd-icon-button'])[2]

	@FindBy(xpath="(//input[@placeholder='yyyy-dd-mm'])[1]")
	private WebElement fromdate;

	@FindBy(xpath="(//input[@placeholder='yyyy-dd-mm'])[2]")
	private WebElement Todate;

	@FindBy(xpath="(//div[@class='oxd-select-text oxd-select-text--active'])[3]")
	private WebElement ShowLeavewithStatus;

	@FindBy(xpath="(//div[@class='oxd-select-text oxd-select-text--active'])[1]")
	private WebElement leaveType;

	@FindBy(xpath="//input[@placeholder='Type for hints...']")
	private WebElement EmployeeName;

	@FindBy(xpath="(//div[@class='oxd-select-text oxd-select-text--active'])[3]")
	private WebElement SubUnit;

	@FindBy(xpath="//span[@class='oxd-switch-input oxd-switch-input--active --label-right']")
	private WebElement IncludePastEmployees;


	@FindBy(xpath="//p[text()=' * Required']")
	private WebElement Required;


	@FindBy(xpath="//button[@type='reset']")
	private WebElement reset;

	@FindBy(xpath="//button[@type='submit']")
	private WebElement submit;


	@FindBy(xpath="//div[@class='orangehrm-container']")
	private WebElement Recordsfound;

	@FindBy(xpath="//div[@class='oxd-layout-footer']")
	private WebElement footer;

}