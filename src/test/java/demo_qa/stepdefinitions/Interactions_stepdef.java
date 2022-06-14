package demo_qa.stepdefinitions;

import demo_qa.pages.Interactions;
import demo_qa.utilities.ConfigReader;
import demo_qa.utilities.Driver;
import demo_qa.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class Interactions_stepdef {

    Interactions interactions = new Interactions();
    Actions actions = new Actions(Driver.getDriver());

    @And("user clicks Interactions button")
    public void userClicksInteractionsButton() {
        interactions.interactionsButton.click();
        ReusableMethods.waitFor(2);
    }
    @Then("user clicks droppable button")
    public void userClicksDroppableButton() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(2);
        interactions.droppableButton.click();
        ReusableMethods.waitFor(2);
    }
    @And("user drag and drop drag me box to the drop me box")
    public void userDragAndDropDragMeBoxToTheDropMeBox() {
        actions.dragAndDrop(interactions.draggableBox, interactions.droppableBox).perform();
    }
    @Then("user verify Dropped!")
    public void userVerifyDropped() {
        Assert.assertEquals(interactions.droppableBox.getText(), ConfigReader.getProperty("droppable"));
        ReusableMethods.waitFor(2);
    }

}
