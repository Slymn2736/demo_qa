package demo_qa.pages;

import demo_qa.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Alerts {
    public Alerts(){PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "(//div[@class='card mt-4 top-card'])[3]")
    public WebElement alertFrameWindows;

    @FindBy(xpath = "(//li[@class='btn btn-light '])[12]")
    public WebElement alertbutton;

    @FindBy(xpath = "//button[@id='alertButton']")
    public WebElement clickMeButton1;

    @FindBy(xpath = "//button[@id='timerAlertButton']")
    public WebElement clickMeButton2;

    @FindBy(xpath = "//button[@id='confirmButton']")
    public WebElement clickMeButton3;

    @FindBy(xpath = "//button[@id='promtButton']")
    public WebElement clickMeButton4;

    @FindBy(xpath = "//span[@id='confirmResult']")
    public WebElement confirm;

    @FindBy(xpath = "//span[@id='promptResult']")
    public WebElement prompt;




}