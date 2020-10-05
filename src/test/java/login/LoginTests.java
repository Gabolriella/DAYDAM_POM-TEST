package login;

import org.testng.annotations.Test;
import pageObjects.DashboardPage;
import setup.SetupTests;

public class LoginTests extends SetupTests {

    //TestNG annotation
    @Test
    //This class extends to the SetupTests as the SetupTests class contains all the setup requirements to run our test
    public void testLogin() throws InterruptedException{
        String username = "TaiwoDevdam";
        loginPage.enterUsername(username);
        loginPage.enterUserPassword("1234abcd");

        //Handler for DashboardPage
        DashboardPage dashboardPage = loginPage.clickLoginBtn();
        dashboardPage.clickTaiwoDevdam();
        loginPage = dashboardPage.clickLogout();
    }

}



