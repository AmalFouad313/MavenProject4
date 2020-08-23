package StepDefinitions;

import POM.ParentClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Utilitis.Driver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class LoginSteps extends ParentClass {

    @Given("^Navigate to webappsecurity$")
    public void navigate_to_webappsecurity()  {

        driver = Driver.getDriver();
        driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
        driver.get("http://zero.webappsecurity.com/login.html");
        driver.manage().window().maximize();
    }

    @When("^Enter the \"([^\"]*)\" and \"([^\"]*)\"$")
    public void Enter_the_username_and_password(String arg1, String arg2) {

        WebElement username = driver.findElement(By.id("user_login"));
        username.sendKeys(arg1);

        WebElement password = driver.findElement(By.id("user_password"));
        password.sendKeys(arg2);

        WebElement signIn = driver.findElement(By.cssSelector("input[value='Sign in']"));
        signIn.click();

       // driver.findElement(By.id("primary-button")).click();

      //  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

       // driver.switchTo().alert().accept();

    }

    @Then("^User should login successfully$")
    public void User_should_login_successfully()  {

        String currentURL = driver.getCurrentUrl();
        String expectedURL = "http://zero.webappsecurity.com/bank/account-summary.html";
        Assert.assertEquals(currentURL,expectedURL);

    }


}
