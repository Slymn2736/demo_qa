package demo_qa.pages;


import demo_qa.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Widgets {
    public Widgets(){PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "(//div[@class='card mt-4 top-card'])[4]")
    public WebElement widgetButton;

    @FindBy(xpath = "(//li[@class='btn btn-light '])[22]")
    public WebElement toolTips;

    @FindBy(xpath="//button[@id='toolTipButton']")
    public WebElement toolTipButton;

    @FindBy(xpath="//input[@id='toolTipTextField']")
    public WebElement toolTipTextField;

}
