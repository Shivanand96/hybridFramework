package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class RecruitmentPagePom extends BaseClass {

	public RecruitmentPagePom(){
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//div[@class='oxd-topbar-header-title']")
	private WebElement Recruitment;

	@FindBy(xpath="//a[text()='Candidates']")
	private WebElement Candidates;

	@FindBy(xpath="(//div[contains(text(),'-- Select --')])[1] ")
	private WebElement JobTitle;


	@FindBy(xpath="(//div[@class='oxd-select-text-input'])[2]")
	private WebElement Vacancy;



	@FindBy(xpath="(//div[@class='oxd-select-text-input'])[3]")
	private WebElement HiringManager;


	@FindBy(xpath="(//div[@class='oxd-select-text-input'])[4]")
	private WebElement Status;



	@FindBy(xpath="//input[@placeholder='Type for hints...']")
	private WebElement CandidateName;



	@FindBy(xpath="//input[@placeholder='Enter comma seperated words...']")
	private WebElement KeyWords;



	@FindBy(xpath="//input[@placeholder='From']")
	private WebElement DateOfApplicationFrom;


	@FindBy(xpath="//input[@placeholder='To']")
	private WebElement DateOfApplicatioTo;



	@FindBy(xpath="(//div[@class='oxd-select-text-input'])[5]")
	private WebElement MethodOfApplication;


	@FindBy(xpath="//button[@type='reset']")
	private WebElement ResetButton;


	@FindBy(xpath="//button[@type='submit']")
	private WebElement SubmitButton;

	@FindBy(xpath="//a[text()='Vacancies']")
	private WebElement Vacancies;

	@FindBy(xpath="(//div[@clear='false'])[1]")
	private WebElement VacanciesStatus;

}