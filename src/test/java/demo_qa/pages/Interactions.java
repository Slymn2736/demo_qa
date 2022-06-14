package demo_qa.pages;

import demo_qa.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Interactions {
    public Interactions(){PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "(//div[@class='card mt-4 top-card'])[5]")
    public WebElement interactionsButton;

    @FindBy(xpath = "(//li[@class='btn btn-light '])[28]")
    public WebElement droppableButton;

    @FindBy(xpath = "//div[@id='draggable']")
    public WebElement draggableBox;

    @FindBy(xpath = "//div[@id='droppable']")
    public WebElement droppableBox;


}
