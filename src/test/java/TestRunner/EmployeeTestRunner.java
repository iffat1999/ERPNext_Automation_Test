package TestRunner;

import Pages.EmployeePage;
import SetUp.setUp;
import org.testng.annotations.Test;

public class EmployeeTestRunner extends setUp {

    @Test( description = " Adding a new employye " )
    public void addEmployeeTest(){

        EmployeePage emp = new EmployeePage(driver);
        emp.addEmployee();

    }


}
