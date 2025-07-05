package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class EmployeePage {

    @FindBy( xpath = "//span[text()='Explore demo']")
    WebElement exploreDemoBtn;

    @FindBy( xpath = "//span[normalize-space()='HR']")
    WebElement hrBtn ;

    @FindBy( css = "span[title='Employee']")
    List<WebElement>  employee; // 0

    @FindBy( css = "button[class='btn btn-primary btn-sm primary-action']" )
    List<WebElement> addEmployeeBtn; //0

    @FindBy( css = "input[data-fieldname='first_name']")
    WebElement firstNameTxt;

    @FindBy ( css = "p[title='Male']")
    WebElement gender;

    @FindBy (css = "input[data-fieldname='date_of_birth']")
    WebElement DOB;

    @FindBy (css = "input[data-fieldname='date_of_joining']")
    WebElement joindate;

    @FindBy (css = "button[data-label='Save']")
    WebElement saveBtn;

    public EmployeePage( WebDriver driver ){
        PageFactory.initElements(driver ,this);
    }

    public void addEmployee(){
        exploreDemoBtn.click();
        hrBtn.click();
        employee.get(0).click();
        addEmployeeBtn.get(0).click();
        firstNameTxt.sendKeys("Iffat");
        gender.click();
        DOB.sendKeys("10-12-1995");
        joindate.sendKeys("01-06-2025");
        saveBtn.click();
    }


}
