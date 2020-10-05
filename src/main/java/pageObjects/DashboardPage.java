package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
    //Create a WebDriver Object for this class
    private WebDriver driver;

    //Create a constructor
    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }
    //Locate elements
    private By TaiwoDevdam = By.xpath("/html/body/div/div/div/div/main/div/div[1]/div[1]/div/div[2]/div[3]/button/p");
    private By logOut = By.linkText("Log Out");

    //Function to instantiate with the element
    public void clickTaiwoDevdam() throws InterruptedException{
        //Wait for 3 seconds before executing the action
        Thread.sleep(30000);
        driver.findElement(TaiwoDevdam).click();
    }
    public LoginPage clickLogout() throws InterruptedException{
        //Wait for 3 seconds before executing the action
        Thread.sleep(30000);
        driver.findElement(logOut).click();
        return new LoginPage(driver);
    }

}
