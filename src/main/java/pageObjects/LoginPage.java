package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    //In the page class we need the fields that represents the elements on the page and Methods to interact with the element
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    //Using By as a locator for elements
    private By username = By.id("username");

    public void enterUsername(String uName){
        //Find the username element and enter the username
        driver.findElement(username).sendKeys(uName);
    }
    public void enterUserPassword(String pwd){
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys(pwd);
    }
    public DashboardPage clickLoginBtn(){
        driver.findElement(By.xpath("/html/body/div/div/div/div/main/div/div[2]/div/div/div/div[2]/div/div/form/button")).click();
        return new DashboardPage(driver);
    }
}
