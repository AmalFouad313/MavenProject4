package POM;

import Utilitis.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ForeignCurrencyPage {

    public ForeignCurrencyPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(linkText = "Purchase Foreign Currency" )
    public WebElement foreignCurrency;

    @FindBy(id = "pc_currency")
    public WebElement selectCurrency;

    @FindBy(id = "pc_amount")
    public WebElement currencyAmount;

    @FindBy(id = "pc_inDollars_true")
    public WebElement US_Dollars;

    @FindBy(id = "pc_inDollars_false")
    public WebElement selectedCurrency;

    @FindBy(id = "purchase_cash")
    public WebElement purchaseButton;

    @FindBy(id = "alert_content")
    public WebElement successMsg;




//    @FindAll({
//            @FindBy (id = "input[type='radio']")
//    })
//    public List<WebElement> radioButtons;



}
