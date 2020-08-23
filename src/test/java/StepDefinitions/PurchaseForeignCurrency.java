package StepDefinitions;

import POM.ForeignCurrencyPage;
import POM.ParentClass;
import cucumber.api.java.en.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;
import java.util.Random;

public class PurchaseForeignCurrency extends ParentClass {

    ForeignCurrencyPage currency = new ForeignCurrencyPage();

    @Then("^Click on Purchase Foreign Currency$")
    public void click_on_Purchase_Foreign_Currency()  {

        clickFunction(currency.foreignCurrency);
    }

    @Then("^Select random currency$")
    public void select_random_currency() {
        Select s1 = new Select(currency.selectCurrency);
        List<WebElement> listOfCurrency = s1.getOptions();
        Random randCurrency = new Random();
        int allCurrency = randCurrency.nextInt(listOfCurrency.size());
        s1.selectByIndex(allCurrency);
    }

    @When("^Enter \"([^\"]*)\" amount$")
    public void enter_amount(String c) {
        currency.currencyAmount.sendKeys(c);
    }

    @Then("^Select radio button for currency$")
    public void select_radio_button_for_currency(){
        clickFunction(currency.US_Dollars);
        clickFunction(currency.purchaseButton);

        String successMsg = currency.successMsg.getText();
        Assert.assertTrue(successMsg.contains("successfully"));
    }

    @Then("^Select radio button for selected currency$")
    public void selectRadioButtonForSelectedCurrency() {
        clickFunction(currency.selectedCurrency);
        clickFunction(currency.purchaseButton);

        String successMsg = currency.successMsg.getText();
        Assert.assertTrue(successMsg.contains("successfully"));
    }
}
