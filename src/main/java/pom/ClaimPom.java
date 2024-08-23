package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClaimPom {

	@FindBy(xpath="//span[text()=\"Configuration \"]")
	private WebElement Configration;

	@FindBy(xpath = "//a[text()=\"Events\"]")
	private WebElement Event;

	@FindBy(xpath = "//a[text()=\"Expense Types\"]")
	private WebElement ExpenseTypes;

	@FindBy(xpath = "//a[text()=\"Submit Claim\"]")
	private WebElement submitClaim;

	@FindBy(xpath = "//a[text()=\"My Claims\"]")
	private WebElement Myclaims;

	@FindBy(xpath = "//a[text()=\"Employee Claims\"]")
	private WebElement EmployeeClaim;

	@FindBy(xpath = "//a[text()=\"Assign Claim\"]")
	private WebElement AssignClaim;

	@FindBy(xpath = "(//input[@placeholder=\"Type for hints...\"])[1]")
	private WebElement Employename;

	@FindBy(xpath = "(//input[@placeholder=\"Type for hints...\"])[2]")
	private WebElement ReferanceId;

	@FindBy(xpath = "(//div[@class=\"oxd-select-text-input\"])[1]")
	private WebElement Eventname;

	@FindBy(xpath = "//div[text()=\"Accommodation\"]")
	private WebElement Accommodation;

	@FindBy(xpath = "//div[text()=\"Medical Reimbursement\"]")
	private WebElement medicalReimbursement;

	@FindBy(xpath = "//div[text()=\"Travel Allowance\"]")
	private WebElement travelAllownce;


	@FindBy(xpath = "(//div[@class=\"oxd-select-text-input\"])[2]")
	private WebElement status;

	@FindBy(xpath = "(//div[text()=\"Initiated\"])[1]") 
	private WebElement initiated;

	@FindBy(xpath = "(//div[text()=\"Submitted\"])[1]")	
	private WebElement submitted;

	@FindBy(xpath = "(//div[text()=\"Approved\"])[1]")	
	private WebElement Aproved;

	@FindBy(xpath = "(//div[text()=\"Rejected\"])[1]")	
	private WebElement rejected;

	@FindBy(xpath = "(//div[text()=\"Cancelled\"])[1]")
	private WebElement canceled;

	@FindBy(xpath = "(//input[@placeholder='yyyy-dd-mm'])[1]")
	private WebElement fromDate1;

	@FindBy(xpath = "(//input[@placeholder='yyyy-dd-mm'])[2]")	
	private WebElement todate2;	

	@FindBy(xpath = "//div[text()=\"Current Employees Only\"]")
	private WebElement currentEmployee;

	@FindBy(xpath = "//div[text()=\"Past Employees Only\"]")
	private WebElement pastemployee;

	@FindBy(xpath = "//button[text()=\" Reset \"]")
	private WebElement Reset;

	@FindBy(xpath = "//button[text()=\" Search \"]")	
	private WebElement Search;

	@FindBy(xpath = "//button[text()=\" Assign Claim \"]")
	private WebElement Assignclaim;



}