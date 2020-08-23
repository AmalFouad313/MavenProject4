package POM;

import Utilitis.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Part3POM {

    public Part3POM(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "sp_payee" )
    public WebElement payee;

    @FindBy(id = "sp_account")
    public WebElement account;

    @FindBy(id = "sp_amount")
    public WebElement amount;

    @FindBy(id = "sp_date")
    public WebElement date;

    @FindBy(id = "sp_description")
    public WebElement description;

    @FindBy(id = "pay_saved_payees")
    public WebElement payButton;

    @FindBy(id = "alert_content")
    public WebElement alertMsg;

    @FindBy(css = ".dropdown-toggle>.icon-user")
    public WebElement iconUser;

    @FindBy(id = "logout_link")
    public WebElement logout;





}
