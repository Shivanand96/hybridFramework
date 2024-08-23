package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PIMPagePOM {


	//span[text()='PIM']                              //PIM Buttom
	@FindBy(xpath = "//span[text()='PIM']")
	private WebElement PIMButton;

	//span[text()='Configuration ']                      // Configuration dropdown
	@FindBy(xpath = "//span[text()='Configuration ']")
	private WebElement Configuration;

	//ul[@class='oxd-dropdown-menu']/li/a                 Whole list under confuguration dropdown

	@FindBy(xpath = "//ul[@class='oxd-dropdown-menu']/li/a")
	private WebElement ConfigurationList;

	// ----------------------------------  Single element in dropdwwn configuration ------------------------------------------------

	//a[text()='Optional Fields']                         //Optional Fields 
	@FindBy(xpath = "//a[text()='Optional Fields']")
	private WebElement optionalField;

	//a[text()='Custom Fields']                            //Custom Fields
	@FindBy(xpath = "//a[text()='Custom Fields']")
	private WebElement customField;

	//a[text()='Custom Fields']                           //Custom Fields
	@FindBy(xpath = "//a[text()='Data Import']")
	private WebElement dataImport;

	//a[text()='Reporting Methods']                         //Reporting Method
	@FindBy(xpath = "//a[text()='Reporting Methods']")
	private WebElement reportingMethod;

	//a[text()='Termination Reasons']                         //Termination Reasons
	@FindBy(xpath = "//a[text()='Termination Reasons']")
	private WebElement terminateProcess;

	//--------------------------------------------------------------------------------------------------------------    

	//a[text()='Employee List']                               //Employee List
	@FindBy(xpath = "Employee List")
	private WebElement employeeList;

	// WebElement Under Employee List 

	//input[@placeholder = 'Type for hints...'][1]
	@FindBy(xpath = "//input[@placeholder = 'Type for hints...'][1]")
	private WebElement employeeName;


	//  (//input[@class='oxd-input oxd-input--active'])[2]             //Employee ID
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	private WebElement employeeId;

	// (//div[@class='oxd-select-text oxd-select-text--active'])[1]     //Employee Status
	@FindBy(xpath = "(//div[@class='oxd-select-text oxd-select-text--active'])[1]")
	private WebElement employeeStatus;

	// (//div[@class='oxd-select-text oxd-select-text--active'])[2]    //include
	@FindBy(xpath = "(//div[@class='oxd-select-text oxd-select-text--active'])[2]")
	private WebElement include;

	// (//input[@placeholder='Type for hints...'])[2]                           //supervisor name
	@FindBy(xpath = "(//input[@placeholder='Type for hints...'])[2]")
	private WebElement supervisorName;

	// (//div[@class='oxd-select-text oxd-select-text--active'])[3]                //job title
	@FindBy(xpath = "(//div[@class='oxd-select-text oxd-select-text--active'])[3]")
	private WebElement jobTitle;

	// (//div[@class='oxd-select-text oxd-select-text--active'])[4]              // Sub Unit
	@FindBy(xpath = "(//div[@class='oxd-select-text oxd-select-text--active'])[4]")
	private WebElement subUnit;

	//button[@type = 'reset']                                                   // Reset Button
	@FindBy(xpath = "//button[@type = 'reset']")
	private WebElement resetButton;


	//button[@type = 'submit']                                                 Submit Button
	@FindBy(xpath = "//button[@type = 'submit']")
	private WebElement submitButton;
	//--------------------------------------------------------------------------------------------------------------------------------------------------                    

	//a[text()='Add Employee']                              //Add Employee
	@FindBy(xpath = "//a[text()='Add Employee']")
	private WebElement addEmplyee;

	//a[text() = 'Reports']                              // Report
	@FindBy(xpath = "//a[text() = 'Reports']")
	private WebElement report;


}