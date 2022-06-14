package demo_qa.pages;

import demo_qa.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

    public Login(){PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//input[@id='user-name']")
    public WebElement userName;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy(xpath ="//input[@type='submit']")
    public WebElement loginButton;

}
