package StepDefinitions;

import POM.ParentClass;
import POM.PayBillsPage;
import POM.Part3POM;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class PayBillsSteps extends ParentClass {

    // WebDriver driver;

    PayBillsPage payBillsPage = new PayBillsPage();
    Part3POM pom = new Part3POM();

    @Then("^Click on PayBills and verify URL$")
    public void Click_on_PayBills_and_verify_URL() {
        clickFunction(payBillsPage.payBillsButton);

//        WebDriverWait wait = new WebDriverWait(driver,5);
//        wait.until(ExpectedConditions.)

        //       Thread.sleep(5000);
        String currentURL = driver.getCurrentUrl();
        String expectedURL = "http://zero.webappsecurity.com/bank/pay-bills.html";
        Assert.assertEquals(currentURL, expectedURL);
    }

    @Then("^Add new payee information for payee and account$")
    public void add_new_payee_information_for_payee_and_account() {
        Select p = new Select(pom.payee);
        p.selectByIndex(2);

        Select p2 = new Select(pom.account);
        p2.selectByIndex(2);
    }

    @Then("^Add new payee information \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
    public void add_new_payee_information_and_and(String amt, String date, String desc) {
        pom.amount.sendKeys(amt);
        pom.date.sendKeys(date);
        pom.description.sendKeys(desc);
        System.out.println(pom.amount.getAttribute("value"));
        System.out.println(pom.description.getAttribute("value"));

        pom.payButton.click();

        if (pom.amount.getAttribute("value").isEmpty()){
            System.out.println("empty");
        }else if (pom.date.getAttribute("value").isEmpty()){
            System.out.println("empty");
        }else if (pom.description.getAttribute("value").isEmpty()){
            System.out.println("empty");
        }else {
            String successMsg = pom.alertMsg.getText();
            Assert.assertTrue(successMsg.contains("successfully"));
        }


//        String successMsg = "";
//        try{
//            successMsg = pom.alertMsg.getText();
//        }catch(Exception e){
//            Boolean error = pom.amount.getAttribute("value").isEmpty();
//        }
//        Assert.assertTrue(successMsg.contains("successfully"));
    }

    @Then("^sign out$")
    public void sign_out() {
        pom.iconUser.click();
        pom.logout.click();

    }
}

